import java.util.Scanner;
public class Decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1,text2;  
		char c;  
		int i=0;  
		Scanner scan = new Scanner(System.in);  
		System.out.print("Enter Text : ");  
		text1=scan.nextLine();  
		text2=text1.toUpperCase();  
		for(i=text2.length()-1;i>=0;i--)  
		{  
			c=text2.charAt(i);  
			if(c=='E'){  
				c='R';  
		 	}  
		 	else if(c=='R'){  
		 		c='W';  
		 	}  
		 	else if(c=='W'){  
		 		c='E';  
		 	}  
		 	System.out.print(c);  
		 	}
	}
}
