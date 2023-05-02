package view;

import javax.swing.*;
import java.awt.*;

public class CaixaView extends JFrame {
    //atributos da janela
    protected Dimension dTextField, dLabel, dTextArea, dButton, dFrame;
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextArea txtMsg;

    //método construtor
    public CaixaView(){
        //definir os tamanhos
        dFrame = new Dimension(400,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);
        dTextArea = new Dimension(300, 140);
        this.setTitle("Controle de Caixa");
        this.setSize(dFrame);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        //primeiro componente
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        this.add(lblValor);

        lblSaldo  = new Label("Saldo");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        this.add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        this.add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        this.add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        this.add(cmdEntrada);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180, 150);
        this.add(cmdRetirada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        this.add(cmdConsulta);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        this.add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        this.add(txtMsg);
    }
}
