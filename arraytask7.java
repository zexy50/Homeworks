public class arraytask7{
    public static void main(String[] args) {

        int[] s = new int[args.length];
        for (int i =0; i< s.length; i++) {
            s[i] = Integer.parseInt(args[i]);
        }

       for (int i =0; i <s.length / 2; i++) {
            int j = s.length-1 -i;

            int t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
        for (int i = 0; i < s.length; i++){
        	System.out.println(s[i]);
        }

    }
}