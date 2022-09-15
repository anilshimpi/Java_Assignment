package com.yash.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<City> cs=Arrays.asList(
				new City(1, "Wall Rose", new State(101, "Marley"), 9.5f, 500000, 493),
				new City(2, "Wall Maria", new State(101, "Goku"), 7.7f, 400000, 393),
				new City(3, "Wall Shina", new State(102, "Paradise"), 5.8f, 350000, 450),
				new City(4, "Shiganshina", new State(102, "bankai"), 8f, 650000, 350),
				new City(5, "Kyoto", new State(103, "Kamehameha"), 6f, 450000, 500),
				new City(6, "Vegeta", new State(103, "Rasengan"), 8.6f, 600000, 300)
				);
		
		System.out.println("find city with less area and highest population");
		List<City> value=cs.stream().sorted(Comparator.comparing(City::getPopulation).thenComparing(City::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
		System.out.println(value);
		
		System.out.println("find city with high population index and high city area");
		List<City> value1=cs.stream().sorted(Comparator.comparing(City::getPollutionIndex).thenComparing(City::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
		System.out.println(value1);
		
		System.out.println("print city with less population index first");
		List<City> value2=cs.stream().sorted(Comparator.comparing(City::getPollutionIndex)).collect(Collectors.toList());
		System.out.println(value2);
		
		System.out.println("print city with lowest population index and lowest area");
		List<City> value3=cs.stream().sorted(Comparator.comparing(City::getPollutionIndex).thenComparing(City::getArea_of_city)).limit(1).collect(Collectors.toList());
		System.out.println(value3);
		
		System.out.println("count how many city in state");
		long count=cs.stream().map(City::getCityname).count();
		System.out.println(count);
		
		System.out.println("total area of each state");
		long sum=cs.stream().collect(Collectors.summingLong(City::getArea_of_city));
		System.out.println(sum);
	}

}
