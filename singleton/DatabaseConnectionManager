import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    // Instância única (Singleton)
    private static DatabaseConnectionManager instance;

    // Objeto de conexão com o banco
    private Connection connection;

    // Dados de conexão
    private final String url = "jdbc:postgresql://localhost:5432/meubanco";
    private final String username = "usuario";
    private final String password = "senha";

    // Construtor privado para evitar criação externa
    private DatabaseConnectionManager() {
        try {
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexão estabelecida com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar ao banco de dados.");
        }
    }

    // Método público para acesso à instância única
    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    // Método para obter a conexão
    public Connection getConnection() {
        return connection;
    }
}
