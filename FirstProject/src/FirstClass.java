import java.util.Random;

public class FirstClass {

	public static void main(String[] args) {
		
		Random dice = new Random();
		float floatnumber;
		int intnumber;
		int maximum = 10;
		int count=1;
		
		int arrayint[] = new int[100];
		
	while(count<maximum)
	{
		for(int i=0; i<count;i++) {
			
			floatnumber = dice.nextFloat();
			
			intnumber = (int) (floatnumber *10);
						
			arrayint[i]= intnumber;
			
			//System.out.println(number + " number generated ");
			
			int repeatCheck = 0;
			
			for(int arraycheck=0;arraycheck<count;arraycheck++) {
				
				//System.out.println("Random Integer Now is " + intnumber);
				//System.out.println("Array Element " + arraycheck + " is " + arrayint[arraycheck]);
				
				if(arrayint[arraycheck]==intnumber && i>0)
				{ 	
					repeatCheck++; 
				}
				
				//System.out.println("RepeatCheck value is " + repeatCheck);
			
					}
			//System.out.println("loop over");
			
						
				if(repeatCheck==0) {
				System.out.println("Random number " + intnumber + " printed in loop " + i);
				//if(count<maximum)
				count++;
								
				}
				
				
		}
		
	}
		// TODO Auto-generated method stub
		System.out.println("Hello World!");

	}
	
	public int randomGenerator(int minimum, int maximum) {
		Random rn = new Random();
		int range = maximum - minimum + 1;
		int randomNum =  rn.nextInt(range) + minimum;
		return randomNum;

}
}