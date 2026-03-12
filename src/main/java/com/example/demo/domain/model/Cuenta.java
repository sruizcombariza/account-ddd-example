package com.example.demo.domain.model;

import java.math.BigDecimal;

public record Cuenta(
        BigDecimal saldo
) {

    public Cuenta retirar(BigDecimal dinero){
        if (saldo.compareTo(dinero) < 0) {
            return this;
        }
        return new Cuenta(saldo.subtract(dinero));
    }
}
