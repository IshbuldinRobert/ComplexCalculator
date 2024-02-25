package util;

public enum Operators {
    PLUS("+"), MINUS("-"), DIVIDE("/"), MULTI("*");
    private String operator;

    Operators(String operator) {
        this.operator = operator;
    }

    public String operator() {
        return this.operator;
    }
}
