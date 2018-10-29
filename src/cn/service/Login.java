package cn.service;

import java.util.List;

import cn.cn.pojo.UserInfo;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dao.UsersDao;



@Service("exhibition")
public class Login implements Loginser {
	@Autowired
	private UsersDao udao;


	public UsersDao getUdao() {
		return udao;
	}

	public void setUdao(UsersDao udao) {

		this.udao = udao;
	}

	public String test(String name,String paw){
		UserInfo user=new UserInfo();
		user.setUserName(name);
		user.setUserPwd(paw);
		if(udao.selectUser(user).size()>0){
			return JSON.toJSONString(udao.selectUser(user));
		}else {
			return null;
		}
	}
}
