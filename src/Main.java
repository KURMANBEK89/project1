import impl.MyException;
import impl.UserServiceImpl;
import model.Gender;
import model.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Oleg", 22, Gender.MALE);
        User user2 = new User(2, "Olya", 18, Gender.FEMALE);
        User user3 = new User(3, "Nikita", 30, Gender.MALE);
        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        try {
            System.out.println(userService.searchById(1));

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        userService.deleteById(2);
        System.out.println(userService.getAll());

    }
}