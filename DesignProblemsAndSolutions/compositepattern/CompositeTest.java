package test;

public class CompositeTest {
	
	public static void main(String args[]){
		
		Employee CEO = new Employee("Niju",10,10000.00);
		Employee VP = new Employee("Mahesh",20,5000.0);
		Employee SE = new Employee("Venky",30,500.0);
		
		CEO.add(VP);
		VP.add(SE);
		System.out.println("CEO:"+ CEO.toString());
		for (Employee vp:CEO.getSubordinates()){
			System.out.println("VP:"+vp.toString());
			for (Employee se:vp.getSubordinates()){
				System.out.println("Software Engineer:"+se.toString());
			}
		}
		
	}

}
