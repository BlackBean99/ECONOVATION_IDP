package com.econovation.idp.adapter.out.persistence;

import com.econovation.idp.application.port.out.LoadAccountPort;
import com.econovation.idp.application.port.out.RecordAccountPort;
import com.econovation.idp.domain.user.Account;
import com.econovation.idp.domain.user.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class AccountPersistenceAdapter implements LoadAccountPort, RecordAccountPort {
    private final AccountRepository accountRepository;


    @Override
    public boolean existsAccountByUserEmail(String email) {
        return accountRepository.existsAccountByUserEmail(email);
    }

    @Override
    public List<Account> findByUserName(String userName) {
        return accountRepository.findByUserName(userName);
    }

    @Override
    public Optional<Account> findByUserEmail(String email) {
        return accountRepository.findByUserEmail(email);
    }

    @Override
    public Page<Account> findAllByPage(Pageable pageable) {
        return accountRepository.findAll(pageable);
    }

    @Override
    public Long countAllByRole(String role) {
        return accountRepository.countAllByRole(role);
    }

    @Override
    public Optional<Account> findUserByUserNameAndYear(String userName, Long year) {
        return accountRepository.findUserByUserNameAndYear(userName,year);
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }
}