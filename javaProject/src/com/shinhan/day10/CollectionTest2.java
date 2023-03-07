package com.shinhan.day10;

import java.util.*;
import java.util.Map.Entry;

import com.shinhan.day04.Employee;
import com.shinhan.day05.Account;

public class CollectionTest2 {

	public static void main(String[] args) {
		f14();
		String[] arr = {"A", "B","C"};
		Integer[] arr2 = {100,99,88};
		List<String> data = Arrays.asList(arr);
		List<Integer> data2 = Arrays.asList(arr2);
	}
	
	private static void f14() {
		Set<Fruit> data = new HashSet<>();
		data.add(new Fruit("귤1", 100));
		data.add(new Fruit("귤2", 100));
		data.add(new Fruit("귤3", 100));
		data.add(new Fruit("귤4", 100));
		data.add(new Fruit("귤5", 100));
		
		Set<Fruit> data2 = Set.copyOf(data);
		//불가 data2.add(new Fruit("사과",200));
		for(Fruit f:data2) {
			System.out.println(f);
		}
	}

	private static void f13() {
		Map<String, Integer> data = Map.of("김",100,"양",90,"박",80);  //키가 중복되면 에러
//		data.put("a", 60); //수정 불가
		for(String key:data.keySet()) {
			System.out.println(key+"==="+ data.get(key));
		}
	}

	private static void f12() {
		//수정불가한Collection
		Set<Integer> listData = Set.of(100, 88, 99, 55, 80);  //값 중복 불가
//		listData.add(11);  //추가 불가
		for(Integer a:listData) {
			System.out.println(a);
		}
	}

	private static void f11() {
		//수정불가한 Collection
		int[] arr = new int[] {100, 88, 99, 55, 80};
		List<Integer> listData = List.of(100, 88, 99, 55, 80);
//		List<int[]> listData2 = Arrays.asList(arr);
//		listData.add(9999);  //ImmutableCollections 수정불가
		for(Integer a:listData) {
			System.out.println(a);
		}
		
	}

	private static void f10() {
		//Queue (FIFO)
		Queue<Fruit> data = new LinkedList<>();
		data.offer(new Fruit("귤5", 20000));
		data.offer(new Fruit("귤1", 40000));
		data.offer(new Fruit("귤4", 10000));
		data.offer(new Fruit("귤2", 50000));
		data.offer(new Fruit("귤3", 30000));
		
		while(!data.isEmpty()) {
			Fruit f = data.poll();
			System.out.println(f);
		}
	}
	
	private static void f9() {
		//Stack (LIFO)
		Stack<Fruit> data = new Stack<>();
		data.push(new Fruit("귤5", 20000));
		data.push(new Fruit("귤1", 40000));
		data.push(new Fruit("귤4", 10000));
		data.push(new Fruit("귤2", 50000));
		data.push(new Fruit("귤3", 30000));
		
		while(!data.isEmpty()) {
			Fruit f = data.pop();
			System.out.println(f);
		}
	}

	private static void f8() {
		//Map : HashMap, TreeMap
		TreeMap<String, Fruit> data = new TreeMap<>();
		data.put("S",new Fruit("귤", 10000));
		data.put("A",new Fruit("사과", 20000));
		data.put("B",new Fruit("오렌지", 50000));
		data.put("A",new Fruit("귤", 20000));
		data.put("B",new Fruit("귤", 30000));
		
		for(Entry<String, Fruit> entry:data.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("----------------------------------");
		}
		
		System.out.println("<<<<<<<<<<<desc>>>>>>>>>>>>>>>");
		NavigableMap<String, Fruit> data2 = data.descendingMap();
		for(Entry<String, Fruit> entry:data2.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("----------------------------------");
		}
	}
	
	private static void f7() {
		Set<Fruit> data = new HashSet<>();
		data.add(new Fruit("귤", 10000));
		data.add(new Fruit("사과", 20000));
		data.add(new Fruit("오렌지", 50000));
		data.add(new Fruit("귤", 20000));
		data.add(new Fruit("귤", 30000));
		
		for(Fruit fruit:data) {
			System.out.println(fruit);
		}
	}

