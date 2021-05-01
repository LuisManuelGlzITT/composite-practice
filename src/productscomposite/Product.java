package productscomposite;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private double price;
	private List<Product> subproducts;
	
	public Product(String name) {
		this.name = name;
		this.price = 0;
		subproducts = new ArrayList<Product>();
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		subproducts = new ArrayList<Product>();
	}
	
	public void add(Product product) {
		subproducts.add(product);
	}
	
	public void remove(Product product) {
		subproducts.remove(product);
	}
	
	public List<Product> getSubproducts(){
		return subproducts;
	}
	
	public String getPrice(){
		/**
		 * Sumamos los precios de los productos en este nivel de la
		 * jerarquía.
		 */
		double sum = subproducts.stream().mapToDouble(p -> p.price).sum();
		
		return "El precio de \"" + this.name + "\" es: $" + sum;
	}
}
