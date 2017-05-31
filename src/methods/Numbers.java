package methods;

public class Numbers implements NumbersINF {
	private int number;
	
	public Numbers(){
		number = 0;
	}
	@Override
	public int returnNumber() {
		// TODO Auto-generated method stub
		return number;
	}

	@Override
	public void plusOne() {
		// TODO Auto-generated method stub
		number++;
	}
	@Override
	public void minusOne() {
		// TODO Auto-generated method stub
		number--;
	}
	
	
	
	
}
