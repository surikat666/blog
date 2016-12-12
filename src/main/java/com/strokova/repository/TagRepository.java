package com.strokova.repository;

import com.strokova.model.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.PostRemove;

/**
 * Created by User on 11.12.2016.
 */
@Repository
public interface TagRepository extends CrudRepository<Tag, Integer> {

}
