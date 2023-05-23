package business;

import model.Logavel;

import java.util.ArrayList;
import java.util.List;

public class GerenciarLogin {
    public static List<Logavel> listaLogados = new ArrayList<>();

    public static void adicionarLogado(Logavel objeto){
        listaLogados.add(objeto);
    }

    public static List<Logavel> getListaLogados(){
        return listaLogados;
    }

    public static int quantidadeDePessoasLogadas(){
        return listaLogados.size();
    }


}
