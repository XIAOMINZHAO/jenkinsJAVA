package JenkinsTest.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class controllerClass {
	
	@GetMapping()
	public String getUsers() {
		return "HTTP GET request was sent";
	}
	
	@PostMapping()
	public String creatUsers() {
		return "HTTP POST request was sent";
	}
	
	@DeleteMapping()
	public String deleteUsers() {
		return "HTTP DELETE request was sent";
	}
	
	@PutMapping()
	public String putUsers() {
		return "HTTP PUT request was sent";
	}


}
