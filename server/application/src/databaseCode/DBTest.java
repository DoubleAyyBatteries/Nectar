package databaseCode;
import java.sql.*;
import java.util.ArrayList;

public class DBTest {
	public static void main (String args[]) throws SQLException {
		/////////////////////////
		// ONLY A TESTING FILE //
		/////////////////////////
		
		//General variables
		String [] dbs = {
			"nectarDB_administration", 
			"nectarDB_products", 
			"nectarDB_user"
		};
		String db = dbs[2];
		String table = "user";
		DBConnetion con = new DBConnetion();
		con.startConnection(db);		
		DBQuery test = new DBQuery(con);
		
		//Testing insertIntoTableWithOutPrimaryKey
		ArrayList<Object> tableInputs = new ArrayList<Object>();
		//tableInputs.add(12);
		tableInputs.add("r");
		tableInputs.add("r");
		tableInputs.add("r");
		test.insertIntoTableWithOutPrimaryKey_ArrObj(table, tableInputs);
		System.out.println(test.getFromTable_2DArrStr(table));
	}
}