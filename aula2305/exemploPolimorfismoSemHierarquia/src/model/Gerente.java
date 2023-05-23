package model;

import business.GerenciarLogin;

public class Gerente extends Funcionario implements Logavel {
    @Override
    public void efetuarLogin() {
        System.out.println("Gerente logou");
        GerenciarLogin.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Gerente efetuou logout");
        GerenciarLogin.listaLogados.remove(this);
    }
}
