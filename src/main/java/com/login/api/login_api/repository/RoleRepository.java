package com.login.api.login_api.repository;
import java.util.Optional;

import com.login.api.login_api.models.ERole;
import com.login.api.login_api.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}