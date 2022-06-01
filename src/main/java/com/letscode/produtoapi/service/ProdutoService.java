package com.letscode.produtoapi.service;

import com.letscode.produtoapi.domain.ProdutoEntity;
import com.letscode.produtoapi.domain.ProdutoRequest;
import com.letscode.produtoapi.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public String createProduto(ProdutoRequest request){
        ProdutoEntity entity = new ProdutoEntity();
        entity.setNome(request.getNome());
        entity.setDescricao(request.getDescricao());
        entity.setPreco(request.getPreco());

        produtoRepository.save(entity);

        return "Salvo";
    }

    public List<ProdutoEntity> getAll(){
        return (List<ProdutoEntity>) produtoRepository.findAll();
    }

    public ProdutoEntity getById(Integer id){
        return produtoRepository.findById(id).get();
    }

}
