package com.produto.service.produto_microservice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.service.produto_microservice.dto.ProdutoDto;
import com.produto.service.produto_microservice.service.ProdutoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoService produtoService;


    @GetMapping
    public List<ProdutoDto> getAgendas() {
        return produtoService.getProdutos();
    }

    @GetMapping("/{id}")
    public ProdutoDto getProduto(@PathVariable Long id) {
        return produtoService.getProdutoById(id);
    }

    @PostMapping("/salvar")
    public ProdutoDto saveAgenda(@RequestBody ProdutoDto produtoDto) {
        return produtoService.saveProduto(produtoDto);
    }

}
