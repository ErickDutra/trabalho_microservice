package com.cliente.microservice.microservice_cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.microservice.microservice_cliente.dto.ClienteDto;
import com.cliente.microservice.microservice_cliente.serivce.ClienteService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@CrossOrigin("*")
@RequestMapping("/cliente")
@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;
    

    @PostMapping("/cadastrar")
    public ClienteDto cadastrarCliente(@RequestBody ClienteDto cliente){
        return clienteService.salvarCliente(cliente);
    }

    @GetMapping("/getById/{id}")
    public ClienteDto getMethodName(@PathVariable String id) { 
        return clienteService.buscarClientePorId(Long.parseLong(id));
    }

    @PutMapping("/editar")
    public ClienteDto editarCliente(@RequestBody ClienteDto cliente){
        return clienteService.editarCliente(cliente);
    }
    @PostMapping("/deletar")
    public void deletarCliente(@RequestParam String id){
        clienteService.deletarClientePorId(Long.parseLong(id));
    }
}
