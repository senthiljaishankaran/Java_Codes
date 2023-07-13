class foreach{
	public static void main(String args[]){
		int primes[]={2,3,5,7,11,13,17,19,23,29};
		String lang[]={"c","c++","java","python"};
		System.out.println("Printing Primes");
		for(int t: primes){
			System.out.println(t);
		}
		System.out.println("Printing lang");
		for (String str :lang ) {
			System.out.println(str);	
		}
	}
}