package pl.aszul.Task3Page15;

public enum Commands {
    ACTION, CREATE, UPDATE, REMOVE, UNKNOWN;

    //@Override
    public static Commands matchCommand(String name){
        try {
            return valueOf(name);
        } catch(Exception ex) {
            return Commands.UNKNOWN;
        }
//        return Enums.getIfPresent(CardSuit.class, name).orNull();
    }
}
