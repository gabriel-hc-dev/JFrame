package avaliacao0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    public Connection conn = null;
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/avaliacao0910";
    private final String login = "postgres";
    private final String senha = "root";

    public boolean getConnection() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, login, senha);
            System.out.println("conectou...");
            return true;
        } catch (ClassNotFoundException erro) {
            System.out.println("Driver não encontrado" + erro.toString());
            return false;
        } catch (SQLException erro) {
            System.out.println("falha de conexão" + erro.toString());
        }
        return false;
    }
}
