package org.serratec.projeto.projetoFinal.Controllers;

import java.util.List;
import java.util.Optional;

import org.serratec.projeto.projetoFinal.Entidades.Clientes;
import org.serratec.projeto.projetoFinal.Repositorios.ClientesRepositorio;
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
public class ClientesController {
	
	@Autowired
	ClientesRepositorio clientesRepositorio;
	
	@GetMapping("/clientes")
	public List<Clientes> listaClientes() {
		return clientesRepositorio.findAll();
	}

	@GetMapping("/clientes/{id}")
	public Optional<Clientes> listaClientesId(@PathVariable(value = "id") Integer id) {
		return clientesRepositorio.findById(id);
	}

	@PostMapping("/clientes")
	public Clientes salvaClientes(@RequestBody Clientes clientes) {
		return clientesRepositorio.save(clientes);
	}
	
	@PutMapping("/clientes")
	public Clientes atualizaClientes (@RequestBody Clientes clientes) {
		return clientesRepositorio.save(clientes);
	}	

	@DeleteMapping("/clientes/{id}")
	public void deleteClientes(@PathVariable Integer id) {
		clientesRepositorio.deleteById(id);
	}

}
