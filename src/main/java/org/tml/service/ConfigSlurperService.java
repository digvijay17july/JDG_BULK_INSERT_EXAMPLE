package org.tml.service;

import groovy.util.ConfigObject;

import java.io.IOException;

public interface ConfigSlurperService {

    ConfigObject getConfigObjects(String filePath) throws IOException;
}
