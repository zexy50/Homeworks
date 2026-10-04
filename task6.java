public class task6 {
    public static void main(String[] args) {
        String s = args[0];
        boolean palind = true;

        for (int i = 0; i < s.length()/2; i++) {
            int j = s.length()-1-i;
            char a1 = s.charAt(i);
            char a2 = s.charAt(j);

            if (a1 != a2) {
                palind=false;
                break;
            }
        }

        System.out.println(palind);
    }
}