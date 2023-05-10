package exceptions;

public class CaixaException extends Exception {
    private String mensagemErro;
    private int codigoErro;

    public CaixaException(int codigoErro){
        this.codigoErro = codigoErro;
    }

    @Override
    public String getMessage() {
        switch (codigoErro){
            case 1:
                mensagemErro = "Valor inválido para depósito";
                break;
            case 2:
                mensagemErro = "Saldo insuficiente para saque";
                break;
        }
        return mensagemErro;
    }
}
