package com.example.AminesProject.service;

import com.example.AminesProject.dto.BankAccountRequestDTO;
import com.example.AminesProject.dto.BankAccountResponseDTO;
import com.example.AminesProject.entities.BankAccount;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
