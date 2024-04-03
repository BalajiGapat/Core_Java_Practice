package multi_threading;

class Brackets
{
	/* synchronized */ public void printBracket(char open, char close)
	{
		// tons of lines of code
		synchronized (this) 
		{
			for(int i=0;i<10;i++)
			{
				if(i<5)
					System.out.print(open);
				else
					System.out.print(close);
			}
			System.out.println();
		}
		// tons of lines of code
	}
}

public class Synchronization
{
	public static void main(String[] args) {
		Brackets br=new Brackets();
		
		Thread t1=new Thread( new Runnable() {
			@Override
			public void run()
			{
				br.printBracket('[', ']');
			}
		} );
		
		Thread t2=new Thread( ()->{
			br.printBracket('{', '}');
		} );
		
		
		t1.start();
		t2.start();
	}
}
