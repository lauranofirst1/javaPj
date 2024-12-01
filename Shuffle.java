package pk11;
import java.util.*;
public class Shuffle {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		System.out.println(list);

	}

}
