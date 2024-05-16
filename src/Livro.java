import Interface.ItemEmprestavel;

public class Livro extends ItemBiblioteca implements ItemEmprestavel {
    private static  int proximoCodigo = 1;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        super(titulo, gerarCodigo());
        this.autor = autor;
        this.emprestado = false;
    }

    private static synchronized String gerarCodigo() {
        return String.format("%04d", proximoCodigo++);
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro \"" + getTitulo() + "\" emprestado.");
        } else {
            System.out.println("Livro \"" + getTitulo() + "\" já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro \"" + getTitulo() + "\" devolvido. ");
        } else {
            System.out.println("Livro \"" + getTitulo() + "\" não está emprestado. ");
        }
    }


    @Override
    public boolean estaDisponivel() {
        return !emprestado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

