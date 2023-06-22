/**
 * 
 */
package application;

import java.util.Map;
import java.util.TreeMap;

/**
 * Testa a utilizacao da interface Map
 * 
 * @author Matos - 21.06.2023
 *
 */
public class MapProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Jose");
		cookies.put("email", "jose@gmail.com");
		cookies.put("phone1", "99999-8888");
		cookies.put("phone2", "77777-8888");
		
		cookies.remove("email");
		
		System.out.println("ALL COOKIES: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		System.out.println("\nContains the 'phone1' key?" 
				+ (cookies.containsKey("phone1") == true ? " Sim ": " Nao "));
	}

}
