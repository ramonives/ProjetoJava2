package org.serratec.projeto.projetoFinal.Controllers;

import java.util.List;
import java.util.Optional;

import org.serratec.projeto.projetoFinal.Entidades.Funcionarios;
import org.serratec.projeto.projetoFinal.Repositorios.FuncionariosRepositorio;
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
public class FuncionariosController {
	
	@Autowired
	FuncionariosRepositorio funcionariosRepositorio;
	
	@GetMapping("/funcionarios")
	public List<Funcionarios> listaFuncionarios() {
		return funcionariosRepositorio.findAll();
	}

	@GetMapping("/funcionarios/{id}")
	public Optional<Funcionarios> listaFuncionariosId(@PathVariable(value = "id") Integer id) {
		return funcionariosRepositorio.findById(id);
	}

	@PostMapping("/funcionarios")
	public Funcionarios salvaFuncionarios(@RequestBody Funcionarios funcionarios) {
		return funcionariosRepositorio.save(funcionarios);
	}
	
	@PutMapping("/funcionarios")
	public Funcionarios atualizaFuncionarios (@RequestBody Funcionarios funcionarios) {
		return funcionariosRepositorio.save(funcionarios);
	}	

	@DeleteMapping("/funcionarios/{id}")
	public void deleteFuncionarios(@PathVariable Integer id) {
		funcionariosRepositorio.deleteById(id);
	}
	
	
	
	

}
