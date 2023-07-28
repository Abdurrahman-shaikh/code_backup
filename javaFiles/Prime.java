class Prime{
	void chckPrime(int num){
		if(num%2==0 || num%3==0){
		System.out.println("Not a prime number");
		}else{
		System.out.println("Prime number");
		}
	}
	public static void main(String args[]){
	Prime pm = new Prime();
	pm.chckPrime(6);
	}
}
