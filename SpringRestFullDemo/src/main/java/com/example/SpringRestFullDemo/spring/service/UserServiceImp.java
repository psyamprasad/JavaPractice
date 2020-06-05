package com.example.SpringRestFullDemo.spring.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringRestFullDemo.spring.bean.User;

@Service
public class UserServiceImp implements UserService
{
	private static List<User> users;
	
	static
	{
		users=dummyUsers();
	}
	
	public List<User> getUser()
	{
		return users;
	}
	
	public User findById(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
			{
				return user;
				
			}	
		}
		return null;
	}
	
	public void createUser(User user)
	{
		users.add(user);
	}
	
	 public void deleteUserById(int id) {
	        // TODO Auto-generated method stub
	        Iterator<User> it = users.iterator();
	        while (it.hasNext()) {
	            User user = (User) it.next();
	            if (user.getId() == id) {
	                it.remove();
	            }
	        }
	    }
	 
	 public void updatePartially(User currentUser, int id) {
	        for (User user : users) {
	            if (user.getId() == id) {
	                if (currentUser.getCountry() != null) {
	                    user.setId(id);
	                    user.setCountry(currentUser.getCountry());
	                }
	                user.setName(user.getName());
	                update(user);
	            }
	        }

	    }
	 
	 public void update(User user) {
	        // TODO Auto-generated method stub
	        int index = users.indexOf(user);
	        users.set(index, user);
	    }
	private static List<User> dummyUsers()
	{
		List<User> users=new ArrayList<User>();
		users.add(new User(1213,"John","india"));
		users.add(new User(1253,"Ben","Uk"));
		users.add(new User(1235,"Andrew","India"));
		users.add(new User(1233,"Samuel","USA"));
		return users;
	}

}
