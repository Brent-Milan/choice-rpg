package production;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Npc {

	@Id
	@GeneratedValue
	long id;
	
	//associated imagery
	String portraitAdd;
	String spriteAdd;
	
	//dialogue
	String catchPhrase;
	
	
	public Npc() {
		
	}
	
	public Npc(String portraitAdd, String spriteAdd, String catchPhrase) {
		this.portraitAdd = portraitAdd;
		this.spriteAdd = spriteAdd;
		this.catchPhrase = catchPhrase;
		
	}

	public String getPortraitAdd() {
		return portraitAdd;
	}

	public String getSpriteAdd() {
		return spriteAdd;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}
	
}
