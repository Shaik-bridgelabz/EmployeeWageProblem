public class EmpWage {
	 //CONSTANTS
      public static final int IS_PART_TIME=1;
      public static final int IS_FULL_TIME=2;
      public static final int EMP_RATE_PER_HOUR=20;
		public static final int NUM_OF_WORKING_DAYS=2;
		public static final int MAX_HRS_IN_MONTH=10;

	public static int calcEmpWage() {
		//VARIABLES
		int empWage=0;
		int totalEmpWage=0;
		int totalWorkingDays=0;
		int totalEmpHrs=0;
		//COMPUTATION
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			int empHrs=0;
			int empCheck= (int) Math.floor(Math.random()*10) %3;
			totalWorkingDays++;
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
		empWage=empHrs*EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Emp Wage: " +empWage);
		}
		System.out.println("Total Emp Wage: " +totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		int totalWage = calcEmpWage();
	}
}
