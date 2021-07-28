package com.jhta.mactest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {
	@RequestMapping("/fortune")
	public ModelAndView fortune() { //ModelAndView가 리턴타입
		String result="오늘 좋은 일이 일어납니다"; //이 결과를 담아서 jsp로 가야함
		ModelAndView mv=new ModelAndView();//그래서 얘를 생성함. 모델과 뷰 다담을것
		mv.addObject("result",result); //모델객체 담기. 내부적으로는 request에 담기는것
		mv.setViewName("showFortune"); //뷰이름 담기 (setviewname 메소드)
		return mv; // 디스패쳐서블릿에게 ModelAndView객체 보내기
	}
}
