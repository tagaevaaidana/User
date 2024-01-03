import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>(Arrays.asList(
                new User(1,"Aidana",25),
                new User(1,"Bek",22),
                new User(3,"Mila",17),
                new User(3,"Di",33),
                new User(2,"Dasha",20)));
        for (User user : users){
            if (user.getAge() %2 == 0){
                System.out.println(user);
            }
        }


    }
}