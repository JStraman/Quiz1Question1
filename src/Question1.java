import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number of Completions");
		int completions = input.nextInt();
		System.out.println("Enter Number of Passing Attempts");
		int attempts = input.nextInt();
		System.out.println("Enter Number of Passing Yards");
		int yards = input.nextInt();
		System.out.println("Enter Number of Touchdown Passes");
		int touchdowns = input.nextInt();
		System.out.println("Enter Number of Interceptions");
		int interceptions = input.nextInt();
		
		Double a = (double) ((completions / attempts) -.3) * 5;
		Double b = (double) ((yards / attempts) -3) * .25;
		Double c = (double) (touchdowns / attempts) * 20;
		Double d = (double) 2.375 - (interceptions / attempts) * 25;
		
		Double passerRating = ((a + b + c + d) / 6) * 100;
		
		System.out.println("The Passer Rating is " + passerRating);
	}

}
