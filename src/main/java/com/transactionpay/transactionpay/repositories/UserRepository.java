package com.transactionpay.transactionpay.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactionpay.transactionpay.domain.user.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional <Users> findUserByCpf(String cpf);

    Optional <Users> findUserById(Long id);
    
}
