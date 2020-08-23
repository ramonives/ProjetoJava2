package org.serratec.projeto.projetoFinal.Repositorios;

import java.util.Optional;

import org.serratec.projeto.projetoFinal.Entidades.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionariosRepositorio extends JpaRepository<Funcionarios, Integer>{
	
	Optional<Funcionarios> findById(Integer id);
	

}
