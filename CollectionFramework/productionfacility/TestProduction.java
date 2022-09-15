package CollectionFramework.productionfacility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestProduction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProductionFacility> l = new ArrayList<>();
		l.add(new ProductionFacility(101, "abc", "pune", 4000, new String[] { "parle", "britania", "sunfist" },
				LocalDate.of(2022, 4, 24)));
		l.add(new ProductionFacility(102, "xyz", "hydrabad", 5000, new String[] { "kurkure", "lays", "sunfist" },
				LocalDate.of(2021, 6, 12)));
		l.add(new ProductionFacility(103, "lmn", "mumbai", 6500, new String[] { "godreg", "samsung", "onida" },
				LocalDate.of(2020, 9, 29)));
		l.add(new ProductionFacility(104, "def", "nagpur", 3400, new String[] { "lenovo", "apple", "dell" },
				LocalDate.of(2022, 10, 12)));
		l.add(new ProductionFacility(105, "pqr", "indor", 7500, new String[] { "oneplus", "samsung", "apple" },
				LocalDate.of(2019, 12, 4)));

		Collections.sort(l);
		System.out.println(l);

		Collections.sort(l, new ProductionFacilityOnDate());
		System.out.println(l);

		Collections.sort(l, new ProductionFacilityOnItem());
		System.out.println(l.subList(0, 1));
		
	}

}
