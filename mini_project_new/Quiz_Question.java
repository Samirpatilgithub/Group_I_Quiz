package com.mini_project_new;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Quiz_Question {
	 TableData tableData=new TableData();
	
	public void logic (){
	
		int correctAnsCount = 0;
		int wrongAnsCount = 0;
		
		Scanner sc= new Scanner(System.in);  //for user input
		
	//invoke constructor agrumented Constructor to store Questions & Options
	Question Q1=new Question("Q: Number of primitive data types in Java are? ",
									"a) 6 ","b) 7","c) 8","d) 9");
	Question Q2=new Question("Q: Find the output of the following program.\r\n" + 
									"\r\n" + 
									"public class Solution{\r\n" + 
									"       public static void main(String[] args){\r\n" + 
									"                     short x = 10;\r\n" + 
									"                     x =  x * 5;\r\n" + 
									"                     System.out.print(x);\r\n" + 
									"       }\r\n" + 
									"}",
									"a) 50","b) 10","c) Complie Error","d) Exception");
	
	Question Q3=new Question("Q: Select the valid statement to declare and initialize an array.",
									"a) int[] A={} ","b) int[] A={1,2,3}","c) int[][] A={1,2,3}","d) int[] A=[1,2,3]") ;
	Question Q4=new Question("Q: When is the object created with new keyword?",
									"a) At run time ","b) At compile time","c) Depend on code","d) None");
	Question Q5=new Question("Q: In which of the following is toString() method defined? ",
									"a) java.lang.Object ","b) java.lang.object","c) java.lang.String","d) java.lang.Util");
	Question Q6=new Question("Q: compareTo() returns? ",
									"a) True ","b) False","c) An int value","d) Compare");
	Question Q7=new Question("Q:  Identify the output of the following program."
										+ "String str = “abcde”;"
										+ "System.out.println(str.substring(1, 3)); ",
										"a) abc ","b) bc","c) bcd","d) cd");
	Question Q8=new Question("Q: To which of the following does the class string belong to. ",
									"a) java.lang","b) java.awt","c) java.applet","d) java.String");
	Question Q9=new Question("Q: Identify the return type of a method that does not return any value. ",
									"a) Void","b) int","c) void","d) Int");
	Question Q10=new Question("Q: Where does the system stores parameters and local variables whenever a method is invoked? ",
									  "a) Heap","b) Stack","c) Array","d) Tree");
	
	//create Map object to store the value in key-value pair.
	Map<Question,Character> lhm=new HashMap<Question,Character>();
		lhm.put(Q1, 'c');
		lhm.put(Q2, 'c');
		lhm.put(Q3, 'b');
		lhm.put(Q4, 'a');
		lhm.put(Q5, 'a');
		lhm.put(Q6, 'c');
		lhm.put(Q7, 'b');
		lhm.put(Q8, 'a');
		lhm.put(Q9, 'c');
		lhm.put(Q10, 'b');
		
		
		System.out.println("Enter your id >>");
		int id=sc.nextInt();
		
		System.out.println("Enter Your name >>");
		String name=sc.nextLine();
		
		name += sc.nextLine();
		
		
		int size= lhm.size();
		System.out.println("Number of questions >> "+size);
		System.out.println("Attemp all question compulsary >>");
		
		System.out.println();
		System.out.println();
		
		
		for(Map.Entry<Question, Character> map:lhm.entrySet()) {
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			
			System.out.println("Enter Your Answer");
			
			Character ans=sc.next().charAt(0);
			
			
			
			int correctAns=Character.compare(ans, map.getValue());
			if(correctAns==0) {
				System.out.println("Correct");
				correctAnsCount++;
			}else {
				System.out.println("Wrong");
				wrongAnsCount++;
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("__________Display Result_________");
		
		int correctAns=correctAnsCount;
		System.out.println("Correct Answer >> "+correctAns);
		
		int wrongAns=wrongAnsCount;
		System.out.println("Wrong Answer >> "+wrongAns);
		
		int  score=(10*correctAns)/lhm.size();
		System.out.println("Total Score is >> "+score);
		
		
		String  _class="";
		
		if(score<=10 && score>=8) {
			 _class="Class A";
			System.out.println(_class);
		}else if(score<8 && score>=6) {
			_class="Class B";
			System.out.println(_class);
		}else if(score==5) {
			 _class="Class C";
			System.out.println(_class);
		}else if(score<5){
			 _class="Fail";
			System.out.println(_class);
		}else {
			System.out.println("_____Invalid_____");
		}
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Next Student >> ");
		System.out.println("Enroll");
		
		
		tableData.insertQuizData(name, correctAns, wrongAns, _class);
		
		
	}

	
	

}
