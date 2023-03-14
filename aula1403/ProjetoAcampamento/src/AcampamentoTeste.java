public class AcampamentoTeste {
    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        membro.setNome("Joao");
        membro.setIdade(3);
        membro.imprimir();
        //Separar o grupo
        membro.separarGrupo();
        membro.imprimir();
    }
}