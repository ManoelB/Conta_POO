public class Conta {
    protected double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    public void executarOperacao(Operacao opr) {
        saldo += opr.operar();
    }

    public double getSaldo() {
        return saldo;
    }
}