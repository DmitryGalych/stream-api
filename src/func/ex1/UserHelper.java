package func.ex1;

import func.model.User;

import java.util.List;

import static func.model.UserType.ADMIN;
import static func.model.UserType.CUSTOMER;
import static func.model.UserType.MODERATOR;

public class UserHelper {

    public static List<User> getUsers() {
       return List.of(
                new User(1, "William", ADMIN).setActive(false),
                new User(2, "Ethan", ADMIN).setActive(false),
                new User(3, "Michael", MODERATOR),
                new User(4, "Jennifer", CUSTOMER),
                new User(5, "Mia", CUSTOMER),
                new User(6, "Emma", CUSTOMER));
    }
}
