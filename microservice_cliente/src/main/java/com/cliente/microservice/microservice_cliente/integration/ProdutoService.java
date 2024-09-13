package com.cliente.microservice.microservice_cliente.integration;

import org.springframework.stereotype.Service;

import com.cliente.microservice.microservice_cliente.integration.client.ProdutoClient;
import com.cliente.microservice.microservice_cliente.integration.dto.ProdutoDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoClient produtoClient;

    public void create(ProdutoDto produto) {
        produtoClient.create(produto);
    }
}
