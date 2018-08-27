package pl.aszul.Task3Page15;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users = new HashMap<>();
    
    public boolean addUser(String login, String password, String name1st, String name2nd, String role){
        if (users.containsKey(login)) {
            return false;
        } else {
            users.put(login, new User(password, name1st, name2nd, role));
            return true;
        }
    }
    public boolean updateUser(String login, String password, String name1st, String name2nd, String role){
        if (users.containsKey(login)) {
            User userToBeUpdated = users.get(login);
            if (!password.isEmpty()) userToBeUpdated.setPassword(password);
            if (!name1st.isEmpty()) userToBeUpdated.setName1st(name1st);
            if (!name2nd.isEmpty()) userToBeUpdated.setName2nd(name2nd);
            if (!role.isEmpty()) userToBeUpdated.setRole(role);
            users.put(login, userToBeUpdated);
            return true;
        } else
            return false;
    }
    public boolean removeUser(String login){
        if (users.containsKey(login)) {
            users.remove(login);
            return true;
        } else
            return false;
    }
    @Override
    public String toString() {
        StringBuilder usersSummary = new StringBuilder();
        short i = 0;
        for (Map.Entry<String, User> userIterator : users.entrySet()) {
            i++;
            usersSummary.append(Integer.toString(i) + ". login: " + userIterator.getKey() + ",\t" +
                    userIterator.getValue().toString() + "\n");
        }
        return usersSummary.toString();
    }
}