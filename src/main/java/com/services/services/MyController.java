package com.services.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.services.model.User;
import com.services.response.RestResponse;

@RestController
public class MyController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(@RequestParam("id") int id) {
		System.out.println("My Controller is called" + id);
		return "success" + id;
	}

	@RequestMapping(value = "/userDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public RestResponse execute() {

		RestResponse response = new RestResponse();

		List<User> listUser = this.createUserList();

		response.setResponse(listUser);
		response.setStatus("200");

		return response;
	}

	private List<User> createUserList() {
		// TODO Auto-generated method stub

		User user1 = new User();
		User user2 = new User();
		User user3 = new User();

		user1.setUserCode("1");
		user1.setUserName("Sanjay");
		user1.setEmail("sanjay@gmail.com");
		user1.setAge("10");

		user2.setUserCode("2");
		user2.setUserName("Anushka");
		user2.setEmail("Anushka@gmail.com");
		user2.setAge("12");

		user3.setUserCode("3");
		user3.setUserName("Amruta");
		user3.setEmail("Amruta@gmail.com");
		user3.setAge("15");

		List<User> listUser = new ArrayList<>();
		listUser.add(user1);
		listUser.add(user2);
		listUser.add(user3);

		return listUser;
	}

}
