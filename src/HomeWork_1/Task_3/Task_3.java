package HomeWork_1.Task_3;

import HomeWork_1.Task_1.User;

/**
 * 3. Попробуйте различные варианты установки значений свойств объектов: через
 *    конструктор, сеттеры и непосредственное присваивание значений полям объекта.
 */

public class Task_3 {

    public static void main(String[] args) {

        // создаем объект класса User со значениями по умолчанию, которые присвоены им в пустом конструкторе
        User user1 = new User();
        System.out.println(user1);

        // создаем объект класса User передав в коструктор имя, фамилию и возраст.
        User user2 = new User("James", "Franco", 46);
        System.out.println(user2);

        // создаем объект класса User со значениями по умолчанию, которые присвоены им в пустом конструкторе
        // после устанавливаем новые значения при помощи сеттеров
        User user3 = new User();
        user3.setFirstname("Johnny");
        user3.setLastname("Depp");
        user3.setAge(60);
        System.out.println(user3);

    }
}
