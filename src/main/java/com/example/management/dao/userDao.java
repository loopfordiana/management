package com.example.management.dao;

import com.example.management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface userDao extends JpaRepository<User,Integer> {
@Query("select u from User u")
List<User> findList();
}