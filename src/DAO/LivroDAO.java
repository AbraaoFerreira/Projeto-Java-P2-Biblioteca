package DAO;

import ConexaoBancoDeDados.Conexao;
import model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {
    private Connection connection;

    public LivroDAO() {
        this.connection = Conexao.GeraConexao();
    }

    public void adicionarItem(Livro livro) {
        String sql = "INSERT INTO Livro (titulo, autor, codigo, emprestado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getCodigo());
            stmt.setBoolean(4, !livro.estaDisponivel());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public LivroDAO(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
