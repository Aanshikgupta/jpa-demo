package com.aanshik.demojpa.Entities;


import jakarta.persistence.*;

@Entity
public class Student
{
    //mark id as primary key
    @Id
//defining id as column name
    @GeneratedValue
    private int id;
    //defining name as column name
    @Column
    private String name;
    //defining age as column name
    @Column
    private int age;
    //defining email as column name
    @Column
    private String email;



    public Student(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Student() {

    }

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}