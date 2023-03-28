package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    public Baralho(){
        montar();
        System.out.println("CARTAS NA ORDEM");
        exibir();
        System.out.println();
        System.out.println("CARTAS EMBARALHADAS");
        embaralhar();
        exibir();
    }

    private void montar(){
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                Carta c = new Carta();
                c.setNaipe(naipe);
                c.setValor(valor);
                cartas.add(c);
            }
        }
    }

    private void embaralhar(){
        Collections.shuffle(cartas);
    }

    private void exibir(){
        for(Carta carta : cartas){
            System.out.print(carta);
        }
    }
}
