public class Main {
  public static void main(String[] args) {
    ContaInvestimento poupanca = new ContaInvestimento(1000.00, 10);

    for (int i = 1; i <= 5; i++) {
      poupanca.adicioneJuros();
      System.out.println("Saldo após " + i + " mês(es): R$" + poupanca.mostrarSaldo());
    }
  }
}