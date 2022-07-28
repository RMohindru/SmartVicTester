import uw.syp.java.tools.Vic;

public class SmartVic extends Vic {
	// instance method
	// requires an object to be executed
	public void moveTake() {
		moveOn();
		takeCD();
	}
	public void backPut() {
		backUp();
		putCD();
	}
	public void backTake() {
		backUp();
		takeCD();
	}
	public void movePut() {
		moveOn();
		putCD();
	}
}