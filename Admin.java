//=================================================================================
/**
 * A class representing an Administrator
 */
public final class Admin extends SalaryEmp {
	private String mJob; 		///< Job title.
	private final int mTax = 25; ///< Percent deductions from salary.
	/**
	  * Default Constructor
	  * Initializes an Admin object and sets data members
	  */
	public Admin() { 
		super("NO_TA", "NO_TA", "TA00-0000-000", 0.0);
		mJob = ""; 
	}
	/**
	  * Constructor
	  * Initializes an Admin object and sets data members
	  * @param[in] _mFName 		Employee first name
	  * @param[in] _mGName		Employee second name
	  * @param[in] _mIRD			Employee IRD number
	  * @param[in] _mAPay		SalaryEmp annual pay 
	  * @param[in] _mJob			Admin job title
	  */
	public Admin(String _mFName, String _mGName, String _mIRD, double _mAPay, String _mJob) {
		super(_mFName, _mGName, _mIRD, _mAPay);
		mJob = _mJob;
	}
	/**
	  * Returns mJob 
	  * @return mJob
	  */
	public String getMJob() { return mJob; }
	/**
	  * Mutates mJob
	  * @param[in] _mJob Assigns mJob with the value _mJob
	  */
	public void setMJob(String _mJob) { mJob = _mJob; }
	/**
	  * Displays the mIRD, mFName and mGName data members for the Admin object
	  */
	public void print() {
		super.print();
		System.out.print("$" + this.getNetMonthlyPay() + "\n");
	}
	/**
	  * Calculates the monthly net wages for the Admin object less tax rate deductions
	  * @return total monthly net wages
	  */
	@Override
	public double getNetMonthlyPay() {
		double deductableTaxAmount = super.getMAPay() * (mTax / 100.0);
		return (double)(Math.round(((super.getMAPay() - deductableTaxAmount) / 12) * 100d) / 100d);
	}
}