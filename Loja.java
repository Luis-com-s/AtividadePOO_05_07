import java.util.List;
import java.util.ArrayList;

public class Loja {
    String nome;
    String endereco;
    List<Produto> produtos;

    public Loja(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.produtos = new ArrayList<>();
    }

    public void adicionar_produto(Produto produto){
        this.produtos.add(produto);
    }

    public void listar_produto(){
        System.out.println("Produto   \tPreco");
        System.out.println("=====================");
        for(int i = 0; i <= produtos.size()-1; i++){
            Produto produto = this.produtos.get(i);
            System.out.println(produto.nome +"\t"+produto.preco);
        }
        System.out.println("=====================\n");
    }
    public void vender_produto(String nome) {
        for (int i = 0; i <= produtos.size()-1; i++) {
            Produto produto = this.produtos.get(i);
            if (produto.nome.equals(nome)) {
                produtos.remove(i);
            }
        }
    }

    public static void main(String[] args){

        Loja minhaLoja = new Loja("bugingangas.com", "rua x");
        
        Produto produto1 = new Produto("AppleWatch", 1400.00);
        Produto produto2 = new Produto("SmartTv", 1698.00);
        Produto produto3 = new Produto("Smartphone Samsung Galaxy S24", 3000.00);
        Produto produto4 = new Produto("Giftcard Spotify", 17.00);

        minhaLoja.adicionar_produto(produto1);
        minhaLoja.adicionar_produto(produto2);
        minhaLoja.adicionar_produto(produto3);
        minhaLoja.adicionar_produto(produto4);

        minhaLoja.listar_produto();
        minhaLoja.vender_produto("SmartTv");

        minhaLoja.listar_produto();
    }
}
