package io.github.antonimattei;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "applicationName")
    public String applicationName() {
        return "Sistemas de Vendas";
    }
}
