package com.kodewala.TreesetExamplee;

import java.util.TreeSet;

class Account implements Comparable{
	
	String name;
	public Account(String name) {
		this.name=name;
		
	}
	@Override
	public int compareTo(Object o) {
		Account acc = (Account) o;
		return this.name.compareTo(acc.name);
	}
}
public class TreeSetExp {

	public static void main(String[] args) {
		
		TreeSet<Account> ts = new TreeSet<Account>();
		Account acc1 = new Account("kodewala");
		Account acc2 = new Account("Abinash");
		Account acc3 = new Account("Virat");
		Account acc4 = new Account("Rohit");
		ts.add(acc1);
		ts.add(acc2);
		ts.add(acc3);
		ts.add(acc4);
		for(Account account : ts)
		System.out.println(account.name);
	
	}
	

}
