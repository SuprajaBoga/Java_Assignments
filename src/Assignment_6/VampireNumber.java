package Assignment_6;

import java.util.HashSet;
import java.util.Set;
public class VampireNumber
{
    public static void main(String args[])
    {
        VampireNumber vampireNumber = new VampireNumber();
        vampireNumber.printVampireNumbers();
    }
    public boolean isVampire(long number)
    {
        String numberString=String.valueOf(number);
        int length = numberString.length();
        if(length%2!=0)
        {
            return false;
        }

        Set<String> hash_Set = new HashSet<>();
        String res="";
        findPermutations(numberString,res,hash_Set);
        for(String permutationString:hash_Set)
        {

            String fang1=permutationString.substring(0,length/2);
            long firstHalf=Long.parseLong(fang1);
            String fang2=permutationString.substring(length/2);
            long secondHalf=Long.parseLong(fang2);
            if(fang1.charAt(fang1.length()-1)=='0' && fang2.charAt(fang2.length()-1)=='0')
            {
                return false;
            }

            if(firstHalf * secondHalf == number)
            {
                return true;
            }

        }
        return false;
    }

    public void printVampireNumbers(){

        long start=10;
        int count=1;
        System.out.println("First 100 Vampire numbers are:");
        while(count<=100){
            if(isVampire(start)){
                System.out.println(start);
                count++;
            }

            start++;
        }
    }
    void findPermutations(String str, String ans,Set<String> hash_Set)
    {
        if (str.length() == 0) {
            hash_Set.add(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            findPermutations(ros, ans + ch,hash_Set);
        }
    }

}