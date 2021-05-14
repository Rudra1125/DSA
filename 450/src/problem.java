import java.util.Scanner;

public class problem {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        try {
            Scanner s= new Scanner(System.in);
            int t=s.nextInt();
            while(t-->0){
                int n=s.nextInt();
                int x=s.nextInt();
                int k=s.nextInt();
                int ans=0;
                for(int i=0;i<n+2;i=i+k){
                    if(i==x){
                        System.out.println("YES");
                        ans=1;
                        break;
                    }
                }for(int i=n+1;i>=0;i=i-k){
                    if(i==x){
                    	System.out.println("YES");
                        ans=1;
                        break;
                    }
                }
                if(ans==0)
                    System.out.println("NO");
                if(ans==1){
                    System.out.println("YES");
                }
                ans=0;
            }
        } catch(Exception e) {
        }
		
	}
}
