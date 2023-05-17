import java.util.Objects;

public class Pessoa {
    private int id;
    private String nome;
    private String email;

    public Pessoa(int id){
        this.id = id;
    }
    public Pessoa(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Pessoa) && ((Pessoa) o).getId() == this.id;
    }

    @Override
    public int hashCode() {
        return nome.length();
    }
}
