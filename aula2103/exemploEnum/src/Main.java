public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setId(1);
        f.setSalario(2500);
        f.setTipoFuncionario(TipoFuncionario.secretaria);
        f.setNomeFuncionario("Maria");

        Funcionario f1 = new Funcionario();
        f1.setId(1000);
        f1.setSalario(30000);
        f1.setTipoFuncionario(TipoFuncionario.diretor);
        f1.setNomeFuncionario("Johnny");

        System.out.println(f.getSalario(f.getTipoFuncionario()));
        System.out.println(f1.getSalario(f.getTipoFuncionario()));
    }
}