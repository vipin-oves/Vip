package Example_done_by_sir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class policy {
	Map<Integer, String>  policyMap = new HashMap<Integer, String>();
	static Scanner sc = new Scanner(System.in);
public void AddPolicy()
	{
		System.out.println("How many policies want's add");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Policy ID");
			int pid = sc.nextInt();
			System.out.println("Policy Name ");
			sc.nextLine();
			String pname = sc.nextLine();
			policyMap.put(pid, pname);
		}
		
		System.out.println("Available Policies ");
		for(Map.Entry m : policyMap.entrySet())
		{
			System.out.println(m.getKey() + "<===>" + m.getValue());
		}				
	}
	public List<Integer> SearchPolicy(String pname)
	{
		List<Integer> pids = new ArrayList<Integer>();
		
		for(Map.Entry m : policyMap.entrySet())
		{
			String pvalue = (String)m.getValue();
			if(pvalue.contains(pname))
			{
				Integer temp = (Integer)m.getKey();
				pids.add(temp);
			}
		}		
		return pids;
	}
public static void main(String[] args) {
		policy  pm = new policy();
		pm.AddPolicy();
		System.out.println("Enter Policy Name to Search");
		String pname = sc.nextLine();
		List<Integer> pids = pm.SearchPolicy(pname);
		
		if(!pids.isEmpty())		
			System.out.println(pids);
		else
			System.out.println("No Policies are existed");
	}

}
