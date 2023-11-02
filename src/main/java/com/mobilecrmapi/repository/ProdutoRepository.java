package com.mobilecrmapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilecrmapi.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
