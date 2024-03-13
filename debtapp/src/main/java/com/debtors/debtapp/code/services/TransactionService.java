package com.debtors.debtapp.code.services;



import java.util.List;
import java.util.Optional;

import com.debtors.debtapp.code.entities.Transaction;

public interface TransactionService {
    Transaction addTransaction(Transaction transaction);

    List<Transaction> geTransactionsByDebtorId(Long debtorId);

    List<Transaction> getAllTransactions();

    void deleteTransaction(Long id);

    Transaction updateTransaction(Long id, Transaction transaction);

    Optional<Transaction> getTransactionById(Long id);
}
