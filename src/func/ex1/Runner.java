package func.ex1;

import func.model.User;
import func.model.UserType;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<User> users = UserHelper.getUsers();
    }

    static List<User> getActiveUsers(List<User> users) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.isActive()) {
                result.add(user);
            }
        }
        return result;
    }

    static List<User> getAdminUsers(List<User> users) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getUserType().equals(UserType.ADMIN)) {
                result.add(user);
            }
        }
        return result;
    }
}
