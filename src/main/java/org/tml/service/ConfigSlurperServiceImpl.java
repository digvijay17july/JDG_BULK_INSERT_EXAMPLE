package org.tml.service;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import groovy.util.ConfigObject;
import groovy.util.ConfigSlurper;
import groovy.util.GroovyScriptEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.tml.config.ClosureExecutor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;

@Service
public class ConfigSlurperServiceImpl implements ConfigSlurperService {

    @Autowired
    ClosureExecutor closureExecutor;

    @Override
    public ConfigObject getConfigObjects(String filePath) throws IOException {
        ConfigSlurper configSlurper = new ConfigSlurper();

        ConfigObject configObject = configSlurper.parse(closureExecutor.getFile(filePath));
        return configObject;
    }
}
