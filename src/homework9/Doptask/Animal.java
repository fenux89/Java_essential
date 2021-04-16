package homework9.Doptask;

import homework9.task2.Monitor;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tail;
    int hashCode;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
        this.hashCode = this.hashCode();
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + "; возраст: " + this.age + "; хвост: " + (this.tail ? "есть" : "нет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        if ((name != animal.name) || (age != animal.age) || (tail != animal.tail)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        if (this.hashCode == 0) {
            int result = 11;
            result = 11 * result + (name == null ? 0 : name.hashCode());
            result = 11 * result + (int) age;
            result = 11 * result + (tail ? 1 : 0);
            return Objects.hash(result);
        }
        return this.hashCode;
    }
}
