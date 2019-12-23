/* This is one of my first Java programs that I have written
 * The main gaol of this is to become more familiar with the Java language.
 * I was NOT trying to make a exciting/thrilling hangman game
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman{
	public static void main( String[] args ) throws Exception{
		Random rand = new Random();
		BufferedReader in = new BufferedReader(new FileReader("words.txt"));
		String str;

		ArrayList<String> list = new ArrayList<String>();
		while((str = in.readLine()) != null){
			list.add(str);
		}

		String[] stringArr = list.toArray(new String[0]);

//		System.out.println( list.get(9999)  );		
//		System.out.println( stringArr[9999] );
		
//		System.out.println( rand.nextInt(100) );

		boolean run = true;
		String myWord = stringArr[ rand.nextInt(9999) ];
		
		
		ArrayList<String> display = new ArrayList<String>();
		for( int i = 0; i < myWord.length(); i++ )
		{
			display.add("_");
		}
		System.out.println( myWord );
		System.out.println( display );

		Scanner input = new Scanner( System.in );

		int timeWon = 0;
		while(run){
			char user;
			System.out.println("Enter char: ");
			user = input.next().charAt(0);	

			for( int i = 0; i < myWord.length(); i++ ){
				String convert = String.valueOf( myWord.charAt(i));
		//		System.out.println( convert );
				if( user == myWord.charAt(i) ){
//					System.out.println("Found");
					display.set( i, convert );
					timeWon++;
					if(timeWon == myWord.length()){
						run = false;
						System.out.println("You won!");
					}
				}
			}
			System.out.println(display);
		}
	}
}
