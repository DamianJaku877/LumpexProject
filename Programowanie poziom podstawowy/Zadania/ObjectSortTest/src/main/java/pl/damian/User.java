package pl.damian;

public class User implements Comparable<User> {

    private String lastname;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setLastName(String lastname){
        this.lastname = lastname;
    }

    public int compareTo(User o){
        if (lastname.compareTo(o.lastname) > 0){
            return 1;
        } else if(lastname.compareTo(o.lastname) < 0){
            return -1;
        }
        return 0;
    }

   /* public int compareTo(User o){
        return lastname.compareTo(o.lastname);
    }*/
}
