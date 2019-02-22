package com.restau.menu;
import java.util.Scanner;

public class CommandMenu {

	Scanner sc = new Scanner(System.in);

	int nmbrCar;

	public int numbOfCar() {
		System.out.println("How many car would you want ?: ");
		int nmbrCar = -1;
		do {
			nmbrCar = sc.nextInt();
		} while (nmbrCar < 1);
		return nmbrCar;
	}

	public void brandShowcase() {
		System.out.println("Which car do you want ? : ");
		System.out.println("1 - BMW");
		System.out.println("2 - Audi");
		System.out.println("3 - Mercedes");
	}

	public void modelCars() {
		System.out.println("1 - BM-x6");
		System.out.println("2 - Audi-TT");
		System.out.println("3 - Class-A");
	}

	public void carsOption() {
		System.out.println("1 - All-options include");
		System.out.println("2 - Semily option");
		System.out.println("3 - Less option");
	}

	public void carPremiumOpiton() {
		System.out.println("1 - All-options include");
		System.out.println("2 - Semily option");
	}

	public void carfuel() {
		System.out.println("1 - Fuel");
		System.out.println("2 - Gazole");
	}

	public int askCar() {
		brandShowcase();
		int askCar = sc.nextInt();
		return askCar;
	}

	public int askModel() {
		modelCars();
		int askModel = sc.nextInt();
		return askModel;
	}

	public int askOption() {
		carsOption();
		int askOption = sc.nextInt();
		return askOption;
	}

	public int askFuel() {
		carfuel();
		int fuel = sc.nextInt();
		return fuel;
	}

	public int askPremiumOption(int option) {

		switch (option) {
		case 1:
			askModel();
		case 2:
			carsOption();
		case 3:
			carPremiumOpiton();
		case 4:
			askFuel();
		}
		int askOption = sc.nextInt();
		return askOption;
	}

	public void buyCar() {
		int choseCar = askCar();
		int model = 0;
		int option = 0;
		int carFuel = 0;
		switch (choseCar) {
		case 1:
			option = askPremiumOption(1);
			carFuel = askFuel();
			break;
		case 2:
			model = askModel();
			option = askPremiumOption(2);
			carFuel = askFuel();
			break;
		case 3:
			model = askModel();
			option = askPremiumOption(3);
			carFuel = askFuel();
			break;
		case 4:
			model = askModel();
			option = askPremiumOption(4);
			carFuel = askFuel();
			break;
		}

		confirmationOrder(model, option, carFuel, choseCar);
	}

	public void RunCar() {
		int nmbCar = numbOfCar();
		for (int i = 0; i < nmbCar; i++) {
			buyCar();
		}
	}

	public void confirmationOrder(int chose, int model, int option, int fuel) {
		System.out.println("You had chose : " + chose);
		System.out.println("You had chose : " + model);
		System.out.println("You had chose : " + option);
		System.out.println("You had chose : " + fuel);
	}

}
