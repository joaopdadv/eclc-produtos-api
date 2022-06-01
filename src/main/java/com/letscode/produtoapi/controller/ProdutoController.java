package com.letscode.produtoapi.controller;

import com.letscode.produtoapi.domain.ProdutoEntity;
import com.letscode.produtoapi.domain.ProdutoRequest;
import com.letscode.produtoapi.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping("/add")
    public @ResponseBody String createProduto(
            @RequestBody ProdutoRequest request
    ){
        String response = produtoService.createProduto(request);

        return response;
    }

    @GetMapping
    public @ResponseBody List<ProdutoEntity> getAll(){
        return produtoService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoEntity> getProdutoById(
            @PathVariable Integer id
    ){
        ProdutoEntity entity = produtoService.getById(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(entity);
    }

}
