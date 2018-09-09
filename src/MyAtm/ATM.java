package MyAtm;
import java.util.Scanner;
public class ATM{
		public static void main(String[] args){
			        int p,n;
			        int c,a1=0,a2=0,a3=0;
			        System.out.println("Insert Card\n");
			        System.out.println("Enter PIN\n");
			        Scanner s=new Scanner(System.in);
			        p=s.nextInt();
			        while(true){
			        System.out.println("OPTIONS:");
			        System.out.println("1)Withdraw Money\n");
			        System.out.println("2)Deposit Money\n");
			        System.out.println("3)Balance Inquiry\n");
			        System.out.println("4)Reset Pin\n");
			        System.out.println("5)Exit\n");
			        c=s.nextInt();
			        switch(c){
			        case 1:if(a3!= 0){
			        	   System.out.println("Enter Amount\n");
			               a1=s.nextInt();
			               if(a1<=a3){
			               System.out.printf("\n%d₹ Amount Withdrawed\n",a1);
			               a3=a3-a1;}
			               else{
			               System.out.println("Amount entered is greater than amount present in account\n");}}
			               else {
			        	   System.out.println("Your Balance in Nil\n");}
			               break;
			        case 2:System.out.println("Enter Amount\n");
			               a2 = s.nextInt();
			               System.out.printf("\n%d₹ Amount Deposited\n",a2);
			               a3=a3+a2;
			               break;
			        case 3:System.out.printf("\n%d₹\n",a3);
			               break;
			        case 4:System.out.println("Enter Current PIN\n");
			               n=s.nextInt();
			               if(n==p) {
			               System.out.println("Enter new PIN\n");
			               p = s.nextInt();
			               System.out.println("PIN Changed\n");}
			               else {
			               System.out.println("Invalid PIN\n");}
			               break;
			        case 5:java.lang.System.exit(0);  
			               break;     
			        default:System.out.println("Please enter a a valid option\n");	
			                break;
			        }
			      }  
				}
			}
