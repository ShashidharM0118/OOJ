import java.util.*;
class Student{
	String USN;
	String Name;
	int s1,s2,s3;
	double avg;
	
	void getDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the USN:");
		USN = sc.next();
		System.out.println("Enter the Name:");
		Name= sc.next();
		System.out.println("Enter all three sub marks");
		s1 =sc.nextInt();
		s2 =sc.nextInt();
		s3 =sc.nextInt();
	}
	void twoBetter(){
		if(s1 >= s2 && s3 >= s2){
			avg = (double)((s1+s3)/2);
		}
		else if(s1 >= s3 && s2 >= s3){
			avg = (double)((s1+s2)/2);
		}
		else{
			avg = (double)((s3+s2)/2);
		}
	}
	void display(){
		twoBetter();
		System.out.println("USN : "+USN);
		System.out.println("NAME : "+Name);
		System.out.println("Avg marks : "+avg);
	}
	protected void finalize(){
	        System.out.println("finilize() method called");
    	}    
}


public class AdditionalSecond{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = sc.nextInt();
		Student s[]  = new Student[n];
		
		for(int i = 0;i<n;i++){
			s[i] = new Student();
			s[i].getDetails();
			s[i].display();
		}
		
	}
}