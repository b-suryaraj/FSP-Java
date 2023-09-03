// q) write a program to display use of class and objects;

class Test1{
	int a,b;
	//variable
	void input()
	{
		a=10;
		b=20;
	}
	void disp(){
		System.out.println("The numbers are "+a+" & "+b);
	}
}
class Test2{
	public static void main(String args[]){
		Test1 ob = new Test1();
		ob.input();
		ob.disp();
	}
}		