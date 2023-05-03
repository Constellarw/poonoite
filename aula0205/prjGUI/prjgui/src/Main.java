import view.CaixaView;
import view.Caixa_View;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       // CaixaView tela = new CaixaView();
       // tela.setVisible(true);
        JFrame tela = new JFrame();
        tela.setContentPane(new Caixa_View().getPainelPrincipal());
        tela.setVisible(true);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}