public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;

    public void atbCarro(String marca, String modelo, int ano, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.atbCarro("Renault", "kwid", 2020, "Cinza");

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println(carro.cor);
        }
    }
