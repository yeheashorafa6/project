/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class User {
    private int id;
      private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String age;
    private String email;
    private String phone;
    private String gender;//enum("female","male")
    private String role;//enum("admin","patient")

    public User(String username, String password, String firstName, String lastName,
                String age, String email, String phone, String gender, String role) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.role = role;
    }

    public User() {}

    
    public int getId() {
        return id;
    }
    public void setId(int  id) {
        this.id=id;
    }
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
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
    
    //crate , updata , delete , red
    //create a new user in users table
    public int save() throws SQLException, ClassNotFoundException{
        Connection c = DbConnection.getInstance().getConnection();
        PreparedStatement ps = null;
        int recordCounter =0;
        String sql = "INSERT INTO users (id,user_name,password,first_name,last_name,"
                + "age,email,phone,gender,role) VALUES (?, ?, ?, ?,?,?,?,?,?,?)";
        ps = c.prepareStatement(sql);
        ps.setInt(1, this.getId());
        ps.setString(2,this.getUsername());
        ps.setString(3, this.getPassword());
        ps.setString(4, this.getFirstName());
        ps.setString(5, this.getLastName());
        ps.setString(6, this.getAge());
        ps.setString(7, this.getEmail());
        ps.setString(8, this.getPhone());
        ps.setString(8, this.getGender());
        ps.setString(10, this.getRole());
        recordCounter = ps.executeUpdate();
        if (recordCounter > 0) {
            System.out.println(this.getUsername()
                    +" User was added successfully!");
        }
        if (ps != null){
            ps.close();
        }
        c.close();
        return recordCounter;  
    }
    
}
