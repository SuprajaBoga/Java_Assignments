package Assignment_1;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Assignment_1
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        File file=new File("/home");
        Map<String,String> hm=new HashMap<String,String>();
        getfiles(file,hm);
        while(true)
        {
            System.out.println("Enter regular expression:");
            String regex=sc.next();
            try
            {
                Pattern pattern=Pattern.compile(regex);
                hm.forEach((filename,filepath)->
                {
                    if(pattern.matcher((String)filename).find())
                    {
                        System.out.println("File name: "+filename+"		Path: "+filepath);
                    }
                });
            }
            catch(PatternSyntaxException e)
            {
                System.out.println("Given regular expression is incorrect");
            }
        }
    }
    static void getfiles(File file,Map hm)
    {
        if(file==null)
            return;
        if(file.isFile())
        {
            hm.put(file.getName(),file.getAbsolutePath());
            return;
        }
        File[] obj=file.listFiles();  //all files in given directory
        if(obj!=null)
        {
            for(File files:obj)
                getfiles(files,hm);
        }
    }
}
