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
	String catchphrase;
	
	
	public Npc() {
		
	}
	
	public Npc(String portraitAdd, String spriteAdd, String catchphrase) {
		this.portraitAdd = portraitAdd;
		this.spriteAdd = spriteAdd;
		this.catchphrase = catchphrase;
		
	}

	public String getPortraitAdd() {
		return portraitAdd;
	}

	public String getSpriteAdd() {
		return spriteAdd;
	}

	public String getCatchphrase() {
		return catchphrase;
	}
	
}
