package func.ex1;

import func.model.User;

import java.util.ArrayList;
import java.util.List;

public class Runner2 {

    public static void main(String[] args) {
        List<User> users = UserHelper.getUsers();

        filter(users, user -> user.getId() < 3);

        filter(users, Runner2::test);
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

    static boolean test(User user) {
        return user.isActive();
    }
}