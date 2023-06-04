import java.sql.*;

public class db_test {
    public static void main(String args[]) {
        System.out.println("Treiber laden...");
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Treiber konnte nicht geladen werden");
            System.exit(100);
        }

        String url = "jdbc:mariadb://localhost:3306";
        String username = "root";
        String password = "root";

        System.out.println("Verbindung herstellen");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected");

            try (PreparedStatement statement = connection.prepareStatement("SELECT test FROM testtable")) {
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    String val1 = resultSet.getString("test");
                    System.out.println(val1);
                }




            } catch (SQLException e) {
                System.out.println("Query error");
                System.exit(102);
            }
        } catch (SQLException e) {
            System.out.println("Connection error");
            System.exit(101);
        }

    }

}
