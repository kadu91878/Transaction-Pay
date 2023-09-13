package com.transactionpay.transactionpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactionpay.transactionpay.domain.transaction.Transactions;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {
    
}
