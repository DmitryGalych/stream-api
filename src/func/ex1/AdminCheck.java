package func.ex1;

import func.model.User;

import static func.model.UserType.ADMIN;

public class AdminCheck implements ICheck {

    @Override
    public boolean check(User user) {
        return user.getUserType().equals(ADMIN);
    }
}
