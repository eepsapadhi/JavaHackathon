package javaHackathon;

public class MergeTwoSortArray {

	public static void main(String[] args) {
		int[] array1= new int[]{1,2,4,6,9,10,0,0,0,0};
		int[] array2= new int[]{3,5,7,8};
        int index1=array1.length - array2.length - 1;
		int index2=array2.length - 1;
		int curr_index=array1.length-1;
		
		while(curr_index >= 0)
		{
			if(index1 >= 0 && index2 >= 0)
			{
				if(array1[index1] > array2[index2])
				{
					array1[curr_index] = array1[index1];
					index1--;
				}
				else
				{
					array1[curr_index] = array2[index2];
					index2--;
				}
			}
			else if(index1 >= 0)
			{
				array1[curr_index] = array1[index1];
				index1--;
			}
			else
			{
				array1[curr_index] = array2[index2];
				index2--;
			}
			
			curr_index--;
		}
		
		System.out.println("Output: Printing the merged array");
		for(int i:array1)
		{
			System.out.print(i+",");

	}

}
}
