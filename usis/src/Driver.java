import java.util.Scanner;
import java.sql.*;

public class Driver extends Students{
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/db310";
        String username = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            while(true) {
                System.out.println("----- Press (1) : Registration -----");
                System.out.println("----- Press (2) : Login -----");
                System.out.println("----- Press (3) : Show Student Table -----");
                System.out.println("----- Press (0) : Exit -----");

                Scanner input = new Scanner(System.in);
                System.out.print("Action : ");
                String userInput = input.nextLine();

                if(userInput.equals("1")) {
                    System.out.print("Student Id :");
                    String sId = input.nextLine();
                    System.out.print("Name:");
                    String sName = input.nextLine();
                    System.out.print("Set Email :");
                    String email = input.nextLine();
                    System.out.print("Set Password :");
                    String pass = input.nextLine();

                    String addStudent = "INSERT INTO students (sid, name, email, password) VALUES (?, ?, ?, ?)";
                    PreparedStatement preparedStatement = con.prepareStatement(addStudent);

                    preparedStatement.setString(1, sId);
                    preparedStatement.setString(2, sName);
                    preparedStatement.setString(3, email);
                    preparedStatement.setString(4, pass);
                    preparedStatement.executeUpdate();

                }
                if(userInput.equals("2")) {
                    System.out.print("Email :");
                    String loginEmail = input.nextLine();
                    System.out.print("Password :");
                    String loginPass = input.nextLine();

                    String loginStudent = "SELECT sid, name FROM students WHERE email = ? and password = ?";
                    PreparedStatement preparedStatement = con.prepareStatement(loginStudent);
                    preparedStatement.setString(1, loginEmail);
                    preparedStatement.setString(2, loginPass);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()) {
                        String storedEmail = resultSet.getString("email");
                        String storedPassword = resultSet.getString("password");
                        if (loginEmail.equals(storedEmail) && loginPass.equals(storedPassword))
                            System.out.println("Login successful!");
                        else System.out.println("Invalid password!");
                    } else System.out.println("Invalid username!");

                }
                if(userInput.equals("0")) {
                    break;
                }
                if(userInput.equals("3")) {
                    printTable(con, statement);

                }
            }

        } catch (Exception e) {
            System.out.println("Database not connected");
        }
    }
}
