package com.felab.repository;

import com.felab.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by azheng on 10/29/2015.
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
