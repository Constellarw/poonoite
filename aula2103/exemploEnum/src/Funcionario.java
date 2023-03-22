public class Funcionario {
    private int id;
    private String nomeFuncionario;
    private TipoFuncionario tipoFuncionario;
    private double salario;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public double getSalario(TipoFuncionario tipoFuncionario) {
        if(tipoFuncionario == TipoFuncionario.diretor){
            return salario;
        }else{
            throw new IllegalArgumentException(
                    "Você tem privilegios para ver o salário"
            );
        }

    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
