package com.debtors.debtapp.code.services.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.debtors.debtapp.code.entities.Debtor;
import com.debtors.debtapp.code.repositories.DebtorRepository;
import com.debtors.debtapp.code.services.DebtorService;

@Service
public class DebtorServiceImpl implements DebtorService{

    private final DebtorRepository debtorRepository;

    public DebtorServiceImpl(DebtorRepository debtorRepository){
        this.debtorRepository = debtorRepository;
    }

    @Override
    public List<Debtor> getAllDebtors() {
        return debtorRepository.findAll();
    }

    @Override
    public Optional<Debtor> getDebtorById(Long id) {
        return debtorRepository.findById(id);
    }

    @Override
    public Debtor addDebtor(Debtor debtor) {
        return debtorRepository.save(debtor);
    }

    @Override
    public Debtor updateDebtor(Long id, Debtor updatedDebtor) {
        // logic to update debtor
        // ...
        // Save the updated debtor
        return debtorRepository.save(updatedDebtor);
    }

    @Override
    public void deleteDebtor(Long id) {
        debtorRepository.deleteById(id);
    }
}
