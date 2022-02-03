package Algorithm;

import java.util.ArrayList;

public class LinearSearchMain {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();

        User firstUser = new User("ActualPhant0m","123456");
        User secondUser = new User("FlowerPower","ShineOnMe");
        User thirdUser = new User("CurtainMan","CurtainsForDays");
        User fourthUser = new User("JaywalkingJacket","jaywalkingisAwsome");
        User fifthUser = new User("BananaHammock","Bananas123");
        User sixthUser = new User("KenAdams","reginaPhelangy");
        User seventhUser = new User("DeadParents","ImBatman");
        User eighthUser = new User("PeePeePooPoo","POOPBackwardsIsPOOP");
        User ninthUser = new User("CookieMonster","COOKIES!");
        User tenthUser = new User("Markiplier","BumBum");


        users.add(firstUser);
        users.add(secondUser);
        users.add(thirdUser);
        users.add(fourthUser);
        users.add(fifthUser);
        users.add(sixthUser);
        users.add(seventhUser);
        users.add(eighthUser);
        users.add(ninthUser);
        users.add(tenthUser);

        System.out.println(findUser(users, "DeadParents"));

    }

    public static boolean findUser(ArrayList<User> arrayListOfUsers, String inputByUser) {
        //can be used with .equalsIgnoreCase

        for (User user: arrayListOfUsers) {
            if (user.getUsername() == inputByUser) {
                return true;
            }

        }
        return false;

    }

    public static void createUser() {
        //if not found add to array
    }
}
