package Java_quests;

public class Substring_of_string_without_using_contains {

	public static void main(String[] args) {
		String p = "priyas";
		String sub1= "iya";
		int count=0;
		int count1=sub1.length();
		
		for(int i=0;i<p.length();i++)
		{
			for(int j=0;j<sub1.length();j++)
			{
				if((p.charAt(i))==(sub1.charAt(j)))
				{
					count=count+1;
				}
				
			}
			System.out.println(count);
		}
			
				
				if(count1==count)
				{ 
					System.out.println("it contains subs");
				}
			
			}
		

	}


