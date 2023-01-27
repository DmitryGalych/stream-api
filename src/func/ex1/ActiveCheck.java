package func.ex1;

import func.model.User;

public class ActiveCheck implements ICheck{

    @Override
    public boolean check(User user) {
        return user.isActive();
    }
}
