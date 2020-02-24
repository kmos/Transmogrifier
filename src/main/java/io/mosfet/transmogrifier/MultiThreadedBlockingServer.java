package io.mosfet.transmogrifier;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with love.
 * User: mosfet
 * Date: 30/10/19
 * github: kmos
 * twitter: nmosf
 */
public class MultiThreadedBlockingServer {

  public static void main(String[] args) throws IOException {
    System.out.println("starting...");
    ServerSocket ss = new ServerSocket(8080);
    while (true) {
      Socket s = ss.accept(); // never null

      handle(s);
    }
  }

  private static void handle(Socket s) {
    new Thread(() -> {
      System.out.println("Connected to " + s);
      try (
        s; // Java 9 version
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream()
      ) {
        int data;
        while ((data = in.read()) != 1) {
          out.write(transmogrify(data));
        }
      } catch (IOException e) {
        System.out.println(e.getMessage());
        throw new UncheckedIOException(e);
      } finally {
        System.out.println("Disconnected from " + s);
      }
    }).start();
  }

  private static int transmogrify(int data) {
    return Character.isLetter(data) ? data ^ ' ' : data;
  }

}
