public abstract class ItemBiblioteca {
    private String titulo;
    private String codigo;

    public ItemBiblioteca(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}


