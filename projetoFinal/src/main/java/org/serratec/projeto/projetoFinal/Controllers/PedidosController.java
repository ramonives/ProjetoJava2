package org.serratec.projeto.projetoFinal.Controllers;

import java.util.List;
import java.util.Optional;

import org.serratec.projeto.projetoFinal.Entidades.Pedidos;
import org.serratec.projeto.projetoFinal.Repositorios.PedidosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/projeto")
public class PedidosController {
	
	@Autowired
	PedidosRepositorio pedidosRepositorio;
	
	@GetMapping("/pedidos")
	public List<Pedidos> listaPedidos() {
		return pedidosRepositorio.findAll();
	}

	@GetMapping("/pedidos/{id}")
	public Optional<Pedidos> listaPedidosId(@PathVariable(value = "id") Integer id) {
		return pedidosRepositorio.findById(id);
	}

	@PostMapping("/pedidos")
	public Pedidos salvaPedidos(@RequestBody Pedidos pedidos) {
		return pedidosRepositorio.save(pedidos);
	}
	
	@PutMapping("/pedidos")
	public Pedidos atualizaPedidos (@RequestBody Pedidos pedidos) {
		return pedidosRepositorio.save(pedidos);
	}	

	@DeleteMapping("/pedidos/{id}")
	public void deletePedidos(@PathVariable Integer id) {
		pedidosRepositorio.deleteById(id);
	}
	
	

}
