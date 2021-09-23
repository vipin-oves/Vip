package hcoll;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
public class map {
	HashMap<Integer, String> Insurance = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	Integer idNumber;
	String name;
	int numb=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
		public static <K, V> K getKey(HashMap<K, V> Insurance, V value)
		    {
		        for (HashMap.Entry<K, V> entry: Insurance.entrySet())
		        {
		            if (value.equals(entry.getValue())) {
		                return entry.getKey();
		            }
		        }
		        return null;
		    }
	
		void add() throws IOException
		{
		System.out.println("Enter The number of policy name you want to store:");
		int n = sc.nextInt();
		do
		{
			System.out.println("Enter Policy Id:");
			idNumber = sc.nextInt();
			System.out.println("Enter Policy Name:");
			name = br.readLine();
			Insurance.put(idNumber, name);
			numb++;
		}while(numb<n);
		}
		
		void print()
		{
			System.out.println("   ID Number  "+ "      Policy Name");		
			for(int id:Insurance.keySet()){
				System.out.println("       "+id+"             "+Insurance.get(id));
			}
			System.out.println("\n**********************************");
		}
		void search()
		{
			System.out.println("Enter The policy name to be searched:");
			String na=sc.next();
			int count=0;
				boolean contains = false;
				for (String value : Insurance.values()) {
				    if(value.contains(na)){
				        contains = true;
				         int k=getKey(Insurance,value);
				         System.out.println(k);
							count++;
				    }
				}
			if(count==0)
			{
				System.out.println("not found");
			}
		}
}
