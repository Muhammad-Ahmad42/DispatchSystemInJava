/*package dispatchdesktopapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DispatchDesktopApp {

   
    public static void main(String[] args)
    {
        final String FILENAME = "data.txt";
        // TODO code application logic here
        
        // file write
        
        FileWriter fw = null;
            BufferedWriter bw = null;
        try{
            fw = new FileWriter("data.txt", true);
            bw = new BufferedWriter(fw);
            bw.write(129+","+"LEA-1124"+","+"Lahore"+","+"Karachi"+","+"12/10/2024");
            bw.newLine();
            
            
        }
        catch(IOException e)
        {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally{
            if(bw != null)
            {
                try {
                    bw.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        
        // file read
       FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            String truckNumber = "Lea1122";
            
            String line;
            while((line = br.readLine())!=null)
            {
                //System.out.println(line);
                String arr[] = line.split(",");
                if(arr[1].equalsIgnoreCase(truckNumber)){
                    System.out.println("ITEM ID : "+arr[0]);
                    System.out.println("TRUCK # : "+arr[1]);
                    System.out.println("SOURCE : "+arr[2]);
                    System.out.println("DESTINATION : "+arr[3]);
                    System.out.println("DATE : "+arr[4]);
                    System.out.println("");
                    break;
                }
                
                if(line == null)
                {
                    System.out.println(truckNumber+" not found.");
                }
            }
        }catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally{
            if(br!= null)
            {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        
    }   
}
*/