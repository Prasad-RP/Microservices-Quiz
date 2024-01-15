package com.microservices.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.microservices.user.entity.UserMaster;

@Transactional(readOnly = false)
public interface UserService {

	Optional<UserMaster> save(UserMaster master);

	Optional<UserMaster> edit(UserMaster master);

	Optional<UserMaster> getById(Integer userId);

	List<UserMaster> getAll();
}
