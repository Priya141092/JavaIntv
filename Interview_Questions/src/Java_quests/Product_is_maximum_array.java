package Java_quests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product_is_maximum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[] = {1,2,4,7,3,5};
		int a[]= {};
		
		for(int i=0;i<b.length;i++)
		{
			
			for(int j=i+1;j<b.length;j++)
			{
				if((b[i]*b[j])>b[i])
				{
					List<Integer> list1 = new ArrayList<Integer>();
					list1.add(b[i]*b[j]);
					Collections.sort(list1);
					System.out.println(list1);
					//Integer maxi = Collections.max(list);
					
					//System.out.println(maxi);
					
					//System.out.println(list);
					//System.out.println(b[i]*b[j]);
				}
			}
		}

	}

}
