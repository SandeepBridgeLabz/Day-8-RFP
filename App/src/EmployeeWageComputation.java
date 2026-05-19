public class EmployeeWageComputation {

    public static void main(String[] args) {

        int IS_PRESENT = 1;
        int EMP_RATE_PER_HOUR = 20;
        int EMP_HOURS = 8;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_PRESENT) {
            int salary = EMP_HOURS * EMP_RATE_PER_HOUR;
            System.out.println("Employee Wage : " + salary);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}