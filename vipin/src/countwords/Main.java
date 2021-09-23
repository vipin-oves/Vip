package countwords;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter string");
        String input=sc.nextLine();
        input=input.toLowerCase();
        String []split=input.split("[\\s,:;!.?]+");
        List<String> splitData=Arrays.asList(split);
        Map<String,Integer> data=new HashMap<>();
        for(String str:splitData)
        {
            int occurences=Collections.frequency(splitData,str);
            data.put(str,occurences);
        }
        List<String> sortedWords=new ArrayList<String>(data.keySet());
        Collections.sort(sortedWords);
        System.out.println("Number of words "+split.length);
        System.out.println("Words with the count");
        for(String word:sortedWords)
        {
            String str=null;
            for(int i=0;i<splitData.size();i++)
            {
                if(splitData.get(i).toLowerCase().equals(word))
                str=splitData.get(i);
            }
            System.out.println(str+": "+data.get(word));
        }

	}

}
