package ind.renpeng.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try{
        Socket s=new Socket("localhost",8189);
      OutputStream outputStream= s.getOutputStream();
      String a="hello";
      outputStream.write(a.getBytes());
      outputStream.flush();
     // outputStream.close();
  Thread.sleep(100000);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
