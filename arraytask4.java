public class arraytask4 {
	public static void main(String[] args){
		int[] s = new int[args.length];
		int sum = 0;
		for (int i = 0;i<s.length;i++) {
			s[i] = Integer.parseInt(args[i]);
			if (s[i] %2 ==0){
				sum+=1;
			}
		}
		System.out.println(sum);
	}
}