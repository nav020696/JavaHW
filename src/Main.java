import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("Введите команду:");
            System.out.println("exit - завершение программы");
            System.out.println("add - добавить номер в телефонный справочник");
            System.out.println("find - найти номер телефона по имени");
            System.out.println("print - вывести весь справочник");
            System.out.println("delete name - удалить из справочника данные по имени");
            System.out.println("delete number - удалить из справочника телефон по имени");
            String input = reader.readLine().trim();
            if (input.equals("exit")){
                System.out.println("До свидания");
                break;
            }
            if (input.equals("add")){
                System.out.println("Введите имя:");
                String name = reader.readLine();
                System.out.println("Введите номер телефона:");
                int number = Integer.parseInt(reader.readLine());
                phoneBook.addNumber(name, number);
            }
            if (input.equals("find")){
                System.out.println("Введите имя:");
                phoneBook.findNumber(reader.readLine());
            }
            if (input.equals("print")){
                phoneBook.printPhoneBook();
            }
            if (input.equals("delete name")){
                System.out.println("Введите имя:");
                phoneBook.deleteName(reader.readLine());
            }
            if (input.equals("delete number")){
                System.out.println("Введите имя:");
                String name = reader.readLine();
                System.out.println("Введите номер телефона:");
                int number = Integer.parseInt(reader.readLine());
                phoneBook.deleteNumber(name, number);
            }
        }
    }
}