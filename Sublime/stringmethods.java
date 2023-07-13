class stringmethods{
	public static void main(String args[]){
		String lang ="Java Programming";

		// Finding String length
		int string_length=lang.length();
		System.out.println("The length of given string is: "+string_length);

		// Replacing String
		String replace=lang.replace("Java","C++");
		System.out.println("Original String is:");
		System.out.println(lang);
		System.out.println("Replaced String is:");
		System.out.println(replace);

		// String Concatenation
		String concat_str=lang.concat("  is interesting.");
		System.out.println("Concatenated String is:"+concat_str);

	}
}