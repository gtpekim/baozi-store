package br.com.gustavo.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gustavo.baozistore.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}