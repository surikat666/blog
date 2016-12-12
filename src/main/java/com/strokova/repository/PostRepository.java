package com.strokova.repository;

import com.strokova.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 11.12.2016.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
