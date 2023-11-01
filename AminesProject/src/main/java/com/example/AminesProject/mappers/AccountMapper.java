package com.example.AminesProject.mappers;

import com.example.AminesProject.dto.BankAccountResponseDTO;
import com.example.AminesProject.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO=new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
