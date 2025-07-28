package Day_7;
import java.util.*;

class Contact {
    String name;
    String phone;
    String email;
    String address;

    Contact(String nm, String ph, String em, String add) {
        this.name = nm;
        this.phone = ph;
        this.email = em;
        this.address = add;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return name + " | " + phone + " | " + email + " | " + address;
    }
}

public class AddressBook<K, V extends Contact> {
    Map<String, Contact> map;

    AddressBook() {
        map = new HashMap<>();
    }

    public void addContact(K key, V contact) {
        map.put(key.toString(), contact);
    }

    public void removeContact(K key) {
        map.remove(key.toString());
    }

    public Contact searchContact(K key) {
        return map.get(key.toString());
    }

    public void listContacts() {
        for (Map.Entry<String, Contact> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public boolean hasSameAddress(Contact val1, Contact val2) {
        return val1.getAddress().equalsIgnoreCase(val2.getAddress());
    }

    public void sortByName() {
        List<Contact> list = new ArrayList<>(map.values());
        list.sort(Comparator.comparing(Contact::getName));
        list.forEach(System.out::println);
    }
    
    public void sortByPhone() {
    	List<Contact> list=new ArrayList<>(map.values());
    	list.sort(Comparator.comparing(Contact::getPhone));
    	list.forEach(System.out::println);
    }
    
    public static void main(String[] args) {
    	AddressBook<String,Contact> ab=new AddressBook();
    	
    	Contact c1=new Contact("Alice","8077332988","alice.gmail.com","GLA University");
    	Contact c2=new Contact("Bob","8011323988","bob.gmail.com","Kasganj");
    	Contact c3=new Contact("Prince","8077332345","prince.gmail.com","GLA University");
    	
    	ab.addContact(c1.getName(), c1);
    	ab.addContact(c2.getName(), c2);
    	ab.addContact(c3.getName(), c3);
    	
    	ab.listContacts();
    	
    	System.out.println();
    	ab.removeContact(c1.getName());
    	ab.listContacts();

    	System.out.println();
    	ab.sortByName();
    	
    	System.out.println(ab.hasSameAddress(c2,c3));
    }
}
