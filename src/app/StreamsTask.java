package app;
public class StreamsTask {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager.addUser(new User("User1", "user1@example.com"));
        userManager.addUser(new User("User2", "user2@example123.com"));
        userManager.addUser(new User("User3", "user3@123example.com"));
        userManager.addUser(new User("User4", "user4@example.com"));
        userManager.addUser(new User("User5", "user5@example.com"));

        System.out.println("All users:");
        userManager.getUsers().forEach(System.out::println);

        System.out.println("\nFiltered users with email containing '123':");
        userManager.filterUsersWithEmailContaining123().forEach(System.out::println);
    }
}
