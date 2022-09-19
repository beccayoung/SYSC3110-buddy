public class BuddyInfo {

    public static void main(String[] args) {
        BuddyInfo guy;
        guy = new BuddyInfo("Becca", "86 Palmerston St", "902-331-0410");

        String guysName;
        guysName = guy.getName();

        System.out.println("Hello " + guysName);
    }

    private String name;
    private String address;
    private String number;

    public BuddyInfo() {
    }

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

}

