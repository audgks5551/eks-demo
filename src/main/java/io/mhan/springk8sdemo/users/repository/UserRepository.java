package io.mhan.springk8sdemo.users.repository;

import io.mhan.springk8sdemo.users.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
