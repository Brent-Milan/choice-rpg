package production;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

	@Resource
	private NpcRepository npcRepo;
	
	
	public void run(String... args) throws Exception {
		
		Npc bandit = new Npc("/images/bandit.png", "/images/bandit-sprite", "So, hand it over, man.");
		
		npcRepo.save(bandit);
		
	}
}
