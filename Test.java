package Cast;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Father f = new Father();
//		Son s = new Son();
//		
//		f.say();
//		s.say();

		
		
		// child convert to child
		// we can always do this and also without any explicit convert
//		Son s = new Son();
//		Father f = s;
//		// here we call the instance method
//		f.say();
//		s.say();
		
		
		
		// This will gives the error.
//		Father f = new Father();
//		Son s = f;
		
		
		
		// This will not give the error
		// But if you run it, it will throw ClassCastException
		// Coz f is a father instance not a son instance
//		Father f = new Father();
//		Son s = (Son) f;
//		s.say();
		
		
		
		// This is fine
		// Though f is like a father type, actually it's a son instance
//		Father f = new Son();
//		Son s = (Son)f;
//		s.say();
		
		
		
		// This is a little different coz it's static method
		Son s = new Son();
		Father f = s;
		f.say2();
		
	}

}
