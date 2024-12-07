package com.stock.analysis.MyAnalysis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.analysis.MyAnalysis.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
