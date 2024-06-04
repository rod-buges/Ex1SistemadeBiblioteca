package Ex1SistemadeBiblioteca;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Biblioteca {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.setLivro("O Homem Mais Rico da Babilônia", "George S. Clason", 1926);
        System.out.println(l1.getClass().getName()
                + "\n O título é: " + l1.getTitulo() + "\n O autor é: " + l1.getAutor() + "\n O ano de publicação é: " + l1.getAnoPublicacao());

        Livro l2 = new Livro();
        l2.setLivro("Os segredos da mente Milionária", "T. Harv Eker", 2005);
        System.out.println(l2.getClass().getName()
                + "\n O título é: " + l2.getTitulo() + "\n O autor é: " + l2.getAutor() + "\n O ano de publicação é: " + l2.getAnoPublicacao());

        Livro l3 = new Livro();
        l3.setLivro("O poder do hábito", "Charles Duhigg", 2012);
        System.out.println(l3.getClass().getName()
                + "\n O título é: " + l3.getTitulo() + "\n O autor é: " + l3.getAutor() + "\n 0 ano de publicação é: " + l3.getAnoPublicacao());
    }

    static void listarLivros(){
        Livro l1 = new Livro();
        l1.setLivro("O Homem Mais Rico da Babilônia", "George S. Clason", 1926);
        Livro l2 = new Livro();
        l2.setLivro("Os segredos da mente Milionária", "T. Harv Eker", 2005);
        Livro l3 = new Livro();
        l3.setLivro("O poder do hábito", "Charles Duhigg", 2012);
        System.out.println(l1.getClass().getName()
 + "\n O título é: " + l1.getTitulo() + "\n O autor é: " + l1.getAutor() + "\n O ano de publicação é: " + l1.getAnoPublicacao());
        System.out.println(l2.getClass().getName()
 + "\n O título é: " + l2.getTitulo() + "\n O autor é: " + l2.getAutor() + "\n O ano de publicação é: " + l2.getAnoPublicacao());
        System.out.println(l3.getClass().getName()
 + "\n O título é: " + l3.getTitulo() + "\n O autor é: " + l3.getAutor() + "\n 0 ano de publicação é: " + l3.getAnoPublicacao());

    }
}