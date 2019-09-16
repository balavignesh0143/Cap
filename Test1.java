package daomap;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import beans.BankBean;

class Test1{
	static HashMap hm = new HashMap();
	
	static{
	
		
		try {
			BankBean bb=new BankBean("Raj",85149,"9832495149","1234567",1214,"deposit");
			BankBean bb2=new BankBean("Raja",75149,"9833495149","123456",1114,"deposit");
			hm.put(85149, bb);
			hm.put(75149, bb2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//Hashmap which is storing all account holders information
	BankBean bb1;					//object of Bankbean class

	@Test// getting Balance of account holder by reference to their accno
	public void getBalance() { 
		long observed;
		if (hm.containsKey(85149)) {
			BankBean bb1 = (BankBean) hm.get(75149);
			observed= bb1.getBalance();
		} else
			observed =0;
		long expected=1114;
		Assertions.assertEquals(expected, observed);
		
	}

	@Test// getting Transaction of account holder by reference to their accno
	public  void getTransaction() {	
		String tran;
		if (hm.containsKey(85149)) {
			bb1 = (BankBean) hm.get(85149);
			 tran=bb1.getTran();
		} else
			tran= " ";
		String expected="deposit";

		Assertions.assertSame(expected,tran);
	}

	

	
	@Test// Getting information of account holder using accNo
	public  void getInfo() {
		// TODO Auto-generated method stub
		BankBean b=(BankBean)hm.get(85149);
		String num=b.getMobile();
		String expected="9832495149";
	}

}
