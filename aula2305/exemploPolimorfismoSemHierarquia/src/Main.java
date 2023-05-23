import business.GerenciarLogin;
import model.Cliente;
import model.Gerente;
import model.Operador;
import model.Secretaria;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1, cliente2;
        Gerente gerente1;
        Secretaria secretaria1;
        Operador operador1;
        cliente1 = new Cliente();
        cliente1.efetuarLogin();
        cliente2 = new Cliente();
        gerente1 = new Gerente();
        gerente1.efetuarLogin();
        cliente1.efetuarLogout();
        operador1 = new Operador();
        System.out.println("Total de logados");
        System.out.println(GerenciarLogin.quantidadeDePessoasLogadas());
    }
}