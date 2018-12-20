package es.ull.etsii.ldh.p6tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.ull.etsii.ldh.p6.Quicksort;

class Tests {
	
	private Quicksort qs;
	private int[] values;
	
	@BeforeAll	
	public void setData() {
		qs = new Quicksort();
		values = new int[] {99,1,201,43,62,0,23,-8};
		qs.sort(values);
	}

	@Test
	void test() {		
		//assertArrayEquals(new int[]{-8,0,1,23,43,62,99,201}, values);
	}
	
	

}
