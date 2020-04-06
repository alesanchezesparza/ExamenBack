package com.maudi.app21;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/productos"})
public class Controller {
	
	@Autowired
	ProductoService service;
	
	@GetMapping
	public List<Producto> listar(){
		return service.getListaProductos();
	}
	
	@GetMapping (path = {"/{item}"})
	public Producto buscarId(@PathVariable("item") int item) {
		return service.getProducto(item);
	}
	
	@PostMapping
	public Producto guardar(@RequestBody Producto producto) {
		return service.setProducto(producto);
	}
	
	@DeleteMapping(path = {"/{item}"})
	public Producto eliminar(@PathVariable("item") int item) {
		return service.deleteProducto(item);
	}

}
