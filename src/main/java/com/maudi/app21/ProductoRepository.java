package com.maudi.app21;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface ProductoRepository extends Repository<Producto, Integer> {
	List<Producto> findAll();
	Producto findById(int item);
	Producto save(Producto producto);
	void delete(Producto producto);
}
