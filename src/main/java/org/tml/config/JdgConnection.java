/*
 * created by Soumya Gupta
 */
package org.tml.config;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.client.hotrod.marshall.ProtoStreamMarshaller;
import org.infinispan.protostream.SerializationContext;
import org.infinispan.protostream.annotations.ProtoSchemaBuilder;
import org.infinispan.query.remote.client.ProtobufMetadataManagerConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tml.esb.AccountExtractResponse;

import java.io.IOException;

/**
 * @author Digvijay Singh
 */
@Component
public class JdgConnection {

    @Autowired
    JdgProperties jdgProperties;

    /*
     * Connection references
     */
    private static ConfigurationBuilder builder = new ConfigurationBuilder();
    private static RemoteCacheManager cacheManager;
    private static RemoteCache<Integer, Object> cache;
    private static Logger logger = LoggerFactory.getLogger(JdgConnection.class);

    /*
     * Method to get Cache from Cache Manager JDG
     */
    public RemoteCache<Integer, Object> getCache(String cacheName) throws Exception {

        logger.info("Entering method RemoteCache with cache Name:{}", cacheName);
        logger.info("Properties with values {} , {}", jdgProperties.getHostname(), jdgProperties.getPort());

        try {

            builder.addServer().host(jdgProperties.getHostname()).port(Integer.parseInt(jdgProperties.getPort()));
            cacheManager = new RemoteCacheManager(builder.marshaller(new ProtoStreamMarshaller()).build());
            getCustomSerialiazedCache();
            cache = cacheManager.getCache(cacheName);
            cache.clear();
            RemoteCache<String, String> metadataCache = cacheManager.getCache(ProtobufMetadataManagerConstants.PROTOBUF_METADATA_CACHE_NAME);
            String errors = metadataCache.get(ProtobufMetadataManagerConstants.ERRORS_KEY_SUFFIX);
            if (errors != null) {
                throw new Exception("Error in proto " + errors);
            }

        } catch (Exception e) {
            logger.error("Exception occured in method RemoteCache with exception :{}", e);
            throw new Exception("Exception occurred in method RemoteCache with exception e");
        }

        logger.info("Entering method RemoteCache with cache Name:{}", cacheName);
        return cache;
    }


    private static String getCustomSerialiazedCache() throws IOException {
        SerializationContext ctx = null;
        String generatedSchema = null;
        ProtoSchemaBuilder protoSchemaBuilder = null;
        try {
            ctx = ProtoStreamMarshaller.getSerializationContext(cacheManager);
            protoSchemaBuilder = new ProtoSchemaBuilder();
            generatedSchema = protoSchemaBuilder.fileName("accountExtractResponse.proto").packageName("domain")
                    .addClass(AccountExtractResponse.class).build(ctx);
            RemoteCache<String, String> metadataCache = cacheManager
                    .getCache(ProtobufMetadataManagerConstants.PROTOBUF_METADATA_CACHE_NAME);
            metadataCache.put("accountExtractResponse.proto", generatedSchema);

        } catch (Exception e1) {

            StringBuilder sb = new StringBuilder();
            sb.append("No schema generated because of Exception");
            logger.error(sb.toString(), e1);

        }
        return generatedSchema;
    }

}
