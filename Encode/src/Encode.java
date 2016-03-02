import java.util.Scanner;
public class Encode {

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
			if(c=='R'){  
				c='E';  
			}  
			else if(c=='W'){  
				c='R';  
			}  
			else if(c=='E'){  
				c='W';  
			}  
			System.out.print(c);  
		}
	}

}
