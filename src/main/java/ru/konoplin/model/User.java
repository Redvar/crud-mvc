package ru.konoplin.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    @NotEmpty(message = "Поле имя не должно быть пустым.")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "Поле фамилия не должно быть пустым.")
    private String lastName;

    @Column(name = "email")
    @NotEmpty(message = "Поле email не должно быть пустым.")
    private String email;

    @Column(name = "password")
    @NotEmpty(message = "Поле пароль не должно быть пустым.")
    private String password;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("User [id = %d; firstName = %s; lastName = %s; email = %s; password = %s]",
                id, firstName, lastName, email, password);
    }
}
