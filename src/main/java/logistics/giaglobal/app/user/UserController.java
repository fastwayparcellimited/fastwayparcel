package logistics.giaglobal.app.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(method = RequestMethod.POST, value="/user")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@CrossOrigin(maxAge = 3600)
	@RequestMapping("/user/{userName}/{password}")
	public Optional<User> getUser(@PathVariable String userName, @PathVariable String password) {
		return userService.getUser(userName, password);
	}
}
