public class ForArray {
  public static void main(String[] args) {
    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    for (int x = 0; x < alunos.length; x++) {
      System.out.println("O aluno no indice " + x + " é " + alunos[x]);
    }
  }
}
