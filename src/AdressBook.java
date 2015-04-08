/**
 * Created by student on 08.04.2015.
 */
public class AdressBook {
    private Adress [] book = new Adress [100];
    private int count = 0;

    public void add(Adress a){
        //AdressBook b1 = new AdressBook();
        book [count] = a;
        count++;
    }
    public void print () {
        for (int i=0; i<count; i++) {
            System.out.println(book[i]);
        }
    }
}
