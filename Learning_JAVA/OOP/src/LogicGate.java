// Day 2 - Learning OOP concepts

public class LogicGate {

	// A logic gate is always in one of two states- on/off
	// Variable called state
	boolean state;
	
	// Public constructor
	public LogicGate(boolean state) {
		this.state = state;
	}

	// Method that returns the current state
	public boolean getState() {
		return this.state;
	}
	
	// Method changes the state to the opposite state
	public void not() {
		this.state = !state;
		System.out.println("After applying the 'not', the gate is " + state);
	}
	
	// Method that changes the state to true
	public void set() {
		this.state = true;
		System.out.println("After applying the 'set', the gate is " + state);
	}

	// Method that changes the state to false
	public void negate() {
		this.state = false;
		System.out.println("After applying the 'negate', the gate is " + state);
	}
}
