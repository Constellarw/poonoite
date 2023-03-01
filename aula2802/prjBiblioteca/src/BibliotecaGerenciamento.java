public class BibliotecaGerenciamento {
    public static void main(String[] args) throws InterruptedException {
        //Criar dois livros, emprestar e devolver
        //o segundo livro. E mostrar os dados do prim
        //eiro livro
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        //Livro 1 - dados
        livro1.setIsbn(11);
        livro1.setTitulo("A Dama de Vermelho");
        livro1.setAutor("Milionario e Ze Rico");
        livro1.setPreco(12.89);
        //Livro 2 - dados
        livro2.setIsbn(12);
        livro2.setTitulo("Branca de Neve");
        livro2.setAutor("Dengoso");
        livro2.setPreco(51.09);
        //registrar o emprestimo do livro 2
        livro2.registrarEmprestimo();
        Thread.sleep(5000); //5 segundos esperando
        //registrar a devolução do livro 2
        livro2.registrarDevolucao();
        //mostrar os dados do primeiro livro
        livro1.imprimir();
        Livro livro3 = new Livro();
        livro3.setIsbn(13);
        livro3.setTitulo("Dark");
        livro3.setAutor("Ze");
        livro3.setPreco(1000.0);
        livro3.imprimir();
    }
}