/**
 * Copyright 2005-2018 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.tml;

import groovy.util.ConfigObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;
import org.tml.config.ClosureExecutor;

import java.io.IOException;

/**
 * A spring-boot application that includes a Camel route builder to setup the
 * Camel routes
 */
@ComponentScan
@SpringBootApplication
public class Application{
    private static Logger logger = LoggerFactory.getLogger(Application.class);
    @Autowired
    private ApplicationContext appContext;

    @Autowired
    ClosureExecutor closureExecutor;

    public static void main(String[] args) {
        logger.info("Starting Server ************************");
        SpringApplication.run(Application.class, args);
    }

//    //    Method to run Cron Job every 24 hr midnight
//    @Scheduled(cron = "* * * * * ?")
//    public void run(String args[]) throws IOException {
//
//        ConfigObject configObject = closureExecutor.getFile("config.groovy");
//        System.out.println("Entry Set is : " + configObject.entrySet());
//    }

}
