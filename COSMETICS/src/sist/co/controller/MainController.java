package sist.co.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	//@Autowired
	// MemberService memberService;	

		@RequestMapping(value = "main.do", method = RequestMethod.GET)	
		public String login(Model model) {		
			/* #002 controller */ 
			logger.info("Welcome HelloMemberController login! "+ new Date());
			
			return "main.tiles";
		}

		
		
}
