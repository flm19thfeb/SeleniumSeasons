package may20th;

public class VargsDemo1 {

	public static void main(String[] args) {
		
		Sum obj=new Sum();
		
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add();
		obj.add(10,20,30,40,50,60);
		

	}

}
