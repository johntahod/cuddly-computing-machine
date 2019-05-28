
public class Euclid {


	//using recursion
	public static int findGCD(int n, int m) {

		if (m == 0) return n;
		else return findGCD(m, n % m);
	}




	//non-recursive method//function
	public static int findGCD2(int n, int m ) {
		while (m != 0) {
			int remainder = m;
			m = n % m;
			n = remainder;
		}
		return n;
	}


	//	




	public static void sieveOfEratosthenes(int n){ 

		int prime[] = new int[n+1]; 
		for(int i=0;i<n;i++) 
			prime[i] = 1; 

		for(int p = 2; p*p <=n; p++) 
		{ 
			// If prime[p] is not changed, then it is a prime 
			if(prime[p] == 1) 
			{ 
				// Update all multiples of p 
				for(int i = p*p; i <= n; i += p) 
					prime[i] = 0; 
			} 
		} 

		// Print all prime numbers 
		for(int i = 2; i <= n; i++) 
		{ 
			if(prime[i] == 1) 
				System.out.print(i + " "); 
		} 
	} 


	// count of prime numbers 

	// count of prime numbers 

	public static void nonSieveApproachPrime(int n ) {

		System.out.println("\nprimes not exceeding N: ");

		for(int i=1;i<=n;++i){

			if(isPrime(i))

				System.out.print(i + " ");

		}
	}


	public static void primeN(int n) {

		int count =0;
		int k=0;


		System.out.println("n primes are: ");

		while(true){

			if(count > 0 && isPrime(count)){

				System.out.print(count + " ");

				++k;
			}

			if(k==n)
				break;
			++count;
		}
	}
	public static boolean isPrime(int n){ // check if N is prime

		boolean prime = true; //default

		if(n==1)return false; //not a prime

		for(int i=2;i<n-1;i++){

			if(n% i == 0){

				prime = false;

				break;

			}
		}

		return prime;
	}





	//better or worse ?

	public static void primefactors(int n) {
		int countPow = 0; // print the number of 2s divide in

		while (n % 2 == 0 ) {
			countPow++;
			n = n / 2;
		}

		if (countPow >= 1) {
			System.out.print("2^" + countPow);
		}
		int count = 0;
		for (int i = 3; i <= Math.sqrt(n); i = i + 1) {

			int count2 = 0;
			while (n % i == 0) {
				count2++;
				n = n / i;
			}

			if (count2 >= 1) {
				if((count == 0 && countPow >=1) || count > 0) {
					System.out.print("*" + i + "^" + count2);
				} else {
					System.out.print(i + "^" + count2);
				}

				count++;
			}

		}

		if(n > 2)
			System.out.println("  "+ n+ " ^1");


	}





	public static void main(String[] args) {
		//		System.out.println(findGCD(5,15));
		//		System.out.println(findGCD2(5,15));


		int n = 108;
		//Question 1
		System.out.println("Numbers of Primes of  "+ n);
//
		primeN(n);
		System.out.println();
////		
		//Question 2
		System.out.println("Prime Numbers up to N  : " + n);
//
		sieveOfEratosthenes(n);	
//		System.out.println();
//
//		//Question 3
		System.out.println("Prime Factoring of : "+ n);

		primefactors(n);
		System.out.println();


	}

}
