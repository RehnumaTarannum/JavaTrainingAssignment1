/*	Java Training Assignment 1 
	Date 3/8/2017
	Organizer: Jeshal Mehta
	Participant : Rehnuma Taraannum
	tarannum.rehnuma@gmail.com
*/
public class Assignment1 {
	
	/*	Q1: THE FACTORIAL FUNCTION
	*/
	public static int factorial(int num){
		if(num==0 || num==1){
	        return num;
		}
	    else{
	        return num*factorial(num-1);
	    }
	}
	/*	Q2: FUNCTION THE PRINTS THE PYRAMID OF 
			NUMBER IN SEQUECE FROM 1-5
	*/
	public static void pyramid() {
		int count = 1;
		for (int i = 5; i > 0 ; i--) {
			
			for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
			
			for (int j = 1; j <= count; j++)
            {
                System.out.print(j+" ");
            }
			
			System.out.println();
			count++;
			
		}
		
	}
	
	/*	Q3: THE FIBONACCI FUNCTION
	*/
	public static int fibonacci(int num){
		if(num<=1){
	        return num;
	    }
	    else{
	        return fibonacci(num-1)+fibonacci(num-2);
	    }
		
	}
	
	/* 	Q4: THE PALINDROME FUNCTION TO 
			DETERMINE IF A NUMBER IS A PALINDOME
	*/
	public static void NumberPalindrome(int num) {
		int number = num;
		double reverse = 0;
		 while (num > 0)
		 {
		      double remainder = num % 10;
		      reverse = reverse * 10 + remainder;
		      num = num / 10;
		 }
		 
		 if(number == reverse) {
			 System.out.println("The number "+number+" is a Palindrome");
			
		} else {
			System.out.println("The number "+number+" is not a Palindrome");
		}
		
	}

	public static void main(String[] args) {
		
		/*	CALL TO THE FUNCTIONS IN ORDER OF QUESTIONS
		*/
		System.out.println("\n\t CREATED BY REHNUMA TARANNUM\t\n");
		System.out.println("\nThe Factorial value of 10 is "+factorial(10)+"\n");
		
		pyramid();
		
		System.out.println("\nThe Fibonacci Series of upto 15 numbers\n");
		System.out.println("n : F(n)\n");
		for (int i = 0; i < 15; i++) {
			System.out.println(i+" : "+fibonacci(i));
		}
		System.out.println("");
		NumberPalindrome(123454321);
		System.out.println("\n");
		
	}

}