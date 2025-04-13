package proyecto03;

public class Main {

	public static void main(String[] args) {
		Producto p1=new Producto(" Laptop ",   2500.00,   10);
		Producto p2=new Producto(" Mouse ",   50.00,   100);
		p1.MostrarInfo();
		p1.vender(30);
		p1.reponer(5);
		System.out.println("Nuevo precio "+ p1.getNombre()  + "s/."+  p1.getPrecio ());
		p1.setPrecio(3600);//CAMBIA LA CANTIDAD
		p1.getPrecio();//oBTENER EL NUEVO PRECIO
		System.out.println("Nuevo Actualizado "+  p1.getNombre ()+ "s/."+ p1.getPrecio());
		p2.vender(10);
		p2.reponer(60);
		Producto.mostrarTotalProdcuto();

	}

}
