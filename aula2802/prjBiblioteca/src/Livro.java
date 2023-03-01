import java.time.LocalDateTime;

public class Livro {
    //definir os atributos
    private long isbn;
    private String titulo;
    private String autor;
    private double preco;

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //métodos da classe
    public void registrarEmprestimo(){
        //lógica de negócios
        System.out.println("Titulo: " + titulo);
        System.out.println("Emprestado em " + LocalDateTime.now());
    }

    public void registrarDevolucao(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Devolvido em: " + LocalDateTime.now());
    }

    public void imprimir(){
        System.out.println("isbn = " + isbn);
        System.out.println("titulo = " + titulo);
        System.out.println("autor = " + autor);
        System.out.println("preco = " + preco);
    }
}
