import java.util.ArrayList;
import java.util.List;

public class Sample3 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        System.out.println(lista.size());
        lista.add(33);
        lista.add("Maromo");
        lista.add(23.56f);
        lista.add(System.currentTimeMillis());
        lista.add("Maromo");
        System.out.println(lista.size());

        while(lista.contains("Maromo")){
            lista.remove("Maromo");
        }
        lista.remove(0);
        for(Object x : lista){
            System.out.println(x);
        }
    }
}
