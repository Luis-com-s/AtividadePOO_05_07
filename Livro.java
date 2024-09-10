public class Livro {
    public String titulo;
    public String autor;
    public int paginas;

     public void atbLivro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void descricao(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.atbLivro("Harry Potter e a Pedra Filosofal", "J.K. ROWLING", 264);

        livro.descricao();
    }
}
