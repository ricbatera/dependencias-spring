package com.ricardo.banco_de_dados.repository;

import com.ricardo.banco_de_dados.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository  extends JpaRepository<Carro, Long> {

}
