import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vr1,vr2,vr3,vr4,temp;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Input Value_1 : ");
		 vr1=scan.nextInt();
		 System.out.print("Input Value_2 : ");
		 vr2=scan.nextInt();
		 System.out.print("Input Value_3 : ");
		 vr3=scan.nextInt();
		 System.out.print("Input Value_4 : ");
		 vr4=scan.nextInt();
		 if(vr1>vr2){
		 temp=vr1;
		 vr1=vr2;
		 vr2=temp;
		 }
		 if(vr1>vr3){
		 temp=vr1;
		 vr1=vr3;
		 vr3=temp;
		 }
		 if(vr1>vr4){
		 temp=vr1;
		 vr1=vr4;
		 vr4=temp;
		 }
		 if(vr2>vr3){
		 temp=vr2;
		 vr2=vr3;
		 vr3=temp;
		 }
		 if(vr2>vr4){
		 temp=vr2;
		 vr2=vr4;
		 vr4=temp;
		 }
		 if(vr3>vr4){
		 temp=vr3;
		 vr3=vr4;
		 vr4=temp;
		 }
		 System.out.print("\nRectangle Area = : "+""+vr3+""+" * "+vr1+" = "+vr3*vr1);
	}
}