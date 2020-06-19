import java.util.Random;

public class FirstClass {

	public static void main(String[] args) {
		
		Random dice = new Random();
		float floatnumber;
		int intnumber;
		int maximum = 10;
		int count= 0;
		int repeatCount=0;
		int mainLoop = 0;
		
		int arrayint[] = new int[100];
		
		while(count<maximum)
		{
			
			//System.out.println("Main Loop " + mainLoop + " Starts");
			
			floatnumber = dice.nextFloat();
			
			intnumber = (int) (floatnumber *10);
						
			arrayint[count]= intnumber;
			
					repeatCount=0;
			
			//System.out.println(intnumber + " number generated ");

			
			for(int arraycheck=0;arraycheck<count;arraycheck++) {
				
				//System.out.println("New Random Integer Now is " + intnumber + " Check against " + arrayint[arraycheck]);
				//System.out.println("Array Element " + arraycheck + " is " + arrayint[arraycheck]);
				
				if(arrayint[arraycheck]==intnumber && mainLoop>0)
				{
					repeatCount++; 
				}
				//System.out.println("RepeatCheck value is " + repeatCount);
			
				}
			   			
						
				if(repeatCount==0) {
				
				System.out.println("Random number " + intnumber + " printed in loop " + mainLoop);
				arrayint[count]= intnumber;
				count++;
				
					}
				
				//System.out.println("loop " + mainLoop + " over");
							
				mainLoop++;
		} // while loop close

	} // main close

} // class close