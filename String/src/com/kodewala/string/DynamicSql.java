package com.kodewala.string;
class QueryGen {
	public StringBuilder generateQuery (int empId) {
		StringBuilder query = new StringBuilder ("Select * from employee_details");
		if (empId > 0) {
			query.append("Where empId "+empId);
		}
		else {
			query.append(";");
		}
		return query;
	}
}
public class DynamicSql {

	public static void main(String[] args) {
		QueryGen gen = new QueryGen ();
		StringBuilder sb = gen.generateQuery(0);
		System.out.println(sb);
		
	}

}
