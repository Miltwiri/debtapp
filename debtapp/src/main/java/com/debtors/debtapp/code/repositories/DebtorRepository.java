package com.debtors.debtapp.code.repositories;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debtors.debtapp.code.entities.Debtor;

@Repository
public interface DebtorRepository extends JpaRepository<Debtor, Long>{
    List<Debtor> findAll();

    Optional<Debtor> findById(Long id);
}
