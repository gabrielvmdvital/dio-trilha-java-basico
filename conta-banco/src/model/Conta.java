package model;

import java.math.BigDecimal;

public class Conta {
    private String nomeCliente;
    private String agencia;
    private int numero;
    private BigDecimal saldo;

    
    public Conta(String nomeCliente, String agencia, int numero, BigDecimal saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +
                " e seu saldo " + saldo +
                " já está disponível para saque";
    }
}
