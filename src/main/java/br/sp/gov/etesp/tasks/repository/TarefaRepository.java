package br.sp.gov.etesp.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sp.gov.etesp.tasks.model.Tarefa;

@Repository 
	public interface TarefaRepository extends JpaRepository<Tarefa , Long>{

}
