package com.bootCRUD.bootkata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootCRUD.bootkata.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
