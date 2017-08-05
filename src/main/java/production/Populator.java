package production;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;

public class Populator implements CommandLineRunner {

	@Resource
	NpcRepository npcRepo;
	
	
	public void run(String... args) throws Exception {
		
		
	}
}
