/**
 * 
 */
package entities;

import java.util.Objects;

/**
 * Classe que contem as informacoes do Candidato
 * 
 * @author Matos - 22.06.2023
 *
 */
public class Candidate {

	private String name;
	private Integer vote;
	
	public Candidate() {
	}

	public Candidate(String name, Integer vote) {
		this.name = name;
		this.vote = vote;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVote() {
		return vote;
	}

	public void setVote(Integer vote) {
		this.vote = vote;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(name, other.name);
	}
}
