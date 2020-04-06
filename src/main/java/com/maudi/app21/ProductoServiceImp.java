package com.maudi.app21;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImp implements ProductoService {
	
	@Autowired
	private ProductoRepository repository;

	@Override
	public List<Producto> getListaProductos() {
		return repository.findAll();
	}

	@Override
	public Producto getProducto(int id) {
		return repository.findById(id);
	}

	@Override
	public Producto setProducto(Producto producto) {
		return repository.save(producto);
	}

	@Override
	public Producto deleteProducto(int item) {
		Producto producto = repository.findById(item);
		repository.delete(producto);
		return producto;
	}

}
