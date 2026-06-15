package ActivityRobot;

class Human {
	
	static int humancounter = 0;
	
	Human () {
		humancounter += 1;
	}
	
	public void walking() {
		System.out.println("Human is walking");
	}
	public void talking() {
		System.out.println("Human is talking");
	}
}
class Boy extends Human {
	public void walking() {
		System.out.println("Boy is walking");
	}
	public void talking() {
		System.out.println("Boy is talking");
	}
}

class Girl extends Human {
	public void walking() {
		System.out.println("Girl is walking");
	}
	public void talking() {
		System.out.println("Girl is talking");
	}
}

class Robot {
	
	static int robotcounter = 0;
	
	Robot () {
		robotcounter += 1;
	}
	
	public void walking() {
		System.out.println("Robot is walking");
	}
	public void talking() {
		System.out.println("Robot is talking");
	}
}


public class ActivityRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human BoyA = new Boy();
		Human BoyB = new Boy();
		Human BoyC = new Boy();
		Human GirlA = new Girl();
		Human GirlB = new Girl();
		Human GirlC = new Girl();
		Robot RobotA = new Robot();
		Robot RobotB = new Robot();
		Robot RobotC = new Robot();
		
		System.out.println("Human = " + Human.humancounter);
		System.out.println("Robot = " + Robot.robotcounter);
	}

}
