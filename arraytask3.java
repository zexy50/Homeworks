public class arraytask3 {
	public static void main(String[] args){
		int[] s = new int[args.length];
		for (int i = 0;i<s.length;i++){
			s[i] = Integer.parseInt(args[i]);

			}

		int max = s[0];
		for (int i = 0;i<s.length;i++){
			
			if (s[i]>max){
				max = s[i];
			}
		}

		System.out.println(max);
	}
}