package app;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
    public List<User> filterUsersWithEmailContaining123() {
        return users.stream()
                .filter(user -> user.getEmail().contains("123"))
                .collect(Collectors.toList());
    }
}
