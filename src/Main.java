import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input size of array: ");
		int size = sc.nextInt();
		Integer  [] arr = new Integer[size];
		for(int i=0;i<size;i++) {
			System.out.print("arr["+i+"]: ");
			arr[i] = sc.nextInt();
		}
		int number = 0;
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(0)) {
				list.remove(i);
				number++;
				i--;
			}
		}
		for(int i=0;i<number;i++) {
			list.add(0);
		}
		System.out.print(list.toString());
	}
}
