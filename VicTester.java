import uw.syp.java.tools.Vic;
public class VicTester {
	public static void main(String[] args) {
		
		Vic.reset(args);
		
		Vic jane = new Vic();
			
		jane.moveOn(); // moves jane forward 1 slot
		jane.moveOn(); // on 3rd slot
		
		jane.backUp(); // moves jane backward 1 slot
		
		jane.takeCD(); // take CD and move top top of stack
		jane.moveOn(); // on 3rd slot
		jane.moveOn(); // on 4th slot
		jane.putCD(); // put CD from the topof stack to slot
		
		Vic.say("I'm finally free");
	}
}