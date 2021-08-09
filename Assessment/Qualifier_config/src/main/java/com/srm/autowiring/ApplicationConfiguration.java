package com.srm.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.srm.autowiring.DemoManager;
import com.srm.autowiring.DemoManagerImpl;

@Configuration
public class ApplicationConfiguration {

    @Bean(name = "demoService")
    public DemoManager helloWorld() {
        return new DemoManagerImpl();
    }

}
