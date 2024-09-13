package com.cliente.microservice.microservice_cliente.integration.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.cliente.microservice.microservice_cliente.integration.dto.ProdutoDto;

import feign.RequestLine;

@FeignClient(name = "produto-service")
public interface ProdutoClient {
    @RequestLine("POST /produto")// url 
    void create(ProdutoDto produto);
}
