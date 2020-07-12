package com.aryasoft.localServer.StudyHub;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, BigInteger> {

}
