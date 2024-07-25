package compilador17_25;

class compi20 {

	public static void main(String[] args) {
		int i, j, fib;

		i = 0;
		j = 0;
		fib = 1;
		while (fib < 1000) {
			System.out.println(fib);
			i = j;
			j = fib;
			fib = i + j;
		}
	}

}
