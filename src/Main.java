import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Connection conexion = null;
        Statement st = null;
        ResultSet rs = null;

        String dbURL = "jdbc:mysql://localhost/prueba2";
        String dbUser = "root";
        String dbPwd = "unafacil";

        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("\nApellido:");
        String apellido = sc.nextLine();
        System.out.println("");
        String sql = "INSERT INTO empleados (nombre, apellido, area) VALUES ('"+nombre+"', '"+apellido+"', 1)";

        try {
            conexion = DriverManager.getConnection(dbURL, dbUser, dbPwd);
            st = conexion.createStatement();
            st.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
