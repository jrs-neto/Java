public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("12345678978", "Marcos");

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
