import java.util.List;
import java.util.ArrayList;

public class Produto {
    String nome;
    double preco;
    List<Produto> produtos;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public static void main(String[] args){

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("AppleWatch", 1400.00));
        produtos.add(new Produto("SmartTv", 1698.00));
        produtos.add(new Produto("Smartphone Samsung Galaxy S24", 3000.00));
        produtos.add(new Produto("Giftcard Spotify", 17.00));

        for(int i = 0; i < produtos.size(); i++){
            Produto produto = produtos.get(i);
            System.out.println("Produto: " + produto.nome + ", Preco: " + produto.preco);
        }
    }

}
