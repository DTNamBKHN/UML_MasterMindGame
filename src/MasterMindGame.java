import java.io.*;
public class MasterMindGame {

	public static void main(String[] args) throws IOException {
		MasterMind mGame = new MasterMind();
		displayscreen();
		while (mGame.isProgress()) {
			System.out.print("Enter Your Guess: ");
			//E code
			Answers ans = new Answers(MasterMindGame.acceptNumber());
			//
			System.out.print(mGame.getResult(ans)+"\n");
		}
		if (mGame.isWon())
			System.out.print("YOU WIN");
		else {
			System.out.print("YOU LOST \n");
			System.out.print("CORRECT ANSWER IS " + mGame.getHiddenNumber());
		}
	}

	public static void displayscreen() {
		System.out.println("Please guess four hidden digits");
	}
	
	private static String acceptNumber() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}
