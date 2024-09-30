package com.cliente.microservice.microservice_cliente.integration.client;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import feign.Feign;
import feign.slf4j.Slf4jLogger;

@Component
public class ProdutoClientConfig {
    @Bean
    public ProdutoClient produtoClient() {
        return Feign.builder()
   //         .decoder(new JacksonDecoder())
  //          .encoder(new JacksonEncoder())
            .logger(new Slf4jLogger(ProdutoClient.class))
            .logLevel(Logger.Level.FULL)
            .target(ProdutoClient.class, "http://localhost:8081");
    }
}
