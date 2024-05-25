package com.example.application;

public class User {
    private int Id;
    private String Login;
    private String Password;
    private String Email;

    public User(){

    }

    public User(int id, String login, String password, String email) {
        Id = id;
        Login = login;
        Password = password;
        Email = email;
    }

    public int GetId(){
        return Id;
    }

    public void SetId(int id){
        this.Id = id;
    }

    public String GetLogin(){
        return Login;
    }

    public void SetLogin(String login){
        this.Login = login;
    }

    public String GetPassword(){
        return Password;
    }

    public void SetPassword(String password){
        this.Password = password;
    }

    public String GetEmail(){
        return Email;
    }

    public void SetEmail(String email){
        this.Email = email;
    }
}
