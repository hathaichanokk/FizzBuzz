import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
	}
	public String getString(int kb) {
		if((kb %3 == 0)&(kb %5 == 0)) {
			return FizzBuzzs();
		}
		else if(kb % 3==0){
			return Fizz();
		}else if(kb % 5==0){
			return Buzz();
		}else {
			return Integer.toString(kb);
		}
		
	}
	public String Fizz() {
		return "Fizz";
	}
	public String Buzz() {
		return "Buzz";
	}
	public String FizzBuzzs() {
		return "FizzBuzz";
	}
	
}
