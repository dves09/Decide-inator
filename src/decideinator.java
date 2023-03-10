import java.util.Random;
import java.util.Scanner;
import java.util.*;


public class decideinator {

	static String generateRandom(Vector<String> list) {
		int rng = new Random().nextInt(list.size());
		return list.get(rng);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		Vector<String> listt = new Vector<String>(); 
		String inputt=null;
		System.out.println("Input things to decide! If you are done type 'Decide!'");
		do {
			inputt=sc.nextLine();
			if(!"Decide!".equals(inputt)) {
				listt.add(inputt);
				inputt=null;
			}
		}while(!"Decide!".equals(inputt));
		
		String selection;
		int flag=0;
		System.out.printf("\n\n");
		System.out.println("|============================|");
		System.out.println("|Activate decideinator? (Y/N)|");
		System.out.println("|============================|");
		selection=sc.nextLine();
		System.out.printf("\n\n");
		if("Y".equals(selection)) {
			do {
				selection=null;
				String rando = generateRandom(listt);
				
				System.out.println("|The decideinator has decided: " + rando + "|");
				System.out.println("|============================|");
				System.out.println("|Generate again? (Y/N)       |");
				System.out.println("|============================|");
				selection=sc.nextLine();
				System.out.printf("\n\n");
				
				if("N".equals(selection)) {
					flag++;
					selection=null;
				}else {
					System.out.println("|=======================================================================================|");
					System.out.println("|Remove last outcome? If there is no possible outcome, machine will self destruct! (Y/N)|");
					System.out.println("|=======================================================================================|");
					selection=sc.nextLine();
					System.out.printf("\n\n");
					if("Y".equals(selection)) {
						listt.remove(listt.indexOf(rando));
						selection=null;
					}
				}
			}while(flag==0 && listt.size()!=0);
		}
		System.out.println("Curse you Perry the platypus!");
		sc.close();
	}

}
