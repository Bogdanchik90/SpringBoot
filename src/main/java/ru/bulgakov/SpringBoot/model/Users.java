package ru.bulgakov.SpringBoot.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    @NotEmpty(message = "имя не может быть пустым")
    @Size(min = 2, max = 30, message = "имя должно быть от 2 до 30 символов")
    private String name;
    @Min(value = 0, message = "возраст не может быть отрицательным")
    @Column(name = "age")
    private int age;

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
