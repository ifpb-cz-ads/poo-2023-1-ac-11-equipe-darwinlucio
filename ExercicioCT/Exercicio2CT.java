public class Exercixio2 {
    public static void main(String[] args) {
        Poupança poupança = new Poupança();
        poupança.depositar(1000); 
        poupança.reajustar(0.05); 
        System.out.println("Saldo atual da poupança: " + poupança.getSaldo()); 
    }
}

