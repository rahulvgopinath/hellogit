import java.util.Random;

public class FirstClass {

	public static void main(String[] args) {
		
		Random dice = new Random();
		float floatnumber;
		int intnumber;
		int maximum = 5;
		int count=0;
		int repeatCount=0;
		
		int arrayint[] = new int[100];
		
		while(count<maximum)
		{
			

		for(int mainLoop=0; mainLoop<count+1;mainLoop++) {
		
			//System.out.println("Main Loop " + mainLoop + " Starts");
			
			floatnumber = dice.nextFloat();
			
			intnumber = (int) (floatnumber *10);
						
			arrayint[mainLoop]= intnumber;
			
			repeatCount=0;
			
			//System.out.println(intnumber + " number generated ");

			
			for(int arraycheck=0;arraycheck<count;arraycheck++) {
				
				//System.out.println("Random Integer Now is " + intnumber);
				//System.out.println("Array Element " + arraycheck + " is " + arrayint[arraycheck]);
				
				if(arrayint[arraycheck]==intnumber && mainLoop>0)
				{
					repeatCount++; 
				}
				//System.out.println("RepeatCheck value is " + repeatCount);
			
				}
			   //System.out.println("loop " + mainLoop + " over");
			
						
				if(repeatCount<1) {
				System.out.println("Random number " + intnumber + " printed in loop " + mainLoop);
				repeatCount = 0;
				}
				
				if(repeatCount<1 && count<maximum)
					count++;
							
		} //mainLoop Close
		
		}

	} // main close

} // class close