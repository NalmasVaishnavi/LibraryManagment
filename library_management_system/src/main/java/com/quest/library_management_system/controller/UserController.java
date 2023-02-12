package com.quest.library_management_system.controller;
import java.util.List;
import java.util.Optional;
import com.quest.library_management_system.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.quest.library_management_system.repository.UserRepository;
import com.quest.library_management_system.service.Userservice;
import jakarta.transaction.Transactional;
@Controller
public class UserController {
	@Autowired
	private Userservice userservice;
   @GetMapping("/")
	public String showHome(){ 
		return "Home-page";
	}
	@GetMapping("add")
	public String showUsers() {
		return "/";
	}
	@PostMapping("add")
	public String add(@RequestParam String FirstName, @RequestParam String LastName, @RequestParam int UID,
			@RequestParam String address, @RequestParam int Phonenumber, @RequestParam String Email) {
        User user=new User();
		user.setFirstName(FirstName);
		user.setLastName(LastName);
		user.setId(UID);
		user.setAddress(address);
		user.setPhonenumber(Phonenumber);
		user.setEmail(Email);
		userservice.savemyuser(user);
		return "redirect:/";
	}

	@GetMapping("update/{id}")
	public String showUpdateUsers(@PathVariable Integer id, Model model) {
		User user = null;
		Optional<User> optionaluser = this.userservice.findById(id);
		if (optionaluser.isPresent()) {
			user = optionaluser.get();
		} else {
			return "redirect:/error/No User With ID : " + id + " Found";
		}
		model.addAttribute("User", user);
		return "Update-User";
	}

	@PostMapping("update")
	public String updateUser(@ModelAttribute User user) {
		userservice.savemyuser(user);
		return "redirect:/";
	}

//	@GetMapping("remove/{id}")
//	public String removeUser(@PathVariable Integer id) {
//		userservice.deleteById(id);
//		return "redirect:/";
//	}

	//@PostMapping("search")
	//public String searchUser(@RequestParam ("Name") String Name,@RequestParam("Email")String Email,Model model) {
	//	List<User> user = userservice.findByNameLikeAndEmailLike("%" + Name + "%", "%" + Email + "%");
	//	model.addAttribute("user", user);
	//	return "redirect:/";
	//}

}