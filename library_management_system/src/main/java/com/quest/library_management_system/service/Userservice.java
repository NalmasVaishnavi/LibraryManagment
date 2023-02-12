package com.quest.library_management_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quest.library_management_system.models.User;
import com.quest.library_management_system.repository.UserRepository;
import jakarta.transaction.Transactional;
import com.quest.library_management_system.repository.UserRepository;

@Service
@Transactional
public class Userservice {

	@Autowired
	private UserRepository userRepo;

	public Userservice(UserRepository userrepo) {
		this.userRepo = userrepo;
	}

	public void savemyuser(User user) {
		userRepo.save(user);
	}

	public List<User> findByNameLikeAndEmailLike(String Name, String Email) {
		return findByNameLikeAndEmailLike("%" + Name + "%", "%" + Email + "%");
	}

	public Optional<User> findById(Integer id) {

		return userRepo.findById(id);

	}

	public List<User> findall() {
		return findall();
	}

}
