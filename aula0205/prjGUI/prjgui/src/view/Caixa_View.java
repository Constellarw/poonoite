package view;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Caixa_View {
    private JPanel painelPrincipal;
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton entradaButton;
    private JButton retiradaButton;
    private JButton consutaButton;
    private JButton sairButton;
    private JTextArea txtMsg;

    public JPanel getPainelPrincipal() {
        return painelPrincipal;
    }

    private Caixa caixa;

    public Caixa_View(){
        caixa = new Caixa();
        entradaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                caixa.depositar(valor);
                txtMsg.append("Depósito de " + valor + " feito \n");
            }
        });
        retiradaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                caixa.sacar(valor);
                txtMsg.append("Saque de " + valor + " feito \n");
            }
        });
        consutaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.getSaldo()));
                txtMsg.append("Saldo consultado em tela \n");
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }

}
