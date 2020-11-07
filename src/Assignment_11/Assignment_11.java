package Assignment_11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment_11
{
    public static void main(String[] args) throws IOException
    {
        String path = "/home/supraja/Desktop/";
        String filename = path + args[0];
        File file = new File(filename);
        BufferedReader br=new BufferedReader(new FileReader(file));
        Map<Character, Integer> characterscount= new HashMap<Character, Integer>();
        String line;
        while((line=br.readLine())!=null)
        {
            for(int i=0;i<line.length();i++)
            {
                if(Character.isLetter(line.charAt(i)))
                {
                    if (characterscount.containsKey(line.charAt(i)))
                        characterscount.put(line.charAt(i), characterscount.get(line.charAt(i)) + 1);
                    else
                        characterscount.put(line.charAt(i), 1);
                }
            }
        }

        FileWriter filewriter = new FileWriter("/home/supraja/Desktop/xyz.txt");
        for(Character ch:characterscount.keySet())
        {
            String character=ch+" : "+characterscount.get(ch);
            filewriter.write(character+"\n");
        }
        filewriter.close();
        System.out.println("done");
    }
}
