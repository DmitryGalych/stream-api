package func.ex2;

import func.ex1.ICheck;
import func.ex1.UserHelper;
import func.model.User;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<User> users = UserHelper.getUsers();

        List<User> userList = users.stream()
                .filter(User::isActive)
                .toList();
    }

    static List<User> filter(List<User> users, ICheck iCheck) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (iCheck.check(user)) {
                result.add(user);
            }
        }

        return result;
    }
}
