package org.serratec.projeto.projetoFinal.Repositorios;

import java.util.Optional;

import org.serratec.projeto.projetoFinal.Entidades.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepositorio extends JpaRepository<Clientes, Integer>{
	
	Optional<Clientes> findById(Integer id);

}
