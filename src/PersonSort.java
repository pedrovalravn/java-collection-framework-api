import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSort {
    private List<Person> personList;
    
    public PersonSort(){
        this.personList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height){
        personList.add(new Person(name, age, height));
    }

    public List<Person> sortByAge(){
        List<Person> personByAge = new ArrayList<>(personList);
        Collections.sort(personByAge);
        return personByAge;
    }

    public List<Person> sortByHeight(){
        List<Person> personByHeight = new ArrayList<>(personList);
        Collections.sort(personByHeight, new CompareByHeight());
        return personByHeight;
    }

    public static void main(String[] args) {
        PersonSort sortPerson = new PersonSort();
        sortPerson.addPerson("Name 1", 20, 1.60);
        sortPerson.addPerson("Name 2", 25, 1.80);
        sortPerson.addPerson("Name 3", 40, 1.56);
        sortPerson.addPerson("Name 4", 13, 1.50);

        System.out.println(sortPerson.sortByAge());
        System.out.println(sortPerson.sortByHeight());
    }
}
