package com.example.Demo.bank.account.handling.repository;

import com.example.Demo.bank.account.handling.model.account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface accountRepository extends MongoRepository<account, String> {
    @Query("{name: '?0'}")
    account findAccountByName(String name);

    public long count();
}
