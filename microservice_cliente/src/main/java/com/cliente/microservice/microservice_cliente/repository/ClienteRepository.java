package com.cliente.microservice.microservice_cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cliente.microservice.microservice_cliente.table.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
