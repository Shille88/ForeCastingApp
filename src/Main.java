
public class Main {
	
	static int[] year = new int[6];
	static int years;
	

	public Main() {
	}
	
	public static void main(String[] args) {
		
		year[0] = 618385;
		year[1] = 491956;
		year[2] = 371631;
		year[3] = 389200;
		year[4] = 359598;
		year[5] = 313410;
		
		years = year.length;
		int displayYear = 2016;

		double j = 0;
		
		for(int i=0; i<years-1; i++){
			double current = (double) (year[i] - year[i+1])/year[i+1];
			displayYear = displayYear-1;
			System.out.println(displayYear+" = "+current);
			j = j + (double) (year[i] - year[i+1])/year[i+1];
		}
		j=j/years;
		System.out.println("Average = "+j);
	}
}
