package com.srm.bank;

public class BankAcc {
	
	private int accno;
    private BankCustomer bcust;
    
    public BankAcc() {
    	super();
    }

    public BankAcc(int accno, BankCustomer bcust){
        super();
        this.accno=accno;
        this.bcust=bcust;
    }


    public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public BankCustomer getBcust() {
		return bcust;
	}

	public void setBcust(BankCustomer bcust) {
		this.bcust = bcust;
	}



}
