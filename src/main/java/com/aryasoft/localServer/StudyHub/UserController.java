package com.aryasoft.localServer.StudyHub;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@RequestMapping("/")
    public String getStudyHubApplication() {
        return("User App Home");
    }
	@RequestMapping("/users")
	public List<Users> getUsers(){
		return userRepository.findAll();
	}
}
