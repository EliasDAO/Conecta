package br.com.projeto.conecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.conecta.domain.HabilidadesEspecificas;

@Repository
public interface HabilidadesEspecificasRepository extends JpaRepository<HabilidadesEspecificas, Integer>{

}