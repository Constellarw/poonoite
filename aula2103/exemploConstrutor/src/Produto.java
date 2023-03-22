public class Produto {
    //atributos
    private int codigo;
    private String descricao;

    //modificadores de acesso
    public int getCodigo() {
        return codigo;
    }

    //métodos construtores
    public Produto(){
        System.out.println("Construtor padrão");
    }
    //overload (sobrecarga do método construtor)

    public Produto(String descricao){
        this.descricao = descricao;
    }
    public Produto(int codigo, String descricao){
        this(descricao);
        this.codigo = codigo;

    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\n" +
                "Descrição: " + descricao + "\n";
    }


}
