package com.va.week1_e2.junit;

public class ArrayClass2 {
	
	public static Boolean isPass(int mark)
	{
		return (mark>=60);
	}
	public static char grade(int mark)
	{
		if(mark>=90)
			return 'A';
		else if(mark>=80)
			return 'B';
		else if(mark>=70)
			return 'C';
		else if(mark>=60)
			return 'D';
		else
			return 'F';
	}

}
