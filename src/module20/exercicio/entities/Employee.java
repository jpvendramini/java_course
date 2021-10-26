package module20.exercicio.entities;

public class Employee {
    private String email;
    private String name;
    private Double salary;

    public Employee(String email, String name, Double salary) {
        this.email = email;
        this.name = name;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
