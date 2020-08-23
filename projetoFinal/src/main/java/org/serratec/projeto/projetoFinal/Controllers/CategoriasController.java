package org.serratec.projeto.projetoFinal.Controllers;

import java.util.List;
import java.util.Optional;

import org.serratec.projeto.projetoFinal.Entidades.Categorias;
import org.serratec.projeto.projetoFinal.Repositorios.CategoriasRepositorio;
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
public class CategoriasController {
	
	@Autowired
	CategoriasRepositorio categoriasRepositorio;
	
	@GetMapping("/categorias")
	public List<Categorias> listaCategorias(){
		return categoriasRepositorio.findAll();
	}
	
	@GetMapping("/categorias/{id}")
	public Optional<Categorias> listaCategoriasId(@PathVariable(value = "id") Integer id){
		return categoriasRepositorio.findById(id);
	}
	
	@PostMapping("/categorias")
	public Categorias salvaCategorias(@RequestBody Categorias categorias) {
		return categoriasRepositorio.save(categorias);
	}
	
	@PutMapping("/categorias")
	public Categorias atualizaCategorias(@RequestBody Categorias categorias) {
		return categoriasRepositorio.save(categorias);
	}
	
	@DeleteMapping("/categorias/{id}")
	public void deleteCategorias(@PathVariable Integer id) {
		categoriasRepositorio.deleteById(id);	
	}

}
