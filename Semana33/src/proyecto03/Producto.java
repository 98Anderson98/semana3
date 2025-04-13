package proyecto03;


public class Producto {
private String nombre;
private double precio;
private int stock;

private static int contProductos=0;

public Producto(String nombre, double precio, int stock) {
	super();
	this.nombre = nombre;
	this.precio = precio;
	this.stock = stock;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}

public void MostrarInfo() {
	
	System.out.println("Producto:"+ nombre);
	System.out.println("Precio:"+ precio);
	System.out.println("Stock:" +  stock);
	
}
public void vender(int cantidad) {
	if(cantidad<=stock) {
		stock -= cantidad;
		System.out.println("Se vendieron: " + cantidad + " Unidades de " + nombre);
	}else {
		System.out.println("No hay Stock disponible");
	}
	
	}

public void reponer (int cantidad) {
	stock += cantidad;
	System.out.print("Se reducieron: " + cantidad + "    Unidades de" + nombre);
}
public static void mostrarTotalProdcuto() {
	System.out.print("Total de productos" + contProductos);
}
}

