class basicstring{
	public static void main(String args[]){
		// String equals
		String s1="hello";
		String s2="hi";
		String s3="hello";
		System.out.println("Equals to method");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		//String compare
		System.out.println("Compare to method");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		// String endswith
		System.out.println("Ends With method");
		System.out.println(s1.endsWith("o"));
		System.out.println(s2.endsWith("i"));
		System.out.println(s3.endsWith("r"));	
		// String index of
		String s4="My name is senthil";
		int index1=s4.indexOf("is");
		int index2=s4.indexOf("senthil");
		System.out.println(index1+ " "+index2);
		// String replaceall
		String s5="My name is senthil,my father name is sankar";
		String s6=s5.replaceAll("is","was");
		System.out.println(s6);
		// String split
		String s7="Learn Java Quickly";
		String[] arr=s7.split("\\s",3);
		for ( String s8:arr ) {
			System.out.println(s8);
		}
		// String remove space
		String s9="  hi  senthil ";
		System.out.println(s9+"How are you?");
		System.out.println(s9.trim()+" How are you?");
		// Converting string to lower and upper case
		String s10="MY NAME IS SENTHIL";
		String s11="my name is senthil";
		System.out.println(s10.toLowerCase());
		System.out.println(s11.toUpperCase());
	}
}