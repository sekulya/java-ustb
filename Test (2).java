public class Test{
	public static void main(String [] args){
		Worker w = new Worker();
		w.display();
	}
}
class Worker {
	String name="wang";
	int age=40;
	double salary=3800;
	int level=1;

	void display(){
System.out.println("name="+name);
System.out.println("age="+age);
System.out.println("salary="+salary);
System.out.println("level="+level);
	
	}
}

