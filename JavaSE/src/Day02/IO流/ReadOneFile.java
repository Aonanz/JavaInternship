package Day02.IO流;

import java.io.*;

public class ReadOneFile {
    public static String readContents(File file){

        StringBuilder res = new StringBuilder();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            while(br.ready()){
                //这里可以作相关的处理过程 #todo your code#
                res.append(br.readLine() + "\n");
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res.toString();
    }
}
