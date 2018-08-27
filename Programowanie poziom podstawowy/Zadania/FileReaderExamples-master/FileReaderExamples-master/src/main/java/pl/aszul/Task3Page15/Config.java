package pl.aszul.Task3Page15;

public class Config {
    public static final String LOGIN_MIN_LENGTH = "4";
    public static final String LOGIN_MAX_LENGTH = "32";
    public static final String PASSWORD_MIN_LENGTH = "4";
    public static final String PASSWORD_MAX_LENGTH = "32";
    public static final String NAME_MIN_LENGTH = "3";
    public static final String NAME_MAX_LENGTH = "32";
    public static final String SURNAME_MIN_LENGTH = "3";
    public static final String SURNAME_MAX_LENGTH = "32";
    public static final String LINE_PATTERN = "^(action|CREATE|UPDATE|REMOVE);" +
        "[a-z0-9]{" + LOGIN_MIN_LENGTH + "," + LOGIN_MAX_LENGTH + "};" +
        "([a-zA-Z0-9]{" + PASSWORD_MIN_LENGTH + "," + PASSWORD_MAX_LENGTH + "})?;" +
        "([ a-zA-Z]{" + NAME_MIN_LENGTH + "," + NAME_MAX_LENGTH + "})?;" +
        "([ a-zA-Z]{" + SURNAME_MIN_LENGTH + "," + SURNAME_MAX_LENGTH + "})?;" +
        "(role|admin|moderator|user)?$";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m\t\t";
    public static final String GREEN = "\u001B[32m\t\t";
}
