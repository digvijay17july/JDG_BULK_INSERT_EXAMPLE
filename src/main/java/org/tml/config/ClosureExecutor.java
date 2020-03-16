package org.tml.config;

import groovy.util.ConfigObject;
import groovy.util.ConfigSlurper;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class ClosureExecutor {

    public String getFile(String configurationFile) throws IOException {

        String file=FileUtils.readFileToString(new File(configurationFile), "UTF-8");
        return file;
    }
}
