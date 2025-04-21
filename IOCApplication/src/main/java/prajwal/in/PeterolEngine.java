package prajwal.in;

public class PeterolEngine implements IEngine {

	public PeterolEngine() {
		System.out.println("petrol construct");// TODO Auto-generated constructor stub
	}

	@Override
	public boolean start() {
		System.out.println("petrol engine start");
		return true;
	}

}
