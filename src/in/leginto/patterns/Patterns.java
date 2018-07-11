package in.leginto.patterns;

public class Patterns {

	public static void main(String[] args) {
		
		
		AllPatterns p = new AllPatterns();
		
		p.trianglePattern(5);
		
		p.wellPattern(15);
		
		p.diskPattern(20);
		
		p.diskHolePattern(15,5);
		
		p.heartPattern(15);
		
		p.reverseWellPattern(15);
		
		
		
		
	}

}


class AllPatterns
{
	public void trianglePattern(int size)
	{
		
		for(int i=0; i<size ; i++)
		{
			for(int j=0; j<=i;j++)
			{
				System.out.print(i+1+" ");
			}
			System.out.println("");
		}
	}
	
	public void wellPattern(int size)
	{
		for(int i = 1; i< size; i++)
		{
			for(int j=1; j<2*size-2;j++)
			{
				if(j<=i || i+j>=2*(size-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		
	}
	
	public void diskPattern(int size)
	{
		for(int i = 0 ; i <= 2*size ; i++)
		{
			for(int j = 0; j<= 2*size; j++)
			{
				if(pow(i-size,2) + pow(j-size,2)<=pow(size,2))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
			
		}
		
	}
	
	
	public void diskHolePattern(int size, int holeSize)
	{
		for(int i = -size ; i <= size ; i++)
		{
			for(int j = -size; j<= size; j++)
			{
				if((pow(i,2) + pow(j,2)<=pow(size,2)) && (pow(i,2) + pow(j,2)>=pow(holeSize,2)))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
			
		}
		
	}
	
	public void heartPattern(int size)
	{
		for(int i = -size ; i <= size ; i++)
		{
			for(int j = -size; j<= size; j++)
			{
				if(-pow(pow(i,2)+pow(j,2)-5*size,3)<pow(j,2)*pow(i,3))
					System.out.print("♥ ");
				else 
					System.out.print("  ");
			}
			System.out.println();
			
		}
		
	}
	
	public void reverseWellPattern(int size)
	{
		for(int i = size-1; i> 0; i--)
		{
			for(int j=2*size-3; j>0;j--)
			{
				if(j<=i || i+j>=2*(size-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		
	}
	
	
	
	public int pow(int base, int expo)
	{
		int res = (int) Math.pow(base, expo);
		return res;
	}
	
}
