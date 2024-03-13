package com.debtors.debtapp.code.repositories;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debtors.debtapp.code.entities.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
    List<Transaction> findByDebtorId(Long debtorId);

    List<Transaction> findAll();

    Optional<Transaction> findById(Long id);
}
