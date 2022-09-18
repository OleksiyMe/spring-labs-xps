package com.cydeo.config;

import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration

public class Config {

    @Bean

    public Current current(Currency currency) {
        Current current = new Current();
        current.setCurrency(currency);
        // current.setCurrency(new Currency("804", "USD"));
        current.setAmount(new BigDecimal(1200));
        current.setAccountId(UUID.randomUUID());
        return current;
    }

    @Bean
    public Saving saving(Currency currency) {
        Saving saving = new Saving();
        saving.setCurrency(currency);
        saving.setAmount(new BigDecimal(1000));
        saving.setAccountId(UUID.randomUUID());
        return saving;
    }

    @Bean
    public Currency currency() {
        return new Currency("802", "EUR");
    }


}
