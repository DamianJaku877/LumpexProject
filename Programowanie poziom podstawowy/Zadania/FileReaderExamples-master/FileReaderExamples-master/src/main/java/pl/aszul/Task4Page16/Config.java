package pl.aszul.Task4Page16;

public class Config {
    public static final String PASSENGERS_MIN_LENGTH = "1";
    public static final String PASSENGERS_MAX_LENGTH = "6";
    public static final String LINE_PATTERN = "^(year,month,passengers)|" +
        "([0-9]{4}," +
        "(January|February|March|April|May|June|July|August|September|October|November|December)," +
        "[0-9]{" + PASSENGERS_MIN_LENGTH + "," + PASSENGERS_MAX_LENGTH + "})$";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m\t\t";
    public static final String GREEN = "\u001B[32m\t\t";
}
