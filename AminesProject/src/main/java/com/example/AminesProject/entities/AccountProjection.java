package com.example.AminesProject.entities;

import com.example.AminesProject.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types=BankAccount.class,name="am")
public interface AccountProjection {
    public String getId();
    public AccountType getType();
}
