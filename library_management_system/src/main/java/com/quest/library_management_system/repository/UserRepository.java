package com.quest.library_management_system.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.quest.library_management_system.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	//List<User> findByNameLikeAndEmailLike(String Name, String Email);

}
