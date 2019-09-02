/*
Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. 
For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], 
drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
Example
EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
*/

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		int cmp;
    for(int i = 0; i < elements.length; i++){
      cmp = elements[i];
      int count;
        for(int j = 0; j < elements.length; j++){
            if(cmp == elements[j]) {count++;}
              if(count > maxOccurrences) {  				//not finished, start from here
		return null;
	}

}
