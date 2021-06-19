package LatestQuestions;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names [] = {"Java","Python","Ruby","Java"};
		
		//1.compare each element On^2 -- worst solution
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if (names[i].equals(names[j]))
					System.out.println("duplicate ele is ::::"+names[i]);
			}
		}
		
		//2 Using HashSet we can store unique values in collections
		
		

	}

}
