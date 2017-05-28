package objectOrientedPrograming;

public class Person {

	
		// TODO Auto-generated constructor stub
		String name="MeghaReji";
		int age=22;
		public void tellname()
		
		{
			System.out.println("name:"+ name);
		}
		public void age(){
			System.out.println("age:"+ age);
		}
		public void isYourAge(int askage){
			if(askage==age){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
		
	}


