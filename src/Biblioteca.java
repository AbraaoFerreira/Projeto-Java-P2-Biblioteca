import java.util.Scanner;
import DAO.LivroDAO;
import model.GestorEmprestimos;
import model.Livro;

public class Biblioteca {
    public static void main(String[] args) {
        GestorEmprestimos ge = new GestorEmprestimos();
        LivroDAO livroDAO = new LivroDAO();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Listar livros disponíveis");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarLivro(sc, ge, livroDAO);
                    break;
                case 2:
                    ge.listarLivrosDisponiveis();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);

        sc.close();
    }

    private static void cadastrarLivro(Scanner sc, GestorEmprestimos ge, LivroDAO livroDAO) {
        System.out.println("Digite o título do livro:");
        String titulo = sc.nextLine();

        System.out.println("Digite o nome do autor do livro:");
        String autor = sc.nextLine();

        Livro novoLivro = new Livro(titulo, autor);
        ge.cadastrarLivro(titulo, autor);
        livroDAO.adicionarItem(novoLivro);
        System.out.println("Livro \"" + titulo + "\" cadastrado com sucesso.");
    }
}
