package com.maudi.app21;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="productos")
public class Producto {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int item;
	@Column
	private String nombre;
	@Column
	private String cantidad;
	@Column
	private String codigoInventario;
	
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getCodigoInventario() {
		return codigoInventario;
	}
	public void setCodigoInventario(String codigoInventario) {
		this.codigoInventario = codigoInventario;
	}
	@Override
	public String toString() {
		return "Producto [item=" + item + ", nombre=" + nombre + ", cantidad=" + cantidad + ", codigoInventario="
				+ codigoInventario + "]";
	}
}
