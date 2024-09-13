package com.produto.service.produto_microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.produto.service.produto_microservice.dto.ProdutoDto;
import com.produto.service.produto_microservice.tables.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{
    List<ProdutoDto> findByNomeContainingAllIgnoreCaseOrderByNome(String nome);
}
