package homework2.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MutablePerson {

    private String name;
    private int age;
    private List<String> hobbies = new ArrayList<>();

    public MutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
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

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public void addHobbies(String... hobbies) {
        Collections.addAll(this.hobbies, hobbies);
    }

    @Override
    public String toString() {
        return "MutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
