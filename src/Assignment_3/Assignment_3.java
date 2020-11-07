package Assignment_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_3
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a host address:");
        String host = bufferedReader.readLine();
        System.out.println(findMedian(host));
    }

    public static Float findMedian(String host) throws IOException
    {
        Runtime runtime = Runtime.getRuntime();      //create runtime object
        String pingCommand = "ping " + host + " -c 6";
        Float median=0.0f;

        Process process = runtime.exec(pingCommand);        //executes ping command

        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String output;
        List<Float> packet = new ArrayList<Float>();
        while ((output = input.readLine()) != null)
        {
            System.out.println(output);
            int timeIndex = output.indexOf("time=");
            if (timeIndex != -1)
            {
                packet.add(Float.parseFloat(output.substring(timeIndex + 5, output.lastIndexOf("ms") - 1)));
            }
        }
        int size = packet.size();
        if (size == 0)
        {
            System.out.println("Given host address does not exist or unreachable");
            System.exit(0);
        }
        Collections.sort(packet);
        if (size % 2 == 0)
            median= ((Float) packet.get(size / 2) + (Float) packet.get(size / 2 - 1)) / 2;
        else
            median = (Float) packet.get(size / 2);
        return median;
    }
}
