package es.ull.etsii.ldh.p6tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import es.ull.etsii.ldh.p6.Quicksort;

class Tests {

	@Test
	void test() {
		Quicksort qs = new Quicksort();
		int[] values = new int[] {99,1,201,43,62,0,23,-8};
		qs.sort(values);
		assertArrayEquals(new int[]{-8,0,1,23,43,62,99,201}, values);
	}
	
	

}
