package apple.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping(path = "/test.do")
	public ModelAndView drawAny(ModelAndView mv) {
		mv.setViewName("abc");
		return mv;
	}
}
