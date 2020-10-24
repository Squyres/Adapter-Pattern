import java.util.Scanner;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	private static OldCoffeeMachine oldMachine;

	public static void main(String[] args) {
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter();
		oldMachine = new OldCoffeeMachine();
		Scanner scan = new Scanner(System.in);
		scan = new Scanner(System.in);
		System.out.print("Select coffee flavor 1 or 2: ");
		int flavor = 0;
		while (true) {
			flavor = scan.nextInt();
			if (flavor == 1) {
				adapter.chooseFirstSelection();
			} else if (flavor == 2) {
				adapter.chooseSecondSelection();
			} else {
				System.out.print("Select flavor 1 or 2: ");
			}
		}
	}

	@Override
	public void chooseFirstSelection() {
		oldMachine.selectA();
	}

	@Override
	public void chooseSecondSelection() {
		oldMachine.selectB();
	}
}