interface Investimento {
    void reajustar(double taxa);
}


class Conta {

}

class Poupança extends Conta implements Investimento {

    @Override
    public void reajustar(double taxa) {

        double saldoAtual = getSaldo(); 
        double novoSaldo = saldoAtual + (saldoAtual * taxa);
        setSaldo(novoSaldo);
}

