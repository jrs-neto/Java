public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("A Tv está ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status -> A Tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> A Tv está desligada? " + smartTv.ligada);

    }
}
