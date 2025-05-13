
public abstract class User {

    protected String userId;
    protected String name;
    protected boolean isLibrarian = false;

    public User(String name, String userId, boolean isLibrarian) {
        this.name = name;
        this.userId = userId;
        this.isLibrarian = isLibrarian;
    }

    public void showProfile() {
    }
}