	private static void f6() {
		Set<Board> data = new TreeSet<>();
		data.add(new Board(1, "회식", "술마셔도되나요?","jin"));
		data.add(new Board(2, "자율학습", "저녁개방","jin"));
		data.add(new Board(3, "아침", "빨리와~","jin"));
		data.add(new Board(4, "회식", "술마셔도되나요?","jin"));
		data.add(new Board(5, "회식", "술마셔도되나요?","jin"));
		
		for(Board board:data) {
			System.out.println(board);
		}
	}

	private static void f5() {
		//default: key로 sort된다. 
		TreeMap<String, Integer> data = new TreeMap<>();
		data.put("홍길동5", 88);
		data.put("홍길동1", 99);
		data.put("홍길동4", 66);
		data.put("홍길동3", 77);
		data.put("홍길동3", 100);  //같은 키가 있으면 값을 replace
		
		for(String key:data.keySet()) {
			System.out.println(key + "==>" + data.get(key));
		}
		
		System.out.println("firstKey :"+data.firstKey());
		System.out.println("firstKey의 값 :"+data.get(data.firstKey()));
		System.out.println("lastEntry :"+data.lastEntry());
		System.out.println("lowerEntry :"+data.lowerEntry("홍길동4"));
		
		NavigableMap<String, Integer> data2 = data.descendingMap();
		for(String key: data2.keySet()) {
			System.out.println(key+"==>"+data2.get(key));
		}
		
	}

	private static void f4() {
		TreeSet<Integer> scoreSet = new TreeSet<>();  //TreeSet은 sort해줌
		scoreSet.add(100);
		scoreSet.add(20);
		scoreSet.add(50);
		scoreSet.add(80);
		scoreSet.add(80);
		
		for(Integer jumsu:scoreSet) {
			System.out.println(jumsu);
		}
		System.out.println("first : "+scoreSet.first());
		System.out.println("last : "+scoreSet.last());
		System.out.println("higher : >"+scoreSet.higher(50));
		System.out.println("lower : <"+scoreSet.lower(50));
		System.out.println("ceiling : >= "+scoreSet.ceiling(50));
		System.out.println("floor : <="+scoreSet.floor(50));
		
		System.out.println("=======tailSet:>= ==========");
		SortedSet<Integer> data = scoreSet.tailSet(50);
		for(Integer i:data) {
			System.out.println(i);
		}
		
		System.out.println("=======headSet:<= ==========");
		SortedSet<Integer> data2 = scoreSet.headSet(50,true);  //true : 나도 포함
		for(Integer i:data2) {
			System.out.println(i);
		}
	}

	//List : 순서있음, 중복가능 ArrayList, Vector, LinkedList
	//Set : 순서없음, 중복불가
	//Map : 키와 값의 쌍
	//HashSet : hashcode(), equals()로 동등비교, 동등하면 add불가
	//TreeSet : compareTo()로 크기비교
	private static void f3() {
		Set<Employee> data = new TreeSet<>();
		data.add(new Employee("직원1","사원",1000));
		data.add(new Employee("직원1","사원",1000));
		data.add(new Employee("직원5","대리",2000));
		data.add(new Employee("직원6","과장",3000));
		data.add(new Employee("직원3","사장",4000));
		
		for(Employee s: data) {
			System.out.println(s);
		}
	}

	private static void f2() {
		Set<Account> data = new TreeSet<>();
		data.add(new Account("123","홍5",1000));
		data.add(new Account("124","홍1",1000));
		data.add(new Account("126","홍3",2000));
		data.add(new Account("125","홍2",3000));
		data.add(new Account("123","홍5",1000));  //이미 존재하므로 add안됨
		
		for(Account s: data) {
			System.out.println(s);
		}
	}
	
	private static void f1() {
		Set<String> data = new TreeSet<>();
		data.add("월1");
		data.add("월5");
		data.add("월5");  //같은 값이 있으므로 add되지 않음
		data.add("월2");
		data.add("월4");
		
		for(String s: data) {
			System.out.println(s);
		}
	}

}
