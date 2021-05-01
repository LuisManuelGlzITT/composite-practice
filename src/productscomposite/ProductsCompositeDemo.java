package productscomposite;

public class ProductsCompositeDemo {

	public static void main(String[] args) {
		Product mouse = new Product("Mouse", 350.00);
		Product usb = new Product("USB", 150.99);
		Product cargador = new Product("Cargador", 130.49);
		Product audifonos = new Product("Audífonos", 109.99);
		
		Product paquete = new Product("Paquete");

		paquete.add(mouse);
		paquete.add(usb);
		paquete.add(cargador);
		paquete.add(audifonos);
		
		System.out.println(paquete.getPrice());
	}

}
