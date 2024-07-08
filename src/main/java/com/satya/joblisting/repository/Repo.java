package com.satya.joblisting.repository;


import com.satya.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface Repo extends MongoRepository<Post,String> {

}
