package Inheritance;

public class Tester 
{
	public static void main (String [] args)
	{
		/*
		 * Calling MySql which is child of Connector
		 */
		MySql obj1 = new MySql();
		obj1.open();    //Inherited from Connector
		obj1.close();	//Inherited from Connector
		obj1.Transaction();   //Local Method in MySql
		
		/*
		 * Now calling MyOracle which is a subclass of Oracle
		 */		
		MyOracle obj2 = new MyOracle();
		obj2.open();    //Inherited from Connector
		obj2.close();	//Inherited from Connector
		obj2.Cashe();   //Abstract method overridden form Oracle 
		obj2.MyCashe(); //Local Method in MyOracle
	}
	

}
