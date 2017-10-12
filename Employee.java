//=================================================================================
/**
 * A class representing an Employee
 */
public abstract class Employee {
	protected String mFName; 	///< Employee first name
	protected String mGName; 	///< Employee first name
	private String mIRD; 		///< Employee IRD number
	
	/**
	  * Constructor
	  * Initializes an Employee object and sets all data members
	  * @param[in] _mFName 	Employee first name
	  * @param[in] _mGName	Employee second name
	  * @param[in] _mIRD		Employee IRD number
	  */
	public Employee(String _mFName, String _mGName, String _mIRD) {
		mFName = _mFName;
		mGName = _mGName;
		mIRD = _mIRD;
	}
	/**
	  * Returns mFName
	  * @return mFName
	  */	
	public String getMFName() { return mFName; }
	/**
	  * Returns mIRD 
	  * @return mIRD
	  */
	public String getMGName() { return mGName; }
	/**
	  * Returns mIRD 
	  * @return mIRD
	  */
	public String getMIRD() { return mIRD; }	
	/**
	  * Mutates mFName 
	  * @param[in] _mFName Assigns mFName with the value _mFName
	  */	
	public void setMFName(String _mFName) { mFName = _mFName; }
	/**
	  * Mutates mGName
	  * @param[in] _mGName Assigns mGName with the value _mGName
	  */
	public void setMGName(String _mGName) { mGName = _mGName; }
	/**
	  * Mutates mIRD
	  * @param[in] _mIRD Assigns mIRD with the value _mIRD
	  */
	public void setMIRD(String _mIRD) { mIRD = _mIRD; }
	/**
	  * Displays the mIRD, mFName and mGName data members for the Employee object
	  */
	public void print() { 
		System.out.print(String.format("%-20s %-15s %-20s", mIRD, mFName, mGName));
	}
	/**
	  * Calculates the monthly net wages for the Employee object
	  * @return total monthly net wages
	  */
	public abstract double getNetMonthlyPay();
}


