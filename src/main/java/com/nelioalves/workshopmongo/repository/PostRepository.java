package com.nelioalves.workshopmongo.repository;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	@Bean
	List<Post> findByTittleContainingIgnoreCase(String text);
	
}
