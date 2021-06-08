package Java_quests;

import java.util.Arrays;

public class Anagram_Program {

	public static void main(String[] args) {
		String s1="grab2";
		String s2 = "brag1";
		
		char[]m1= s1.toCharArray();
		char[]m2=s2.toCharArray();
		
		
		
		if(s1.length()!=s2.length())
		{
			System.out.println("its not an anagram");
		}
		Arrays.sort(m1);
		Arrays.sort(m2);
		
	
			{
				if(Arrays.equals(m1, m2))
				{
					System.out.println("its anagram");
				}
				
				else
				{
					System.out.println("not a anagram");
				}
		
			}
	}

	}


