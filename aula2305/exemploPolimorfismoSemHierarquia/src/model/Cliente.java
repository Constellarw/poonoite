package model;

import business.GerenciarLogin;

public class Cliente implements Logavel {

    @Override
    public void efetuarLogin() {
        System.out.println("Cliente logou");
        GerenciarLogin.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Cliente efetuou logout");
        GerenciarLogin.listaLogados.remove(this);

    }
}
