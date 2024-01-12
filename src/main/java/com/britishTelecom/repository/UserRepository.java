package com.britishTelecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.britishTelecom.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long>{

}
