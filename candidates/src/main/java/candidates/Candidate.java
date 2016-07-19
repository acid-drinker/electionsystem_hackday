package candidates;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {
	public Candidate(){
		
	}
	public Candidate(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Id
	private int id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
