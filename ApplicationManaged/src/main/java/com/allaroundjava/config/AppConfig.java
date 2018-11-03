package com.allaroundjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class AppConfig {
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean localEmfBean = new LocalEntityManagerFactoryBean();
        localEmfBean.setPersistenceUnitName("hibernateSpring");
        return localEmfBean;
    }
}
