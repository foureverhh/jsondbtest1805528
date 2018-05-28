package com.springtestdatabase180528.repository;

import com.springtestdatabase180528.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
