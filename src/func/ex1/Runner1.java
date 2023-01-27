package func.ex1;

import func.model.User;

import java.util.ArrayList;
import java.util.List;

public class Runner1 {

    public static void main(String[] args) {
        List<User> users = UserHelper.getUsers();

        AdminCheck iCheck = new AdminCheck();

        List<User> result = filter(users, iCheck);
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
