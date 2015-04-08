/**
 * Created by student on 08.04.2015.
 */
public class Adress {
    private String Name;
    private String Phone;
    private String Email;

    public Adress(String name, String phone, String email) {
        Name = name;
        Phone = phone;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public String toString() {
        return "Name = " + Name + "\nPhone =" + Phone + "\nEmail = " + Email;
    }
}
