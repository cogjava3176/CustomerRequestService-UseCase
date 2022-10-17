package com.user.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.ERole;
import com.user.entity.Role;
@Repository
public interface RoleRepo  extends JpaRepository<Role, Integer> {
	Optional<Role> findByName(ERole name);
}


