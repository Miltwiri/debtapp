package com.debtors.debtapp.code.services;

import java.util.List;
import java.util.Optional;

import com.debtors.debtapp.code.entities.Debtor;

public interface DebtorService {

    List<Debtor> getAllDebtors();

    Optional<Debtor> getDebtorById(Long id);

    Debtor addDebtor(Debtor debtor);

    void deleteDebtor(Long id);

    Debtor updateDebtor(Long id, Debtor updatedDebtor);

}
