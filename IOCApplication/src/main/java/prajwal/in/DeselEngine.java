package prajwal.in;
public class DeselEngine implements IEngine {
    public DeselEngine() {
    	System.out.println("Desel engine construct");
    }
	@Override
	public boolean start() {
		System.out.println("desel engine start");
		return false;
	}

}
