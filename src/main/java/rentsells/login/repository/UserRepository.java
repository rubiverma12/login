package rentsells.login.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import rentsells.login.model.Login;

@Repository
public interface UserRepository extends MongoRepository<Login, String> {
	
	  Optional<Login> findByMobile(String mobile);
	  Optional<Login> findByEmail(String email);
  /*Login findByMobile(String mobile);
  Login findByEmail(String email);*/

  Boolean existsByMobile(String mobile);

  Boolean existsByEmail(String email);
  
//  Login saveUser(Login login);
}
