package com.produto.service.produto_microservice.service;

import java.util.stream.Collectors;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produto.service.produto_microservice.dto.ProdutoDto;
import com.produto.service.produto_microservice.repository.ProdutoRepository;
import com.produto.service.produto_microservice.tables.Produto;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoDto> getProdutos(){
        return produtoRepository.findAll().stream().map(produto -> new ProdutoDto(produto.getId(),produto.getNome(), produto.getPrice())).collect(Collectors.toList());
    }   

    public ProdutoDto saveProduto(ProdutoDto produtoDto){
        Produto produto = new Produto();

        produto.setId(produtoDto.id());
        produto.setNome(produtoDto.nome());
        produto.setPrice(produtoDto.price());
        Produto produtoDb = produtoRepository.save(produto);

        return new ProdutoDto(produtoDb.getId(), produtoDb.getNome(), produtoDb.getPrice());

    }

    public ProdutoDto getProdutoById(Long id){
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return new ProdutoDto(produto.getId(), produto.getNome(), produto.getPrice());
    }

    public void deleteById(Long id){
        produtoRepository.deleteById(id);
    }

}