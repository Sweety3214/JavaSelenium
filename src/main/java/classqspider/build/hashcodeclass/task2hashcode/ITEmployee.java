package classqspider.build.hashcodeclass.task2hashcode;

import java.util.Objects;

public class ITEmployee {
    private String employeeID;
    private String employeeName;
    private long employeeSalary;

    public ITEmployee(String employeeID, String employeeName, long employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public ITEmployee() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ITEmployee that)) return false;
        return employeeSalary == that.employeeSalary && Objects.equals(employeeID, that.employeeID) && Objects.equals(employeeName, that.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, employeeName, employeeSalary);
    }

    @Override
    public String toString() {
        return "ITEmployee{" +
                "employeeID='" + employeeID + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
