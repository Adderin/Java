public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		int cmp;
    for(int i = 0; i < elements.length; i++){
      cmp = elements[i];
      int count;
        for(int j = 0; j < elements.length; j++){
            if(cmp == elements[j]) {count++;}
              if(count > maxOccurrences) {  //not finished, start from here
		return null;
	}

}
