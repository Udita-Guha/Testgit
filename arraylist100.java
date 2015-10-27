import java.util.ArrayList;
import java.util.Iterator;


public class arraylist100 {
	
	static int i;

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList();
		for(i=1;i<=100;i++){
		arraylist.add(i);
		}
		Iterator itr=arraylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}


}
