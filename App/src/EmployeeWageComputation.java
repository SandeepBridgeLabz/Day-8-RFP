public class EmployeeWageComputation {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {

        int empHours = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        if (empCheck == IS_PART_TIME)
            empHours = 4;
        else if (empCheck == IS_FULL_TIME)
            empHours = 8;
        else
            empHours = 0;

        int empWage = empHours * EMP_RATE_PER_HOUR;

        System.out.println("Employee Wage : " + empWage);
    }
}