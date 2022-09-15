package com.yash.task1;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item itm1 = new Item(100, "Mjolnir", LocalDateTime.of(2022, Month.JANUARY, 1, 22, 20),
				LocalDateTime.of(2023, Month.JANUARY, 1, 22, 20), 1000);

		Item itm2 = new Item(101, "Stormbreaker", LocalDateTime.of(2022, Month.FEBRUARY, 1, 10, 20),
				LocalDateTime.of(2023, Month.FEBRUARY, 1, 10, 20), 500);
		Item itm3 = new Item(102, "shield", LocalDateTime.of(2022, Month.MARCH, 1, 22, 20),
				LocalDateTime.of(2023, Month.APRIL, 1, 22, 20), 1200);
		Item itm4 = new Item(103, "arc reactor", LocalDateTime.of(2022, Month.JANUARY, 2, 10, 20),
				LocalDateTime.of(2023, Month.FEBRUARY, 1, 0, 0), 500);

		ArrayList<Item> AL = new ArrayList<>();
		AL.add(itm1);
		AL.add(itm2);
		AL.add(itm3);
		AL.add(itm4);

		System.out.println(AL);

		Item maxprice = AL.stream().max(Comparator.comparing(Item::getPrice)).get();

		System.out.println("highestPrice:" + maxprice);

		Item Lowprice = AL.stream().min(Comparator.comparing(Item::getPrice)).get();

		System.out.println("LowestPrice:" + Lowprice);

		// Remove Duplicate Price
		List<Item> removeDuplicateprice = AL.stream().distinct().collect(Collectors.toList());

		System.out.println("new list:" + removeDuplicateprice);
	}

}
