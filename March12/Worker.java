package March12;

public class Worker extends Official {
    private int level;

    public Worker(int level) {
        this.level = level;
    }

    public Worker(String fullName, int age, String gender, String address, int level) {
        super(fullName, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                '}';
    }
}
