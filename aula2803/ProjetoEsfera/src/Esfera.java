public class Esfera {
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularVolume(){
        return 4.0/3.0 * Math.PI * Math.pow(raio, 3.0);
    }
}
