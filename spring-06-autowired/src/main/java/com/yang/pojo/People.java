package com.yang.pojo;

/**
 * @ClassName People
 * @Author yang
 * @Description //TODO
 * @Date 22/07/17 22:21
 * @Version v1.0
 **/


public class People {
    Cat cat;
    Dog dog;
    String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
