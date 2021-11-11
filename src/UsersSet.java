import java.util.HashSet;

public class UsersSet extends HashSet {
    public static HashSet<UserData> setOfUsers = new HashSet<>();
    public static void CreateUsers(){
        setOfUsers.add(new UserData("123", "123"));
        setOfUsers.add(new UserData("2", "321"));
        setOfUsers.add(new UserData("3", "abc"));
        setOfUsers.add(new UserData("A", "ABC"));
        setOfUsers.add(new UserData("BBB", "12AB"));
        setOfUsers.add(new UserData("ABC", "1234"));
    }

    public static boolean CheckData(String username, String password){
        for (UserData x:setOfUsers
             ) {
            if(x.getUsername().equals(username) && x.getPassword().equals(password)) return true;
        }
        return false;
    }
}
