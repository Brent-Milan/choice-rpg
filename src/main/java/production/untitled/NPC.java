package production.untitled;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NPC {

	@Id
	@GeneratedValue
	long id;
	
	//associated imagery
	String portraitAdd;
	String spriteAdd;
	
	//dialogue
	String catchPhrase;
	
	
	public NPC() {
		
	}
	
	public NPC(String portraitAdd, String spriteAdd, String catchPhrase) {
		this.portraitAdd = portraitAdd;
		this.spriteAdd = spriteAdd;
		this.catchPhrase = catchPhrase;
		
	}
	
}
