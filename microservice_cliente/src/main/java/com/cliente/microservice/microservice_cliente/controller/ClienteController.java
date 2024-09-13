package com.cliente.microservice.microservice_cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.microservice.microservice_cliente.dto.ClienteDto;
import com.cliente.microservice.microservice_cliente.serivce.ClienteService;

@CrossOrigin("*")
@RequestMapping("/cliente")
@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;
    

    @PostMapping("cadastrar")
    public ClienteDto cadastrarCliente(@RequestBody ClienteDto cliente){
        return clienteService.salvarCliente(cliente);
    }
    
}
