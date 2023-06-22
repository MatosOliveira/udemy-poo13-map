/**
 * 
 */
package application;

import java.util.Map;
import java.util.TreeMap;

import entities.Product;

/**
 * @author Matos
 *
 */
public class ProductMapProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Product, Double> products = new TreeMap<>();
		
		Product prod1 = new Product("TV", 900.0);
		Product prod2 = new Product("Iphone", 1000.0);
		Product prod3 = new Product("Notebook", 1200.0);
		Product prod4 = new Product("Tablet", 400.0);
		
		products.put(prod1, 15000.0);
		products.put(prod2, 25000.0);
		products.put(prod3, 5000.0);
		products.put(prod4, 15000.0);
		
		Product ps = new Product("TV", 900.0);
		
		System.out.println("Contains 'ps' keys: " + products.containsKey(ps));
		System.out.println("Contains 'ps' values: " + products.containsValue(ps.getPrice()));

	}

}
