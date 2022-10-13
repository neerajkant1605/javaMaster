import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class readPipeDelimitedText {

    public static void main(String[] args) throws Exception {

        String filePath = ("E:\\Files\\Incoming\\pipeDelimted.txt");


        File file = new File(filePath);

        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader((fileReader));
        br.readLine();
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] values = line.split("\\|");

            System.out.println(values[0]);
            System.out.println(values[1]);
            System.out.println(values[2]);
            System.out.println(values[3]);
        }
        br.close();

    }
}

