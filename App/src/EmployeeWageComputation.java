class EmployeeWageBuilder {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmployeeWageBuilder(String company,
                               int empRatePerHour,
                               int numOfWorkingDays,
                               int maxHoursPerMonth) {

        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage() {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours <= maxHoursPerMonth &&
                totalWorkingDays < numOfWorkingDays) {

            totalWorkingDays++;

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

            totalEmpHours += empHours;
        }

        int totalEmpWage = totalEmpHours * empRatePerHour;

        System.out.println("Company : " + company);
        System.out.println("Total Employee Wage : " + totalEmpWage);
    }
}

public class EmployeeWageComputation {

    public static void main(String[] args) {

        EmployeeWageBuilder dmart =
                new EmployeeWageBuilder("DMart", 20, 20, 100);

        dmart.computeEmpWage();
    }
}