package production;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@Resource
	NpcRepository npcRepo;
	
	@RequestMapping("/npcTest")
	public String displayNpc(Model model) {
		model.addAttribute("npc", npcRepo.findAll());
		return "npcTest";
	}
}
