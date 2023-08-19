package Example;

public class CharCount {

    public static void main(String[] args) {
        String str="aabbcccddd";

        int[] count = new int[(int) Character.MAX_VALUE];

        for(int i=0;i<str.length();i++){
            char charAt = str.charAt(i);
            count[(int) charAt]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0)

                System.out.print(""+ count[i] + (char) i + "");
        }
    }
}
