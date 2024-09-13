package com.cliente.microservice.microservice_cliente.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliente.microservice.microservice_cliente.dto.ClienteDto;
import com.cliente.microservice.microservice_cliente.repository.ClienteRepository;
import com.cliente.microservice.microservice_cliente.table.Cliente;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    private ProdutoSErvicoe produtoservice;
    

    public ClienteDto salvarCliente(ClienteDto clienteDto) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDto.nome());
        cliente.setCpf(clienteDto.cpf());
        cliente.setEmail(clienteDto.email());
        Cliente clienteSalvo = clienteRepository.save(cliente);
        produtoSErvice.create(produto);
        return new ClienteDto(clienteSalvo.getId(), clienteSalvo.getNome(), clienteSalvo.getCpf(), clienteSalvo.getEmail());
    }

    public ClienteDto buscarClientePorId(Long id) {
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        return new ClienteDto(cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getEmail());
    }

    public void deletarClientePorId(Long id) {
        clienteRepository.deleteById(id);
    }
    
}
