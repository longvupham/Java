package March12;

public class Engineer extends Official{
    private String field;

    public Engineer(String field) {
        this.field = field;
    }

    public Engineer(String fullName, int age, String gender, String address, String field) {
        super(fullName, age, gender, address);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "field='" + field + '\'' +
                '}';
    }
}
