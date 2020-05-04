public class EmpWage {
	 //CONSTANTS
	public static final int IS_PART_TIME=1;
      	public static final int IS_FULL_TIME=2;

	private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;

	public EmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
                this.company=company;
                this.empRatePerHour=empRatePerHour;
                this.numOfWorkingDays=numOfWorkingDays;
                this.maxHoursPerMonth=maxHoursPerMonth;
        }

	private int computeEmpWage() {
		 //variables

	        int empHrs=0;
        	int totalWorkingDays=0;
      		int totalEmpHrs=0;

		//COMPUTATION
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck= (int) Math.floor(Math.random()*10) %3;
			switch(empCheck) {
				case  IS_FULL_TIME:
					empHrs=8;
					break;
				case IS_PART_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
				}
		totalEmpHrs += empHrs;
		System.out.println("Day#: " + totalWorkingDays+ " Emp Hr : " +empHrs);
		}
		return totalEmpHrs * empRatePerHour;
	}

	public static void main(String[] args) {
		EmpWage dMart = new EmpWage("DMart", 20, 2, 10);
                EmpWage bigBasket = new EmpWage("Bigbasket", 30, 2, 20);
                System.out.println("Total Emp wage for company: " + dMart.company + " is: " + dMart.computeEmpWage());
                System.out.println("Total Emp wage for company: " + bigBasket.company + " is: " +bigBasket.computeEmpWage());
	}
}
