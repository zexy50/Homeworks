public class arraytask5 {
	public static void main(String[] args) {
		int[] s = new int[args.length];
		for (int i = 0; i < s.length; i++){
			s[i] = Integer.parseInt(args[i]);
			if (s[i] < 0){
				s[i] = 0;
			}
		}
		for (int i = 0 ; i < s.length;i++){
			System.out.println(s[i]);
		}
	}
}