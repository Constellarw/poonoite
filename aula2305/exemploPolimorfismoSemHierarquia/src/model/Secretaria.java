package model;

import business.GerenciarLogin;

public class Secretaria extends Funcionario implements Logavel{
    @Override
    public void efetuarLogin() {
        System.out.println("Secretaria logou");
        GerenciarLogin.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Secretaria efetuou logout");
        GerenciarLogin.listaLogados.remove(this);
    }
}
