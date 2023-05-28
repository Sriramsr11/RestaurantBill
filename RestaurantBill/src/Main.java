import java.util.*;

public class Main {
	public static Scanner sc=new Scanner(System.in);
	public static int choice,Quantity=1;
	public static String again;
	public static double total=0,Pay;
	
	public static void menu() {
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("\tWELCOME TO OUR RESTAURANT");
		System.out.println("\tRestaurant Menu :");
		System.out.println("\t1) Burger BDT $80.00");
		System.out.println("\t2) Pizza  BDT $100.00");
		System.out.println("\t3) Coffee BDT $60.00");
		System.out.println("\t4) Cancel ");
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
	}
	
	public static void order() {
		System.out.println("1 to Burger || 2 to Pizza || 3 to Coffee || 4 to Cancel");
		System.out.println("Press You want to order :");
		choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Your choice Burger");
			System.out.println("How may Burger you want: ");
			Quantity=sc.nextInt();
			total=total+(Quantity*80);
			System.out.println("You want to buy Again: ");
			System.out.println("Press Y for [Yes] and N for [No]");
			again=sc.next();
			if(again.equalsIgnoreCase("Y"))
			order();
			else {
				while(true) {
					System.out.println("Enter payment : ");
					Pay=sc.nextDouble();
					if(total<Pay) {
						System.out.println("Customer's return "+(Pay-total));
						break;
					}else if(total==Pay) {
						break;
					}
					else {
						System.out.println("Not enough Remaining Payment amount : "+(total-Pay));
						total=total-Pay;
						continue;
					}
				}System.out.println("Thanks for Coming,Have a nice day!!!");
			}
		}
		
		else if(choice==2) {
			System.out.println("Your choice Pizza");
			System.out.println("How may Pizza you want: ");
			Quantity=sc.nextInt();
			total=total+(Quantity*100);
			System.out.println("You want to buy Again: ");
			System.out.println("Press Y for [Yes] and N for [No]");
			again=sc.next();
			if(again.equalsIgnoreCase("Y"))
			order();
			else {
				while(true) {
					System.out.println("Enter payment : ");
					Pay=sc.nextDouble();
					if(total<Pay) {
						System.out.println("Customer's return "+(Pay-total));
						break;
					}else if(total==Pay) {
						break;
					}
					else {
						System.out.println("Not enough Remaining Payment amount : "+(total-Pay));
						total=total-Pay;
						continue;
					}
				}System.out.println("Thanks for Coming,Have a nice day!!!");
			}
		}
		else if(choice==3) {
			System.out.println("Your choice Coffee");
			System.out.println("How may Coffee you want: ");
			Quantity=sc.nextInt();
			total=total+(Quantity*60);
			System.out.println("You want to buy Again: ");
			System.out.println("Press Y for [Yes] and N for [No]");
			again=sc.next();
			if(again.equalsIgnoreCase("Y"))
			order();
			else {
				while(true) {
					System.out.println("Enter payment : ");
					Pay=sc.nextDouble();
					if(total<Pay) {
						System.out.println("Customer's return "+(Pay-total));
						break;
					}else if(total==Pay) {
						break;
					}
					else {
						System.out.println("Not enough Remaining Payment amount : "+(total-Pay));
						total=total-Pay;
						continue;
					}
				}System.out.println("Thanks for Coming,Have a nice day!!!");
			}
		}
		else if(choice==4) {
			System.out.println("Thanks for coming,Have a nice day!!");
			System.exit(0);
		}else{
			System.out.println("Choose a Food in this items : ");
			order();
		}		
	}
	public static void main(String[] args) {		
		Main.menu();
		Main.order();
	}
}