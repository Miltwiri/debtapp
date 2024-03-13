package com.debtors.debtapp.code.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.debtors.debtapp.code.entities.Debtor;
import com.debtors.debtapp.code.services.DebtorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/debtors")
@CrossOrigin(origins = "http://localhost:5173")
public class DebtorController {

    @Autowired
    private DebtorService debtorService;

    @GetMapping
    public List<Debtor> getAllDebtors() {
        return debtorService.getAllDebtors();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Debtor>> getDebtorById(@PathVariable Long id) {
        Optional<Debtor> optionalDebtor = debtorService.getDebtorById(id);
        return ResponseEntity.ok(optionalDebtor);
    }

    @PostMapping
    public ResponseEntity<Debtor> addDebtor(@RequestBody Debtor debtor) {
        Debtor addedDebtor = debtorService.addDebtor(debtor);
        return new ResponseEntity<>(addedDebtor, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Debtor> updateDebtor(@PathVariable Long id, @RequestBody Debtor debtor) {
       Debtor updatedDebtor = debtorService.updateDebtor(id, debtor);
        return ResponseEntity.ok(updatedDebtor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDebtor(@PathVariable Long id){
        debtorService.deleteDebtor(id);
        return ResponseEntity.noContent().build();
    }
}
