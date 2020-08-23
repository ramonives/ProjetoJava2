package org.serratec.projeto.projetoFinal.Repositorios;

import java.util.Optional;

import org.serratec.projeto.projetoFinal.Entidades.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepositorio extends JpaRepository<Pedidos, Integer>{
	
	Optional<Pedidos> findById(Integer id);

}
