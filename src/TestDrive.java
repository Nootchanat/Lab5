
public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = Rectangle.getInstance();
		Rectangle r2 = Rectangle.getInstance();
		 r1.setWigthHight(6, 5);
		 
		 r2 = r1;
		 
		 System.out.println("R1 area :"+r1.getArea());
		 System.out.println("R2 area :"+r2.getArea());
		 System.out.println("Test");
	}

}
