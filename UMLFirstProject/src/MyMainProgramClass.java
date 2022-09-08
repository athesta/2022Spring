
public class MyMainProgramClass {

	public static void main(String[] args) {
		//finals cannot be changed, so will error in both scenarios
				
		//MyClass.One = 10; //one is instance member & final
		//MyClass.two = 10; //two is instance member
		//MyClass.three = 10; //three is final
		MyClass.four = 10;
		MyClass.five(2, 3);
		//MyClass.six(2,3); //six is instance member
		
		MyClass a = new MyClass(); //a is an instance or object of MyClass
		//a.One = 10;//error because One is final
		a.two=10;
		//a.three = 10;//Three is final
		//a.four = 10; //Four is static, used w/ class name
		//a.five(2, 3); //Five is static member, used w/ class name
		a.six(2,3); 
				
		
	}

}
