class methodinjava{
	public void non_static(){
		System.out.println("Non-static method invoked");
	}
	public static void staticmethod(){
		System.out.println("Static method invoked ");
	}
	public static void main(String srgs[]){
		// calling static method without creatign object of the class
		staticmethod();
		// calling non-static method with object of the class
		methodinjava ns=new methodinjava();
		ns.non_static();

	}
}