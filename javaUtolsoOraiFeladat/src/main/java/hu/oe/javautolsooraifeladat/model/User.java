package hu.oe.javautolsooraifeladat.model;

import java.util.Objects;

public class User {
    private String username;
    private String password;
    private String fullname;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {
    }

    public User(String username, String password, String fullname, String address) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(fullname, user.fullname) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, fullname, address);
    }

    public boolean isPasswordCorrect(String pw){
        return pw.equals(password);
    }
}
