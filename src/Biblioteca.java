import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {

        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, String autor) {
        Livro novoLivro = new Livro(titulo, autor);
        livros.add(novoLivro);
        System.out.println("Livro \"" + titulo + "\" Cadastrado com Sucesso. ");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis na biblioteca: ");
        for (Livro livro : livros) {
            if (livro.estaDisponivel()) {
                System.out.println(" - Título: " + livro.getTitulo() + " | Autor: " + livro.getAutor());
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\nDigite o título do Livro (ou 'Sair' para encerrar)");
            String titulo = sc.nextLine();

            if (titulo.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o nome do Autor: do livro");
            String autor = sc.nextLine();


            biblioteca.cadastrarLivro(titulo, autor);
        }


        biblioteca.listarLivrosDisponiveis();

        sc.close();

    }
}

