package B16_IOTextFile;

import java.io.*;

public class Copy_File_Text {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedWriter bufferedWriter=null;
        try {
            File fileRead = new File("B16_IOTextFile\\abc.csv");
            FileReader fileReader = new FileReader(fileRead);
            BufferedReader br = new BufferedReader(fileReader);

            File fileWrite = new File("B16_IOTextFile\\xyz.csv");
            FileWriter fileWriter = new FileWriter(fileWrite,true);
            bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = br.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
