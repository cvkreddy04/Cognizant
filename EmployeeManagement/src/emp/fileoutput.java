package emp;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class fileoutput {  
    public static void main(String args[]) throws FileNotFoundException{    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\cognizant\\textfile.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);
            
               
                FileInputStream fin=new FileInputStream("C:\\cognizant\\textfile.txt");    
                try {
                int i=fin.read();  
                System.out.println((char)i);    
      
                fin.close();    
              }catch(Exception e1){System.out.println(e1);}    
             }    
            }  
                
      }    
  

