import java.util.Scanner;

class Subject{
	int subjectMarks;
	int credits;
	int grades;
}

class Student{
	Subject subject[];
	String name;
	String usn;
	double SGPA;
	Scanner s;
	
	Student(){
		subject = new Subject[9];

		for(int i = 0;i<9;i++){
		subject[i] = new Subject();
		}
		s= new Scanner(System.in);
	}


	void getStudentDetails(){
		System.out.println("Enter your name: ");
		this.name = s.nextLine();
		System.out.println("Enter your usn: ");
		this.usn = s.next();
	}

	void getMarks(){ 
	for(int i = 0;i<8;i++){
		System.out.println("Enter the marks of the "+(i+1)+" subject");
		subject[i].subjectMarks = s.nextInt();

		System.out.println("Enter the credits of the "+(i+1)+" subject");
		subject[i].credits = s.nextInt();
		subject[i].grades = (subject[i].subjectMarks/10)+1;

		if(subject[i].grades >10){
			subject[i].grades = 10;
		}
		if(subject[i].grades <4){
			subject[i].grades = 0;
		}
	}
}


	void computeSGPA(){
		int sum=0;
		int totalCredits = 0;
		for(int i = 0;i<9;i++){
			sum+=(subject[i].grades * subject[i].credits);
			totalCredits += subject[i].credits;
		}
		this.SGPA = (double) sum/totalCredits;
	}
}

public class Main{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.getStudentDetails();
		s1.getMarks();
		s1.computeSGPA();

		System.out.println("Name: "+s1.name);
		System.out.println("Usn: "+s1.usn);
		System.out.println("SGPA: "+s1.SGPA);
	}
}
