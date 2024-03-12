package March12;

public class Employee extends Official{
    private String job;

    public Employee(String job) {
        this.job = job;
    }

    public Employee(String fullName, int age, String gender, String address, String job) {
        super(fullName, age, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "job='" + job + '\'' +
                '}';
    }
}
