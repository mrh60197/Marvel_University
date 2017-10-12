public final class Prof extends SalaryEmp {
	private int mDaysLeave; ///< Number of unpaid leave days.
	private final int mTax = 28; 	///< Percent deductions from salary.
	/**
	  * Default Constructor
	  * Initializes an Prof object and sets data members
	  */
	public Prof() { mDaysLeave = 0; }
	/**
	  * Constructor
	  * Initializes an Prof object and sets data members
	  * @param[in] _mFName 		Employee first name
	  * @param[in] _mGName		Employee second name
	  * @param[in] _mIRD			Employee IRD number
	  * @param[in] _mAPay		SalaryEmp annual pay 
	  * @param[in] _mDaysLeave	Prof unpaid leave days
	  */
	public Prof(String _mFName, String _mGName, String _mIRD, double _mAPay, int _mDaysLeave) {
		super(_mFName, _mGName, _mIRD, _mAPay);
		mDaysLeave = _mDaysLeave;
	}	
	/**
	  * Returns mDaysLeave 
	  * @return mDaysLeave
	  */
	int getMDaysLeave() const;
	/**
	  * Mutates mDaysLeave
	  * @param[in] _mDaysLeave Assigns mDaysLeave with the value _mDaysLeave
	  */
	void setMDaysLeave(int _mDaysLeave);
	/**
	  * Displays the mIRD, mFName, mGName and monthly net pay for the Employee object
	  * @param[in] _cout	 The stream used to display the values
	  */
	void print() {
		super.print();
		System.out.print("\t" + mDaysLeave + "\n");
	}
	/**
	  * Calculates the monthly net wages for the Prof object less leave days
	  * and tax deducted
	  * @return total monthly net wages
	  */
	double getNetMonthlyPay();
	
}