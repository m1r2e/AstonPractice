package homework6.task1;

/**
 * Задача 1:
 * Создать класс, в котором будет статический метод. Этот метод принимает на вход три
 * параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
 * login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
 * соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
 * password должна быть меньше 20 символов, не должен содержать пробелом и должен
 * содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить
 * WrongPasswordException. WrongPasswordException и WrongLoginException -
 * пользовательские классы исключения с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Метод возвращает true, если значения верны, false в противном случае
 */

public class UserValidator {

    private static boolean validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login == null || login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Wrong login");
        }

        if (password == null || password.length() >= 20 || password.contains(" ")
                || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password");
        }

        return true;
    }

    public static void main(String[] args) {
        try {
            System.out.println(validate("user", "password1", "password1"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
        }
    }

}
