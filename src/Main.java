import java.util.Scanner;

/**
 * Created by student on 08.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        AdressBook bookId = new AdressBook();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Добавление записи (дополнительно запрашивается имя, телефон и e-mail)");
            System.out.println ( "2. Добавление записи для поиска");
            System.out.println("3. Вывод всех записей");
            System.out.println("4.Удаление записи (дополнительно запрашивается индекс записи для удаления)");
            System.out.println("5. Изменение записи (дополнительно запрашивается индекс изменяемой записи, новые имя, телефон и e-mail)");
            System.out.println("6. Выход из программы ");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //void add(Adress newEntry);
                    System.out.println("Введите имя");
                    String name = sc.next();
                    System.out.println("Введите телефон");
                    String phone = sc.next();
                    System.out.println("Введите e-mail)");
                    String email = sc.next();
                    bookId.add(new Adress(name, phone, email));
                    break;
                case 2:
                    System.out.println("Введите для поиска");
                    String search = sc.next();
                    int[] found = bookId.find(search);
                    for (int i = 0; i < found.length; i++) {
                        int index = found[i];
                        System.out.println(bookId.get(index));
                    }
                    //int[] find(String name);
                    break;
                case 3:
                    bookId.print();
                    break;
                case 4:
                    System.out.println("Удаление записи");
                    int indexDelete = sc.nextInt();
                    bookId.delete(indexDelete);
                    break;
                case 5:
                    System.out.println("Изменение записи, введите индекс");
                    int indexEdit = sc.nextInt();
                        System.out.println("Введите имя");
                        String newname = sc.next();
                        System.out.println("Введите телефон");
                        String newphone = sc.next();
                        System.out.println("Введите e-mail)");
                        String newemail = sc.next();
                    bookId.edit(indexEdit, new Adress(newname, newphone, newemail));
                    break;
            }
        }
    }
}
