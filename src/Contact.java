import java.util.Objects;

public class Contact {

    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getName(), contact.getName());
    }

    @Override
    public String toString() {
        return "{" + name + "," + number + "}";
    }
}
