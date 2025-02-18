package Exercicio02;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double saldo) {
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
