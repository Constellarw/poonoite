package model;

import exceptions.CaixaException;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws CaixaException {
        if(valor <= saldo){
            saldo -= valor;
        }else{
            throw new CaixaException(2);
        }
    }
    public void depositar(double valor) throws CaixaException {
        if(valor > 0){
            saldo += valor;
        }else{
            throw new CaixaException(1);
        }
    }
}
