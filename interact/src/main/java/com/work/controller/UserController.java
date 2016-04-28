
package com.work.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import com.work.bean.User;
import com.work.bean.layim.Friend;
import com.work.bean.layim.FriendCategory;
import com.work.bean.layim.FriendWrapper;
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

	public List<String> avatars = Arrays.asList(
			"http://tp1.sinaimg.cn/1571889140/180/40030060651/1",
			"http://tp3.sinaimg.cn/3850354634/180/40048989275/0",
			"http://tp1.sinaimg.cn/1827469584/180/40006354283/0"
			);

	/**在系统中注册用户
	 * @param username
	 * @return
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
	@ResponseBody
	public Object register(String username,HttpServletRequest request){
		
		int cnt = UserDao.count(M.make("name", username).asMap());
		User u = null;
		
		if(cnt > 0){
			u = UserDao.load(M.make("name", username).asMap());
			WebUtils.setSessionAttribute(request, "me", u);
			return new AjaxReturn(true, /*"用户名已被使用"*/null);
		}
		
		u = new User();
		u.setName(username);
		
		Random r = new Random();
		u.setAvatar(avatars.get(r.nextInt(avatars.size())));
		
		WebUtils.setSessionAttribute(request, "me", u);
		return AjaxReturn.ok(UserDao.insert(u), null, null);
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(){
		return "user/register";
	}
	
	@RequestMapping("/friend.json")
	@ResponseBody
	public Object friend(){
		List<Friend> friend = UserDao.listFriends();
	
		FriendCategory category = new FriendCategory();
		category.setId(1);
		category.setName("我的好友");
		category.setItem(friend);
		category.setNums(friend.size());
		
		FriendWrapper wrapper = new FriendWrapper();
		wrapper.setStatus(1);
		wrapper.setMsg("ok");
		wrapper.setData(Arrays.asList(category));
	
		return wrapper;
	}
}
    