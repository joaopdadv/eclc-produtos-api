package com.letscode.produtoapi.repository;

import com.letscode.produtoapi.domain.ProdutoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<ProdutoEntity, Integer> {
}
