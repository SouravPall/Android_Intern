
public class OddEvenWithoutMod {
	public static void main(String[] args) {
		for(int i =0;i<10;i++) {
			if(!((i&1)==0)) {
				System.out.println("Odd:" + i);
			}
		}
	}
}
