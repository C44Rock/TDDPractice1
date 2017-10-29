package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPotter {

	public double getCost(int[] books) {
		
		List<Integer> varyingBooks = new ArrayList<Integer>();
		for (int book : books) {
			varyingBooks.add(book);
		}
		double cost = 0;
		
		while (varyingBooks.size() > 0) {
			if (varyingBooks.size() == 5) {
				cost += 30;
			} else if (varyingBooks.size() == 4) {
				cost += 25.6;
			} else if (varyingBooks.size() == 3) {
				cost += 21.6;
			} else if (varyingBooks.size() == 2) {
				cost += 15.2;
			} else {
				cost += 8;
			}
			
			for (int i = 0; i < varyingBooks.size(); i++) {
				int minus = varyingBooks.get(i) - 1;
				
				if (varyingBooks.get(i) == 1) {
					varyingBooks.remove(i);
					i--;
				} else {
					varyingBooks.remove(i);
					varyingBooks.add(i, minus);
				}
			}
		}
		
		return cost;
 
	}

}
