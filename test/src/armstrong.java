public class armstrong {
	  public static void main(String[] args)  {  
		    int sum=0,a,temp;  
		    int n=153;//It is the number to check
		    temp=n;  
		    
		    
		    while(n>0)  
		    {  
		    a=n%10;  
		    sum=sum+(a*a*a); 
		    n=n/10;  
		    }  
		    if(temp==sum)  
		    	System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
		}  