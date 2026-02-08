public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass classLoad=new ChildClass();
		for(String s:args) {
			classLoad.loadingClass(s);
		}
	}
}
 class ParentClass {
	
	public  void  loadingClass(String className) throws ClassNotFoundException {
		Class.forName(className);
		System.out.println("Class "+className+" loaded successfully");
	}

}
 class ChildClass extends ParentClass{

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