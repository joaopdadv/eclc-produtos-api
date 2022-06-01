package com.letscode.produtoapi.domain;

import lombok.Data;

@Data
public class ProdutoRequest {
    private String nome;
    private String descricao;
    private Double preco;
}
