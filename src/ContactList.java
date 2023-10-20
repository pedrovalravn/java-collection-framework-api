import java.util.HashSet;
import java.util.Set;

public class ContactList {
    private Set<Contact> contactSet;

    public ContactList(){
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int number){
        contactSet.add(new Contact(name, number));
    }

    public void showContact(){
        System.out.println(contactSet);
    }

    public Set<Contact> searchByName(String name){
        Set<Contact> contactsPerName = new HashSet<>();
        for(Contact c : contactSet){
            if(c.getName().startsWith(name)){
                contactsPerName.add(c);
            }
        }
        return contactsPerName;
    }

    public Contact refreshContactList(String name, int newNumber){
        Contact updatedContact = null;
        for(Contact c : contactSet){
            if(c.getName().equalsIgnoreCase(name)){
                c.setNumber(newNumber);
                updatedContact = c;
                break;
            }
        }
        return updatedContact;
    }

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        contactList.showContact();

        contactList.addContact("Peter", 1234567);
        contactList.addContact("Gustavo Fring", 231231131);
        contactList.addContact("Walter White", 1234567);
        contactList.addContact("Jesse Pinkman", 53456642);
        contactList.addContact("Hank", 1456335323);
        contactList.addContact("Ignacio Varga", 345454355);
        contactList.addContact("Lalo Salamanca", 4534543);

        contactList.showContact();

        System.out.println(contactList.searchByName("Walter White"));

        System.out.println("Updated contact: " + contactList.refreshContactList("Jesse Pinkman", 333333));

        contactList.showContact();

    }
}
