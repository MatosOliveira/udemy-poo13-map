/**
 * 
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Matos
 *
 */
public class CandidateProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<String, Integer> maps = new TreeMap<>();
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(";");
				String name = fields[0];
				Integer vote = Integer.parseInt(fields[1]);
				
				if(maps.containsKey(name)) {
					int cont = maps.get(name);
					maps.put(name, vote + cont);
				} else {
					maps.put(name, vote);
				}
				
				line = br.readLine();
			}
			
			for(String key : maps.keySet()) {
				System.out.println(key + ": " + maps.get(key));
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
