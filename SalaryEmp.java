//=================================================================================
/**
 * A class representing an employee with than annual salary. 
 */
public class SalaryEmp extends Employee {
	protected double mAPay; ///< The annual salary
	/**
	  * Constructor
	  * Initializes an SalaryEmp object and sets all data members
	  */
	public SalaryEmp() {
		super("NO_PR", "NO_PR", "PR00-0000-000");
		mAPay = 0;
	}
	/**
	  * Constructor
	  * Initializes an SalaryEmp object and sets all data members
	  * @param[in] _mFName 	Employee first name
	  * @param[in] _mGName	Employee second name
	  * @param[in] _mIRD		Employee IRD number
	  * @param[in] _mAPay	SalaryEmp annual pay 
	  */
	public SalaryEmp(String _mFName, String _mGName, String _mIRD, double _mAPay) {
		super(_mFName, _mGName, _mIRD);
		mAPay = _mAPay;
	}	
	/**
	  * Returns mAPay 
	  * @return mAPay
	  */
	public double getMAPay() { return mAPay; }
	/**
	  * Mutates mAPay
	  * @param[in] _mAPay Assigns mAPay with the value _mAPay
	  */
	public void setMAPay(double _mAPay) { mAPay = _mAPay; }
	/**
	  * Calculates the monthly net wages for the Prof object less leave days
	  * and tax deducted
	  * @return total monthly net wages
	  */
	@Override
	public double getNetMonthlyPay() {
		return mAPay / 12;
	}
}