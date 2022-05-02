package Ouestion1;

import java.util.Arrays;

public class MainSSLL {

	public static void main(String[] args) {

		SinglySortedLL ssllobj = new SinglySortedLL();
		
		System.out.println(ssllobj.IsEmpty());
		
		ssllobj.InsertInList(10);
		ssllobj.InsertInList(1);
		ssllobj.InsertInList(5);
		ssllobj.InsertInList(100);

		System.out.println(Arrays.toString(ssllobj.GetElement()));
		System.out.println(ssllobj.IsEmpty());

		
System.out.println(ssllobj.Search(10));
// System.out.println(Arrays.toString(ssllobj.GetElement()));
//		
//		ssllobj.Delete(5);
//		System.out.println(Arrays.toString(ssllobj.GetElement()));
//		ssllobj.Delete(1);
//		System.out.println(Arrays.toString(ssllobj.GetElement()));
//
//		ssllobj.Delete(10);
//		System.out.println(Arrays.toString(ssllobj.GetElement()));


	}

}
