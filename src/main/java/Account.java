public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    boolean onlySingleSubstring(String str) {
        return str.indexOf(" ") == str.lastIndexOf(" ");
    }

    public boolean checkNameToEmboss() {
        return name.length() >= 3 && name.length() <= 19 && !name.startsWith(" ") && !name.endsWith(" ") && name.contains(" ") && onlySingleSubstring(name);
    }
}