package finalProject;

public enum FieldPart {
    EMPTY("⬜"), SHIP("\uD83D\uDEE5"),
    BORDER("\uD83D\uDFE6"), STRIKEN("\uD83D\uDFE5");

    private final String value;
    FieldPart(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
