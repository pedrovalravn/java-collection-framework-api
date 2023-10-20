import java.util.HashMap;
import java.util.Map;

public class AgendaContacts {
    private Map<String, Integer> agendaContactMap;

    public AgendaContacts(){
        this.agendaContactMap = new HashMap<>();
    }

    public void addContact(String name, Integer number){
        agendaContactMap.put(name, number);
    }

    public void removeContact(String name){
        if(!agendaContactMap.isEmpty()){
            agendaContactMap.remove(name);
        }
    }

    public void showContact(){
        System.out.println(agendaContactMap);
    }

    public Integer searchByName(String name){
        Integer numberForName = null;
        if(!agendaContactMap.isEmpty()){
            numberForName = agendaContactMap.get(name);
        }
        return numberForName;
    }

    public static void main(String[] args) {
        AgendaContacts agendaContacts = new AgendaContacts();

        agendaContacts.addContact("Luke", 1424342);
        agendaContacts.addContact("Kylo Ren", 867882);
        agendaContacts.addContact("Han Solo", 5675885);
        agendaContacts.addContact("Chewbacca", 434556);
        agendaContacts.addContact("Yoda", 4564564);
        agendaContacts.addContact("Palpatine", 6564566);
        agendaContacts.addContact("Darth Vader", 456654);
        
        agendaContacts.showContact();

        agendaContacts.removeContact("Han Solo");
        agendaContacts.showContact();

        System.out.println("The number is: " + agendaContacts.searchByName("Darth Vader"));

    }
}
