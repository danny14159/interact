
package com.work.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import com.work.bean.User;
import com.work.mapper.BasicDao;
import com.work.mapper.UserDao;
import com.work.util.AjaxReturn;
import com.work.util.M;

@Controller
@RequestMapping("/user")
public class UserController extends BasicController<User>{
	
	@Resource
	private UserDao UserDao;
	
	public static final String PREFIX="User/";

	@Override
	protected String getPrefix() {
		return PREFIX;
	}

	@Override
	protected BasicDao<User> getDao() {
		return UserDao;
	}


	/**在系统中注册用户
	 * @param username
	 * @return
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public Object register(String username,HttpServletRequest request){
		
		int cnt = UserDao.count(M.make("name", username).asMap());
		
		if(cnt > 0){
			return new AjaxReturn(false, "用户名已被使用");
		}
		
		User u = new User();
		u.setName(username);
		
		u.setAvatar("设置随机头像");
		
		WebUtils.setSessionAttribute(request, "me", username);
		return AjaxReturn.ok(UserDao.insert(u), null, null);
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(){
		return "user/register";
	}
}
    