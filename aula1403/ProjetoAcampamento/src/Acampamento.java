public class Acampamento {
    //Atributos
    private String nome;
    private char equipe;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("Nome = " + nome);
        System.out.println("Equipe = " + equipe);
        System.out.println("Idade = " + idade);
    }

    public void separarGrupo(){
        if(idade < 6){
            equipe = '-';
            return;
        }
        if(idade<11){
            equipe = 'A';
            return;
        }
        if(idade<21){
            equipe = 'B';
            return;
        }
        equipe = 'C';
    }
}
