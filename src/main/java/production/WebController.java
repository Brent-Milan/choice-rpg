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
		model.addAttribute("npcs", npcRepo.findAll());
		return "npcTest";
	}
	
//	//incomplete -- research single ID method
//	@RequestMapping("/demo")
//	public String displayUi(Model model) {
//		model.addAttribute("npcs", npcRepo.findOne((long) 1));
//		return "demo";
//	}
}
