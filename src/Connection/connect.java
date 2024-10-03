package Connection;

import Clases.Pasajero;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class connect {

    private static final String URL = "jdbc:mysql://localhost:3306/hotel";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Delta67";

    // Método para obtener la conexión
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // Método para obtener todos los pasajeros
    public List<Pasajero> fetchPasajeros() {
        List<Pasajero> pasajeros = new ArrayList<>();
        String query = "SELECT * FROM pasajeros";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Pasajero pasajero = new Pasajero(
                        resultSet.getString("apellido"),
                        resultSet.getString("nombre"),
                        resultSet.getInt("dni"),
                        resultSet.getInt("telefono"),
                        resultSet.getString("correo_electronico")
                );
                pasajeros.add(pasajero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pasajeros;
    }

    // Método para agregar un pasajero
    public void agregarPasajero(Pasajero pasajero) {
        String query = "INSERT INTO pasajeros (nombre, apellido, dni, telefono, correo_electronico) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, pasajero.getNombre());
            statement.setString(2, pasajero.getApellido());
            statement.setInt(3, pasajero.getDocumento());
            statement.setInt(4, pasajero.getTelefono());
            statement.setString(5, pasajero.get_eMail());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

