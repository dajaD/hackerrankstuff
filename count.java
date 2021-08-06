//count to 100, and any even number print out a word
//any multiple of 3 prints out :multiple of 3"

package counters;

public class count {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 100; i++)
		{
			if(i%2 == 0 && i !=0)
			{
				System.out.println( i + " is a multiple of 2 and not 3.");
			}
			else if(i%3 == 0 && i !=0)
			{
				System.out.println(i + " is a multiple of 3 and not 2.");
			}
			else
			{
				System.out.println(i);
			}
		}
		// TODO Auto-generated method stub

	}

}
