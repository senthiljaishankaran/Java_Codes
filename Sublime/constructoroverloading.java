class constructoroverloading{
	String name;
	constructoroverloading(){
		System.out.println("Constructor method called");
	}
	constructoroverloading (String name){
		this.name=name;
	}
	void setname(String name){
		this.name=name;
	}

	void getname(){
		System.out.println("Lang is:  "+name);
	}
	public static void main(String args[]){
		constructoroverloading cpp=new constructoroverloading();
		constructoroverloading java=new constructoroverloading("Java");
		cpp.setname("C++");
		cpp.getname();
		java.getname();
	}
}