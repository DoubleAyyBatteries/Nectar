package databaseCode;

@SuppressWarnings("serial") 
public abstract class databaseErrors extends Exception {	
	public databaseErrors() {}
	public databaseErrors(String message, String string) {
		super(String.format("\n" + message, string));
	}
	public databaseErrors(String message, String string1, String string2, 
						  String string3, String string4) {
		super(String.format("\n" + message, string1, string2, string3, string4));
	}
}

@SuppressWarnings("serial")
class errorUnknownDatabase extends databaseErrors {
	private static String message = "The database %s is not a real database\n"
								  + "Use one of the following databases:"
								  + "\n\t1) nectarDB_administration"
								  + "\n\t2) nectarDB_products"
								  + "\n\t3) nectarDB_user";	
	public errorUnknownDatabase(String inputedDatabase) {super (message, inputedDatabase);}
}

@SuppressWarnings("serial") 
class errorUnequalArrayListLengths extends databaseErrors { 
	private static String message = "The given input ArrayList for, "
						 		  + "and the amount of columns from %s, "
						 		  + "are of different lengths";
	public errorUnequalArrayListLengths(String string) {super(message, string);}
}
@SuppressWarnings("serial") 
class errorIncorrectDataTypeForTheTable extends databaseErrors {
	private static String message = "The datatype of %s is: \n"
								  + "%s \n"
								  + "Desired datatype for column %s is: \n"
								  + "%s \n"
								  ;
	public errorIncorrectDataTypeForTheTable() {};
	public errorIncorrectDataTypeForTheTable(String toBeInsertedVariable, 
	String toBeInsertedDatatype, String desiredColumn, 
	String desiredColumnDatatype) {
		super(
			message, toBeInsertedVariable, toBeInsertedDatatype, 
			desiredColumn, desiredColumnDatatype
		);
	}
}