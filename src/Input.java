//test desktop
import java.util.Scanner;
public class Input {

	private Scanner scanner;
	
	public Input() {
		scanner = new Scanner(System.in);
	}
	
	
	public InputData readInput() {
		System.out.println("Ввести x, y и действие между ними");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		String function = scanner.next();
		return new InputData(x, y, function);
	}
	
}
