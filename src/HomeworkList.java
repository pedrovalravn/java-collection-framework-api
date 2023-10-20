import java.util.ArrayList;
import java.util.List;

public class HomeworkList {
    
    private List<Homework> homeworkList;
    
    public HomeworkList(){
        this.homeworkList = new ArrayList<>();
    }

    public void addHomework(String description){
        homeworkList.add(new Homework(description));
    }

    public void removeHomework(String description){
        List<Homework> homeworkToRemove = new ArrayList<>();
        for(Homework t : homeworkList){
            if(t.getDescription().equalsIgnoreCase(description)){
            homeworkToRemove.add(t);
            }
        }
        homeworkList.removeAll(homeworkToRemove);
    }

    public int getHomeworkTotal(){
        return homeworkList.size();
    }

    public void getHomeworkDescription(){
        System.out.println(homeworkList);
    }


    public static void main(String[] args) {
        HomeworkList homeworkList = new HomeworkList();
        
        System.out.println("The initial total number of elements on the list is: " + homeworkList.getHomeworkTotal());

        homeworkList.addHomework("Homework 1");
        homeworkList.addHomework("Homework 2");
        homeworkList.addHomework("Homework 3");

        System.out.println("After adding homeworks the total number of elements on the list is: " + homeworkList.getHomeworkTotal());

        homeworkList.removeHomework("Homework 2");

        System.out.println("After removing homeworks the total number of elements on the list is: " + homeworkList.getHomeworkTotal());

        homeworkList.getHomeworkDescription();

    }
}
