package com.satya.joblisting.repository;

import com.satya.joblisting.model.Post;

import java.util.List;

public interface SearchRepo {

    List<Post> findByText(String text);

}
