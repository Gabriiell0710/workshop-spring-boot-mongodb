package com.nelioalves.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	@Query("{ 'tittle': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTittle(String text);
	
	List<Post> findByTittleContainingIgnoreCase(String text);
	
}
