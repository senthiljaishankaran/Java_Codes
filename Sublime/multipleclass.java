class multipleclass{
	multipleclass(){
		System.out.println("Constructor of multipleclass");
	}
	public void multipleclass_method(){
		System.out.println("Invoked multipleclass method");
	}
	public static void main(String args[]){
		multipleclass mc=new multipleclass();
		mc.multipleclass_method();
		sub_class sc=new sub_class();
		sc.sub_class_method();
	}
}
class sub_class{
	sub_class(){
		System.out.println("Constructor of Sub_class invoked");
	}
	public void sub_class_method(){
		System.out.println("sub_class_method invoked");
	}
}