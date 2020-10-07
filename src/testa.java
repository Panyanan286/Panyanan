import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;


public class testa {
	public static void q(){
		ArrayList<Integer> a =new ArrayList();
		a.add(20);
		a.add(50);
		a.add(70);
		a.add(60);
		a.add(50);
		a.add(50);
		a.add(90);
		a.add(80);
		a.add(60);
		a.add(50);
		int max = a.get(0);
		int min = a.get(0);
		int i =0;
		for(i=0;i<5;i++){
			if(max < a.get(i))
				max = a.get(i);
			if(min > a.get(i))
				min = a.get(i);
			
		}
		System.out.println(min);
		System.out.println(max);
		
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		
		
	}

}
