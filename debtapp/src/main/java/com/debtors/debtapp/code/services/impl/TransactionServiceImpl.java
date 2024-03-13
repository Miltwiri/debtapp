package com.debtors.debtapp.code.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.debtors.debtapp.code.entities.Transaction;
import com.debtors.debtapp.code.repositories.TransactionRepository;
import com.debtors.debtapp.code.services.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }

	@Override
	public Transaction addTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	@Override
	public List<Transaction> geTransactionsByDebtorId(Long debtorId) {
		return transactionRepository.findByDebtorId(debtorId);
	}

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public void deleteTransaction(Long id) {
       transactionRepository.deleteById(id);
    }

    @Override
    public Transaction updateTransaction(Long id, Transaction updatedTransaction) {
        // logic to update transaction
        // ...
        // Save the updated transaction
        return transactionRepository.save(updatedTransaction);
    }

    @Override
    public Optional<Transaction> getTransactionById(Long id) {
    return transactionRepository.findById(id);
    }

}
