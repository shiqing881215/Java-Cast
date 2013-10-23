package Cast;

public class Son extends Father {

	@Override
	public void say() {
		System.out.println("Son");
	}

	// Static methods cannot be override
	public static void say2(){
		System.out.println("Father2.");
	}

}
