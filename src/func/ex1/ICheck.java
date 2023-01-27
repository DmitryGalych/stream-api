package func.ex1;

import func.model.User;

@FunctionalInterface
public interface ICheck {
    boolean check(User user);

    default void sayHello() {
        System.out.println("Hello");
    }
}
