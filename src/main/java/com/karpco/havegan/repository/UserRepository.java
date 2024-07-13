package com.karpco.havegan.repository;


import com.karpco.havegan.entity.core.User;
import org.springframework.data.repository.Repository;

import java.util.UUID;


public interface UserRepository extends Repository<User, String> {
    User save(User user);

    User findById(UUID id);

    User findByEmail(String email);

    User findByEmailAndPassword(String email, String password);

    Iterable<User> findAll();

    void deleteById(UUID id);

    boolean existsById(UUID id);

    boolean existsByEmail(String email);

    long count();

    long countById(UUID id);
}
