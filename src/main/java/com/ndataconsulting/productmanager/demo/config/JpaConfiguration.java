package com.ndataconsulting.productmanager.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages={"com.ndataconsulting.productmanager.demo.repository"})
public class JpaConfiguration {

}
