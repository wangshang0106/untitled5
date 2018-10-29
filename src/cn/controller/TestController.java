package cn.controller;

import java.util.List;

import cn.cn.pojo.UserInfo;
import cn.service.Login;
import cn.service.Loginser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;


@Controller
public class TestController{

	@Autowired

	private Login login;
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@RequestMapping("/hehe")
	public ModelAndView fsasda(@RequestParam("name")String name, @RequestParam("pas") String pas) {
		ModelAndView mav = new ModelAndView();
		System.out.println(1);
		if(login.test(name,pas)!=null) {
			mav.addObject("name", login.test(name,pas));
			System.out.println(name);
			System.out.println(pas);
			mav.setViewName("lalala");
		}else{
			mav.addObject("name", name);
			mav.setViewName("wuwu");
		}
		return mav;
	}
}
