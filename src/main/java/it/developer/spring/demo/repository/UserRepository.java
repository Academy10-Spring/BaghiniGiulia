package it.developer.spring.demo.repository;

import org.springframework.data.repository.CrudRepository;

import it.developer.spring.demo.model.User;

public interface UserRepository extends CrudRepository<User,Long> {

}
