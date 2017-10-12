//=================================================================================
/**
 * A class representing an Temp Employee
 */
public final class TEmp extends Employee {
	private String mID; 		///< Student ID number.
	private int mHWorked; 	///< Number of hours worked per month.
	private double mHPay; 			///< Hourly rate the student is paid.
	private final int mTax = 20; ///< Percent deductions from salary.
	/**
	  * Default Constructor
	  * Initializes an TEmp object and sets data members
	  */
	public TEmp() {
		super("NO_TA", "NO_TA", "TA00-0000-000");
		mID = "NO_TA"; 
		mHWorked = 0;
		mHPay = 0;
	}
	/**
	  * Constructor
	  * Initializes an TEmp object and sets data members
	  * @param[in] _mFName 		Employee first name
	  * @param[in] _mGName		Employee second name
	  * @param[in] _mIRD			Employee IRD number
	  * @param[in] _mID			Student ID number
	  * @param[in] _mHWorked	The amount of hours the student has worked
	  * @param[in] _mHPay		The pay rate the studnet earns
	  */
	public TEmp(String _mFName, String _mGName, String _mIRD, String _mID, int _mHWorked, double _mHPay) {
		super(_mFName, _mGName, _mIRD);
		mID = _mID;
		mHWorked = _mHWorked;
		mHPay = _mHPay;
	}
	/**
	  * Returns mID 
	  * @return mID
	  */
	public String getMID() { return mID; };
	/**
	  * Returns mHWorked 
	  * @return mHWorked
	  */
	public int getMHWorked() { return mHWorked; };
	/**
	  * Returns mHPay 
	  * @return mHPay
	  */
	public double getMHPay() { return mHPay; }
	/**
	  * Mutates mID
	  * @param[in] _mID Assigns mID with the value _mID
	  */
	public void setMID(String _mID) { mID = _mID; }
	/**
	  * Mutates mHWorked
	  * @param[in] _mHWorked Assigns mHWorked with the value _mHWorked
	  */
	public void setMHWorked(int _mHWorked) { mHWorked = _mHWorked; }
	/**
	  * Mutates mHPay
	  * @param[in] _mHPay Assigns mHPay with the value _mHPay
	  */
	public void setMHPay(double _mHPay) { mHPay = _mHPay; }
	/**
	  * Displays the mIRD, mFName and mGName data members for the TEmp object
	  */
	public void print() {
		super.print();
		System.out.print("$" + this.getNetMonthlyPay() + "\n");
	}
	/**
	  * Calculates the monthly net wages by multiplying mHWorked by mHPay
	  * less tax detuctions.
	  * @return total monthly net wages
	  */
	@Override
	public double getNetMonthlyPay() {
		double totalWage = this.getMHWorked() * this.getMHPay();
		double deductableTaxAmount = totalWage * (mTax / 100.0);
		return (double)(Math.round((totalWage - deductableTaxAmount) *100d) / 100d);
	}
	
}