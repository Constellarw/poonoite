import java.util.Random;

public class Tabuleiro {
    private int[][] matriz = new int[10][10];
    private int[] palpite = new int[2];

    public Tabuleiro(){
        //metodo construtor
        montarTabuleiro();
    }

    private void montarTabuleiro(){
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = r.nextInt(101);
            }
        }
    }

    public void palpitar(int a, int b){
        palpite[0] = a;
        palpite[1] = b;
        int cont = 0;
        for (int p = 0; p < 2; p++) { //percorrer palpites
            for (int i = 0; i < 10; i++) { //percorrer as linhas
                for (int j = 0; j < 10; j++) { //percorrer as colunas
                    if(palpite[p] == matriz[i][j]) cont++;
                }
            }
        }
        mostrarResultado(cont);

    }

    private void mostrarResultado(int cont){
        double premio = 0.0;
        if(cont>=3){
            premio = cont * 1000;
        }
        if(premio > 0){
            System.out.printf("Parabéns você acertou %d vezes\n", cont);
            System.out.println("Seu premio R$ " + premio);
        }else{
            System.out.println("Infelizmente você perdeu");
        }
        apresentarTabuleiro();
    }

    private void apresentarTabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(matriz[i][j] == palpite[0] || matriz[i][j] == palpite[1]){
                    System.out.printf("[%3d]*", matriz[i][j]);
                }else{
                    System.out.printf("[%3d] ", matriz[i][j]);
                }

            }
            System.out.println();
        }
    }
}
