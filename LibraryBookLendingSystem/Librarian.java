
public class Librarian extends User {

    public Librarian(String name, String userId) {
        super(name, userId, true);
    }

    @Override
    public void showProfile() {
        System.out.println("Librarian Profile:\n");
        System.out.println("Name: " + name);
        System.out.println("User ID: " + userId);
    }
}
