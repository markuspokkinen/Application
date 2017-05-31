package controller;
import methods.Numbers;

public class Controller implements ControllerINF {
	Numbers number;
	
	public Controller(Numbers number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}
	@Override
	public void plusNumber() {
		// TODO Auto-generated method stub
		number.plusOne();
	}
	@Override
	public void minusOne() {
		// TODO Auto-generated method stub
		number.minusOne();
	}
	@Override
	public String number() {
		// TODO Auto-generated method stub
		return Integer.toString(number.returnNumber());
	}

}
