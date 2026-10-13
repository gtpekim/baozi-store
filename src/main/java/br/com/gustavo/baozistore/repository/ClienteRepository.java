package br.com.gustavo.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gustavo.baozistore.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}