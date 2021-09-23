package handson9;

public class loan 
{
	 public double calculateLoanAmount(loanemp loanempObj) {
		    double loan=0;
		    if(loanempObj instanceof pemp)
		    {
		        loan=0.15*(loanempObj.getSalary());
		        return loan;
		    }
		    else
		    {
		        loan=0.1*(loanempObj.getSalary());
		        return loan;
		    }
		  }	

}
