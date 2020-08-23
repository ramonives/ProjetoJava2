package org.serratec.projeto.projetoFinal.Repositorios;



import java.util.Optional;

import org.serratec.projeto.projetoFinal.Entidades.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepositorio extends JpaRepository<Produtos, Integer> {
	
	Optional<Produtos> findById(Integer id);

}
