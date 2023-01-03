package it.developer.spring.demo.bootstrapdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.developer.spring.demo.model.User;
import it.developer.spring.demo.repository.UserRepository;

@Component
public class BootstrapData implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User userMario= new User("Mario","Rossi");
		User userGiorgio= new User("Giorgio","Bianchi");
	
		userRepository.save(userMario);
		userRepository.save(userGiorgio);
		
	}

}
