import java.io.*;
class Example2 {
    public static void main(String[] args) {
        try{
        InputStream input = System.in;
        InputStreamReader in = new InputStreamReader(input);
        BufferedReader reader = new BufferedReader(in);
        System.out.println(reader.readLine());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
