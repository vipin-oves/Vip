package Luckyn;


public class FindLucky 
{

	private int n;
	
public void ReadNumber(int n)
{
	this.n=n;
}
public void PrintLuckyNumber()
{
	  if(n<1000 || n>9999)
      {
          System.out.println(n+" is not a valid car number");
      }
      else
      {int sum=0;
          while(n>0)
          {
              sum+=n%10;
              n/=10;
          }
          if(sum%3==0 || sum%5==0 || sum%7==0)
          {
              System.out.println("LUCKY Number");
          }
          else
          {
              System.out.println("Sorry, its not my lucky number");
          }
      }
}
}

