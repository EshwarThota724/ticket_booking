package tkt_booking_management;
public class User {
    private String name;
    private String phno;
    private String email;
    private String address;
    private String userName;
    private String password;

    public User(String name, String phno, String email, String address, String user_name, String password) {
        this.name = name;
        this.phno = phno;
        this.email = email;
        this.address = address;
        this.user_name = user_name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPhno() {
        return phno;
    }

    public String getEmail() {
        return email;
    }

    public String g…
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String username;
    private String password;

    private static List<User> registeredUsers = new ArrayList<>();

    public User(String name, String phoneNumber, String email, String address, String username, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("\\d{10}")) { 
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number format.");
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password; // Ideally, hash this
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public static void handleUserLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User registeredUser : registeredUsers) {
            if (registeredUser.getUsername().equals(username)) {
                if (registeredUser.getPassword().equals(password)) {
                    System.out.println("Login successful. Welcome, " + registeredUser.getName() + "!");
                    return;
                } else {
                    System.out.println("Incorrect password. Please try again.");
                    return;
                }
            }
        }

        System.out.println("Username not found.  sign up!");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        User newUser = new User(name, phoneNumber, email, address, username, password);
        registeredUsers.add(newUser);
        System.out.println("Sign-up successful. Welcome, " + name + "!");
    }
}
