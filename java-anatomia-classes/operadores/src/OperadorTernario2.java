public class OperadorTernario2 {
  public static void main(String[] args) {
    String nomeUm = "José";
    String nomeDois = new String("José");

    System.out.println(nomeUm.equals(nomeDois));
    System.out.println(nomeUm == nomeDois);

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if (numero1 < numero2) {
      System.out.println("A condição é verdadeira");
    }

    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente de numeroDois? " + simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior que numeroDois? " + simNao);

  }
}
