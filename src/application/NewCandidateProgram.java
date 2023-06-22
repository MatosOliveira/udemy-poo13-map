/**
 * 
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidate;

/**
 *  Classe que utiliza para Map a entidade Candidate
 *  
 * @author Matos
 *
 */
public class NewCandidateProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<String, Integer> maps = new LinkedHashMap<>();
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(";");
				Candidate candidate = new Candidate(fields[0], Integer.parseInt(fields[1]));
				
				if(maps.containsKey(candidate.getName())) {
					int cont = maps.get(candidate.getName());
					maps.put(candidate.getName(), candidate.getVote() + cont);
				} else {
					maps.put(candidate.getName(), candidate.getVote());
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
