package git_kaulins;

import java.util.Random;

public class kaulins {
	static void mestKaulinu() {
		int skaitlis;
		Random rand = new Random();
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Tu uzmeti: "+skaitlis);
	}

	public static void main(String[] args) {
		mestKaulinu();
	}

}
