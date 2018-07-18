import java.io.*;
class Example1 {
    public static void main(String[] args) {
        String path = "./File.txt";
        try{
        FileInputStream in = new FileInputStream(path);
        int data;
        byte[] buffer = new byte[255];
        while ((data = in.read(buffer))>0) {
           //    System.out.write(data);
            System.out.print(new String(buffer, 0, data));
        }
    }
        catch(IOException e){
            System.out.println("File not Found.");

        }
    }
}