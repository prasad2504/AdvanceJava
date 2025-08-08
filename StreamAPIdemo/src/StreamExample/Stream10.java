package StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream10 {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(60);
		
		Optional<Integer> k = list.stream().reduce((i,j)->i+j);
		System.out.println(k);
	}

}
