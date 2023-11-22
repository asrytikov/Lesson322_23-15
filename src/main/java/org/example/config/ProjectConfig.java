package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.service", "org.example.repository", "org.example.processors"})
public class ProjectConfig {
}
