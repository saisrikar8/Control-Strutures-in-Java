import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		// Task 1
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		if (number > 0){
			System.out.println(number + " is positive.");
		}
		else if (number < 0){
			System.out.println(number + " is negative.");
		}
		else{
			System.out.println("You entered 0.");
		}

		// Task 2
		System.out.println("Enter a number:");
		int x = input.nextInt();
		if (x > 0 && x < 10){
			System.out.println("middle");
		}

		// Task 3
		String letter = input.nextLine();
		String str = "abcde";
		if (str.substring(0,1).equals(letter)){
			System.out.println("The letter is a");
		}
		else if (str.substring(1,2).equals(letter)){
			System.out.println("The letter is b");
		}
		else if (str.substring(2,3).equals(letter)){
			System.out.println("The letter is c");
		}
		else if (str.substring(3,4).equals(letter)){
			System.out.println("The letter is d");
		}
		else if (str.substring(4,5).equals(letter)){
			System.out.println("The letter is e");
		}
  }
}

