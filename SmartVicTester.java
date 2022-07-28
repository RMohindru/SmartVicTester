import uw.syp.java.tools.Vic;

public class SmartVicTester {
	public static void main(String[] args) {
		Vic.reset(args);
		SmartVic cupid = new SmartVic();
		cupid.moveOn();
		cupid.moveTake();
		cupid.backPut();
	}
}