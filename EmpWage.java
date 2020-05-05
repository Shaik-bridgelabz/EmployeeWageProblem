public class EmpWage {
	 //CONSTANTS
	public static final int IS_PART_TIME=1;
      	public static final int IS_FULL_TIME=2;

        private int numOfCompany=0;
	public CompanyEmpWage[] companyEmpWageArray;

        public EmpWage() {
                companyEmpWageArray =new CompanyEmpWage[5];

        }

	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDay,int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDay,maxHoursPerMonth);
             	numOfCompany++;
        }

	private void computeEmpWage() {
        	for ( int i = 0; i < numOfCompany; i++) {
                	int totalEmpWage = this.computeEmpWage(companyEmpWageArray[i]);
                	System.out.println(" Total Emp Wage For Company " +companyEmpWageArray[i].company + " is: " +totalEmpWage);
          }
   }

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		 //variables

	        int empHrs=0;
        	int totalWorkingDays=0;
      		int totalEmpHrs=0;

		//COMPUTATION
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
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
		return totalEmpHrs= totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	private class CompanyEmpWage {
		public String company;
		public int empRatePerHour;
		public int numOfWorkingDays;
		public int maxHoursPerMonth;

		public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDay,int maxHoursPerMonth) {
			this.company=company;
			this.empRatePerHour=empRatePerHour;
			this.numOfWorkingDays=numOfWorkingDays;
			this.maxHoursPerMonth=maxHoursPerMonth;
		}
	}

	public static void main(String[] args) {

	EmpWage empWage=new EmpWage();
	empWage.addCompanyEmpWage( "DMart", 20, 2, 10);
	empWage.addCompanyEmpWage( "BigBasket", 30, 2, 20);
	empWage.computeEmpWage();
	}
}
