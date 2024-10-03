package Connection;

import java.sql.*;

public class connect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/usuarios";
        String username = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");

            while (resultSet.next()){
                System.out.println(resultSet.getString("id_usuario") + " | " + resultSet.getString("nombre") + " | " + resultSet.getString("apellido") + " | " + resultSet.getString("dni") + " | " + resultSet.getString("fecha_nacimiento") + " | " + resultSet.getString("direccion") + " | " + resultSet.getString("correo_electronico") + " | " + resultSet.getString("obra_social") + " | " + resultSet.getString("num_afiliado") + " |");

            }

            connection.close();
            statement.close();
            resultSet.close();

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
