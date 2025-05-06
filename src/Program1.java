
public class Program1 {

	public static void main(String[] args) {
		System.out.println("Hello World!")
		Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Processing
        double square = number * number;

        // Output
        System.out.println("The square of " + number + " is: " + square);
        
        scanner.close();

	}

	}

	}

}
