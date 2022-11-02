import org.elasticsearch.client.security.user.User;

import java.io.*;
import java.util.List;
import java.util.Scanner;


public class handleCSV {

    public static void main(String[] args) throws Exception {

        String filePath = "E:\\Files\\Incoming\\Customer.txt";
        String filePathPipe = "E:\\Files\\Incoming\\pipeDelimted.txt";

        //Read CSV using Scanner
        System.out.println("Output of method: usingSanner ----------------- ");
        usingScanner(filePath);

        //Read CSV using Buffer Reader
        System.out.println('\n'+ "Output of method: usingBueffer ----------------- ");
        usingBuffer(filePath);

        //Read Pipe Delimited File
        System.out.println('\n'+ "Output of method: usingBufferPipe ----------------- ");
        usingBufferPipe(filePathPipe);

        //Read CSV in an array
        System.out.println('\n'+ "Output of method: usingBufferArray ----------------- ");
        usingBufferArray(filePath);


    }

    /***************************************************************
     USING SCANNER METHOD
     ***************************************************************/
    private static void usingScanner(String filePath) throws Exception {

        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNext()) {
            System.out.println(scanner.next().toString());

        }
    }

    /***************************************************************
     USING BUFFER METHOD
     ***************************************************************/

    private static void usingBuffer(String filePath) throws Exception {

        String line = null;

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();

            while (((line = br.readLine()) != null)) {
                System.out.println(line);
            }
        }

    /***************************************************************
     READ PIPE DELIMITED FILE
     ***************************************************************/

    private static void usingBufferPipe (String filePath) throws Exception {

        String line = null;
        String delimiter = "|";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        br.readLine();

        while (((line = br.readLine()) != null)) {
            String values = String.valueOf(line.split(delimiter));
            System.out.println(line);
        }

    }

    /***************************************************************
     READ CSV IN AN ARRAY
     ***************************************************************/
    private static void usingBufferArray (String filePath) throws Exception {

        String line = null;
        String delimiter = ",";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        br.readLine();

        while (((line = br.readLine()) != null)) {
            String[] values = line.split(delimiter);
            System.out.println(values[0]);
        }
    }

    /***************************************************************
     READ CSV IN AN ARRAY AND MAP TO POJO (Pending)
     ***************************************************************/


}





