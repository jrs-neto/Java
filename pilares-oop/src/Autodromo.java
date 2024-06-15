public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("8798526");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("897856");
        z400.ligar();
    }
}
