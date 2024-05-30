package model;

import Interface.ItemEmprestavel;
import java.util.ArrayList;
import java.util.List;

public class GestorEmprestimos {
    private List<Livro> livros;

    public GestorEmprestimos() {
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, String autor) {
        Livro novoLivro = new Livro(titulo, autor);
        livros.add(novoLivro);
        System.out.println("Livro \"" + titulo + "\" cadastrado com sucesso.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            if (livro.estaDisponivel()) {
                System.out.println(" - Título: " + livro.getTitulo() + " | Autor: " + livro.getAutor());
            }
        }
    }

    public void emprestarItem(ItemEmprestavel item) {
        if (item.estaDisponivel()) {
            item.emprestar();
        } else {
            System.out.println("O item não está disponível para empréstimo.");
        }
    }

    public void devolverItem(ItemEmprestavel item) {
        item.devolver();
    }
}
