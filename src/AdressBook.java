/**
 * Created by student on 08.04.2015.
 */
public class AdressBook {
    private Adress[] book = new Adress[100];
    private int count = 0;

    public void add(Adress a) {
        //AdressBook b1 = new AdressBook();
        book[count] = a;
        count++;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(book[i]);
        }
    }

    int[] find(String search) {
        int resultCount = 0;
        for (int i = 0; i < count; i++) {
            if (book[i].getName().startsWith(search)) {
                resultCount++;
            }
        }
        int found =0;
        int[] result = new int[resultCount];
        for (int i = 0; i < count; i++) {
            if (book[i].getName().startsWith(search)) {
                result[found] = i;
                found++;
            }
        }
        return result;
    }

    public Adress get(int index) {
        return book[index];
    }

    public void delete(int index) {
        for (int i =index+1; i<count; i++) {
            book[i - 1] = book[i];
        }
        book[count - 1] = null;
        count--;
    }
}

