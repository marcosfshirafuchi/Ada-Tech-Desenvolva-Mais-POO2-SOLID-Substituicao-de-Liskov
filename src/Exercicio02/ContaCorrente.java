package Exercicio02;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente para saque!" );
            return;
        }
        saldo -= valor;
    }
}
