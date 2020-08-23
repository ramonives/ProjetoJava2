package org.serratec.projeto.projetoFinal.Repositorios;

import java.util.Optional;

import org.serratec.projeto.projetoFinal.Entidades.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepositorio extends JpaRepository<Categorias, Integer>{
	
	Optional<Categorias> findById(Integer id);

}
