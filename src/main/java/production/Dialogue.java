package production;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dialogue {

	@Id
	@GeneratedValue
	long id;
	
	@ManyToOne
	Npc npc;
	
	/*
	 * Research and make some design decisions before building this class out
	 * */
	
	
	
}
