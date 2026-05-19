public class EmployeeWageComputation {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {

        int totalEmpWage = 0;

        for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++) {

            int empHours = 0;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case IS_PART_TIME:
                    empHours = 4;
                    break;

                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                default:
                    empHours = 0;
            }

            totalEmpWage += empHours * EMP_RATE_PER_HOUR;
        }

        System.out.println("Total Employee Wage : " + totalEmpWage);
    }
}