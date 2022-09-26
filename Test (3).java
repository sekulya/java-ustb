public class Test{
	public static void main(String [] args){
		Student s = new Student("zhangsan", 23, 86);
		s.display();
	}
}

abstract class Person{
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public abstract void display();
}

class Student extends Person{
	private double grade;
	
	public Student(String name, int age, double grade){
		super(name, age);
		this.grade = grade;
	}
	
	public void display(){
		System.out.println("grade:" + grade);
	}
}

