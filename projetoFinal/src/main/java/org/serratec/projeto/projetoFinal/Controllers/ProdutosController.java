package org.serratec.projeto.projetoFinal.Controllers;

import java.util.List;
import java.util.Optional;

import org.serratec.projeto.projetoFinal.Entidades.Produtos;
import org.serratec.projeto.projetoFinal.Repositorios.ProdutosRepositorio;
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
public class ProdutosController {

	@Autowired
	ProdutosRepositorio produtosRepositorio;

	@GetMapping("/produtos")
	public List<Produtos> listaProdutos() {
		return produtosRepositorio.findAll();
	}

	@GetMapping("/produtos/{id}")
	public Optional<Produtos> listaProdutosId(@PathVariable(value = "id") Integer id) {
		return produtosRepositorio.findById(id);
	}

	@PostMapping("/produtos")
	public Produtos salvaProdutos(@RequestBody Produtos produtos) {
		return produtosRepositorio.save(produtos);
	}
	
	@PutMapping("/produtos")
	public Produtos atualizaProdutos (@RequestBody Produtos produtos) {
		return produtosRepositorio.save(produtos);
	}	

	@DeleteMapping("/produtos/{id}")
	public void deleteProdutos(@PathVariable Integer id) {
		produtosRepositorio.deleteById(id);
	}

}
