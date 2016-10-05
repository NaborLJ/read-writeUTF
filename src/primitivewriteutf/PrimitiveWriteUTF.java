
package primitivewriteutf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class PrimitiveWriteUTF {

    
    public static void main(String[] args) throws IOException {
        int contador=0;
        File texto3 = new File("/home/oracle/NetBeansProjects/primitiveWriteUTF/texto3.txt");
        texto3.createNewFile();
        DataOutputStream textdout = new DataOutputStream(new FileOutputStream("texto3.txt",true));
        DataInputStream textdin = new DataInputStream(new FileInputStream("texto3.txt"));
        textdout.writeUTF("Esto e unha cadea\n"); 
        System.out.println("writeUTF escribiu: "+textdout.size());
        textdout.writeUTF("Esto e unha cadea\n");
        System.out.println("writeUTF escribiu total: "+textdout.size());
        textdout.close();
        System.out.println("bytes totais disponibles = "+textdin.available());
        System.out.println("lemos a primeira cadea en UTF: "+textdin.readUTF());
        System.out.println("numero de bytes disponibeis: "+textdin.available());
        System.out.println("lemos a segunda cadea en UTF: "+textdin.readUTF()); 
        System.out.println("numero de bytes disponibeis: "+textdin.available());
        while(textdin.available()!=0){
            System.out.println("Quedan "+textdin.available()+" bytes");    
            System.out.println(textdin.readUTF());
            
                }
        textdin.close();
        
    }
    
}
