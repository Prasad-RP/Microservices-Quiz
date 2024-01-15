package com.microservices.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.microservices.user.entity.UserMaster;
import com.microservices.user.repository.UserRepository;
import com.microservices.user.service.QuizClient;
import com.microservices.user.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository repository;
	private final QuizClient client;

	@Override
	public Optional<UserMaster> save(UserMaster master) {
		return Optional.of(repository.save(master));
	}

	@Override
	public Optional<UserMaster> edit(UserMaster master) {
		return Optional.of(repository.save(master));
	}

	@Override
	public Optional<UserMaster> getById(Integer userId) {
		Optional<UserMaster> user = repository.findById(userId);
		user.ifPresent(p -> {
			p.setQuizMasters(client.getQuizByUser(userId));
		});
		return user;
	}

	@Override
	public List<UserMaster> getAll() {
		List<UserMaster> users = repository.findAll();
		users.forEach(p -> {
			p.setQuizMasters(client.getQuizByUser(p.getUserId()));
		});
		return users;
	}

}
