package Example;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1= "ABC";
        String str2= "CAMB";

        boolean result = true;
        if(str1.length() != str2.length()) {
            result = false;
        }else {
            char[] chararr1 = str1.toLowerCase().toCharArray();
            char[] chararr2 = str2.toLowerCase().toCharArray();

            Arrays.sort(chararr1);
            Arrays.sort(chararr2);

            result=Arrays.equals(chararr1, chararr2);
        }


        if(result){
                System.out.println("Both string are anagram");
            }else {
                System.out.println("Both string are not anagram");
            }
        }
    }

