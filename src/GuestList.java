import java.util.HashSet;
import java.util.Set;

public class GuestList {
    private Set<Guest> guestSet;

    public GuestList(){
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int inviteCode){
        guestSet.add(new Guest(name, inviteCode));
    }

    public void removeGuest(int inviteCode){
        Guest guestToRemove = null;
        for(Guest g : guestSet){
            if(g.getInviteCode() == inviteCode){
                guestToRemove = g;
                break;
            }
        }
        guestSet.remove(guestToRemove);
    }

    public int countGuest(){
        return guestSet.size();
    }

    public void showGuest(){
        System.out.println(guestSet);
    }

    public static void main(String[] args) {
        GuestList guestList = new GuestList();
        System.out.println("There is " + guestList.countGuest() + " inside guest set.");

        guestList.addGuest("Guest 1", 11);
        guestList.addGuest("Guest 2", 22);
        guestList.addGuest("Guest 3",33);
        guestList.addGuest("Guest 4", 44);
        guestList.addGuest("Guest 5", 55);
        guestList.addGuest("Guest 6", 66);
        guestList.addGuest("Guest 7", 77);

        guestList.showGuest();

        System.out.println("There is " + guestList.countGuest() + " guests inside guest set.");

        guestList.removeGuest(33);
        System.out.println("There is " + guestList.countGuest() + " guests inside guest set.");

        guestList.showGuest();
    }
}
