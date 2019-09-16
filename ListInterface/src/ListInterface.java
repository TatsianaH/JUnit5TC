import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<String> names = new ArrayList();// 2 варианта задания list
		var names2 = new ArrayList<String>();
		
		names.add("Ann");
		names.add("Cindy");
		System.out.println(names);
		
		names.add(1, "Bob");// задаем индекс вставляемого элемента и добавлем его между другими элементами, 
		System.out.println(names);
	
		names.remove(0);//удаление элеиента
		names.set(0, "Donald");// здесь заменяем элемент 
		String name1 = names.get(1);// получаем элемент
		
		System.out.println(names);
		System.out.println(name1);
		
		int size = names.size();// length of listarray
		System.out.println("Size: " + size);
		
		names.forEach(name -> System.out.println(name));// вывод элементов массива поочередно
		for(String name: names)// тоже самое
			System.out.println(name);
		
	}

}
