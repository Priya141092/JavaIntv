package LatestQuestions;

public class Insert_ele_index_position {

	public static void main(String[] args) {

  int a[] = {1,4,6,8,9};
  int ele =5;
  int index =3;
  
  
  for(int i=0;i<a.length;i++)
  {
	  if(i==index)
	  {
		  a[i+1]=a[i];
		  a[i]=ele;
		 
	  }
	  System.out.println(a[i]);
  }
  



	}

}
