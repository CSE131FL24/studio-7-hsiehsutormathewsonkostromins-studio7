package studio7;

public class Dice {

		private int sides;
		
		public Dice (int n){
			sides = n;
		}
		
		public int roll () {
			return (int)(Math.random()*sides) + 1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice one = new Dice(6);
		
		System.out.println(one.roll());
	}

}
