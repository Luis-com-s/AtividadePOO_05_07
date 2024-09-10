public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.atbCarro("Renault", "kwid", 2020, "Cinza");

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println(carro.cor);
        }
    }