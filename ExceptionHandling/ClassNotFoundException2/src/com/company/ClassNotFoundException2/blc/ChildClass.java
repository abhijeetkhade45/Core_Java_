package com.company.ClassNotFoundException2.blc;

public class ChildClass extends ParentClass {

	@Override
	public void loadingClass(String className)  {
		// TODO Auto-generated method stub
		try {
			if(className==null) {
				throw new IllegalArgumentException();
			}
		
			super.loadingClass(className);
			
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	
	
}
