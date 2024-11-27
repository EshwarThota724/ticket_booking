package tkt_booking_management;

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
