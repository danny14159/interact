package com.work.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.work.bean.User;
import com.work.bean.layim.Friend;
/**
 * @author 
 *
 */
@Repository
public interface UserDao extends BasicDao<User> {


	@Select("select 1,name,avatar as face from tb_user")
	public List<Friend> listFriends();
}