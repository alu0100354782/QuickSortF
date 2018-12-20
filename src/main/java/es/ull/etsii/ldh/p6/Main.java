package es.ull.etsii.ldh.p6;

public class Main {

	public static void main(String[] args) {
		int[] values = {23,523,7,1,12,98,231,53};
		Quicksort qs = new Quicksort();
		
		qs.sort(values);
		
		for(int i = 0; i < values.length; i++)
			System.out.println(values[i]);
		
	}

}
