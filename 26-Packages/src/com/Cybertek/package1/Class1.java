package com.Cybertek.package1;
//or import com.Cybertek.package2.*
//We can't have 2 imports that have * endings
import com.Cybertek.package2.Class2;
import com.Cybertek.package2.Class3;

public class Class1 {

	public static void main(String[] args) {
		
		//There are 3 ways to access package from outside the package:
		
		//1-import package.*
		//import com.Cybertek.package2.*
		
		//2-import package.className
		//import com.Cybertek.package2.Class2
		
		Class2 cl = new Class2();
		Class3 cl1 = new Class3();
		
		
		//3-fully qualified name (if you are not importing it use)
		com.Cybertek.package2.Class2 cl2 = new com.Cybertek.package2.Class2();
		
	}

}
