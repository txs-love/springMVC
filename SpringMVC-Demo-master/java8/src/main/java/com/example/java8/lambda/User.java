package com.example.java8.lambda;

/**
 * @author txssherry@gmail.com
 * @date 2023/1/15 4:11
 */
public class User {
    private String name;
    private Integer age;
    public User(){}
    public User(String name,Integer age){
        this.age=age;
        this.name=name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object obj){
        if (obj instanceof User)
            return name.equals(((User) obj).name) && age ==(((User) obj).age);
        else
                return false;
    }
}
