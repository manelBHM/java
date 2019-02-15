package simplon.co.springBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class appSpringBoot {
	
	
	@RequestMapping
	public String PageHome() {
		return "index";
	}

}
