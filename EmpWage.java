public class EmpWage {
	 //CONSTANTS
	public static final int IS_PART_TIME=1;
      	public static final int IS_FULL_TIME=2;

	public static int calcEmpWageForCompany(String company,int empRate,int numOfDays,int maxHrs) {
		//VARIABLES

		int empHrs=0;
		int totalWorkingDays=0;
		int totalEmpHrs=0;
		//COMPUTATION
		while (totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays) {
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
		System.out.println("Day#: " + totalWorkingDays+ " Emp Hr : " +empHrs);
		}
		int totalEmpWage=totalEmpHrs * empRate;
		System.out.println("Total Emp Wage for Company : " +company+ " is : " +totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		calcEmpWageForCompany("DMart",20,2,10);
		calcEmpWageForCompany("Reliance",10,4,20);
	}
}
