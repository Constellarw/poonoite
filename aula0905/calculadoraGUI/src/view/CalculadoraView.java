package view;

import model.Calculadora;

import java.awt.*;

public class CalculadoraView {
    protected Dimension dButton, dTextField;
    protected TextField txtVisor;
    protected Button btn0;
    protected Button btn1;
    protected Button btn2;
    protected Button btn3;
    protected Button btn4;
    protected Button btn5;
    protected Button btn6;
    protected Button btn7;
    protected Button btn8;
    protected Button btn9;
    protected Button btnDecimal;
    protected Button btnSoma, btnSubtrair;
    protected Button btnMultiplica, btnDividir;
    protected Button btnIgual;

    private Calculadora calculadora = new Calculadora();

    public CalculadoraView(){
        //define a aparencia e o comportamento da janla
    }
}
