import java.util.*;

public class PhoneBook {
    HashMap<String, TreeSet<Integer>> phoneBook = new HashMap<>();
    public void addNumber(String name, int phoneNum) {
        boolean hasKey = phoneBook.containsKey(name);
        TreeSet<Integer> set;
        if (hasKey){
            set = phoneBook.get(name);
        }else{
            set = new TreeSet<>();
        }
        set.add(phoneNum);
        phoneBook.put(name, set);
    }

    public void findNumber(String name) {
        if (phoneBook.containsKey(name)){
            TreeSet<Integer> set = (TreeSet<Integer>) phoneBook.get(name).descendingSet();
            System.out.printf("Номера телефонов пользователя %s: ", name);
            for (int element : set) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }else{
            System.out.printf("Номеров для имени %s не найдено\n", name);
        }
    }
    public void printPhoneBook() {
        for (Map.Entry<String, TreeSet<Integer>> entry : phoneBook.entrySet()) {
            findNumber(entry.getKey());
        }
    }
}
