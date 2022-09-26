import java.util.ArrayList;

public class AddressBook {


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        System.out.println("Address Book");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    private ArrayList<BuddyInfo> book;

    public void addBuddy(BuddyInfo buddy) {
        if (book.contains(buddy)) {
            System.out.println(buddy.getName() + "is already in this address book.");
        }
        else {
            book.add(buddy);
        }

    }
    public AddressBook() {
        this.book = new ArrayList();
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (book.contains(buddy)) {
            book.remove(buddy);
        }
        else {
            System.out.println("This person is not in this address book.");
        }
    }
}
