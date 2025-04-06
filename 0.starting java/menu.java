import java.util.Scanner;
public class menu{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter food dish name(dosa,idli,vada) : ");
		String n = scanner.next();
		if(n.equals("dosa")){
			System.out.println("your selected dish is dosa, will be delivered in 20 minutes ");
		}
		else if(n.equals("idli")){
			System.out.println("your selected dish is idli, will be delivered in 10 minutes ");
		}
		else if(n.equals("vada")){
			System.out.println("your selected dish is vada, will be delivered in 15 minutes ");
		}
		else{
			System.out.println("dish not available ");
		}
		scanner.close();

	}
}
