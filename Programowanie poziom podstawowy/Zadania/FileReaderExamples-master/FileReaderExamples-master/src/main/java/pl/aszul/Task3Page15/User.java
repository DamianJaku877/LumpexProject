package pl.aszul.Task3Page15;

import lombok.*;

@Data
@AllArgsConstructor
public class User {
    private String password;
    private String name1st;
    private String name2nd;
    private String role;

    @Override
    public String toString() {
        return "password: " + password + ",\tfirstname: " + name1st + ",\tlastname: " + name2nd + ",\trole: " + role;
    }
}
