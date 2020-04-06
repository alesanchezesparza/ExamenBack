package com.maudi.app21;

import java.util.List;

public interface ProductoService {
	List<Producto> getListaProductos();
	Producto getProducto(int item);
	Producto setProducto(Producto producto);
	Producto deleteProducto(int item); 
}
