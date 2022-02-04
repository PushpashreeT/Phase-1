package com.assistedproject;

public class Constructor {

		String name;
		int rollNo;
		
		public Constructor(String nav, int no)
		{
			this.name = nav;
			this.rollNo = no;
		}
		
		public Constructor()
		{
			this.name = "Default";
			this.rollNo = 3;
		}

		public static void main(String[] args) {
			Constructor obj = new Constructor("Test",1);
			System.out.println(obj.name+" "+obj.rollNo);
			Constructor obj2 = new Constructor();
			System.out.println(obj2.name+" "+obj2.rollNo);
		}

	}

	


