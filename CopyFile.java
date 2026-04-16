import java.io.*;
class CopyFile
{
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        int i;
        FileInputStream fin=null;
        FileOutputStream fout=null;
        fin = new FileInputStream(args[0]);
        fout = new FileOutputStream(args[0]);
        do
        {
            i = fin.read();
            if(i !=-1)
                fout.write(i);
        }
        while(i !=-1);
        fin.close();
        fout.close();
        
    }
}