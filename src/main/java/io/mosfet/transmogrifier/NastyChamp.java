package io.mosfet.transmogrifier;

import java.io.IOException;
import java.net.Socket;

/**
 * Created with love.
 * User: mosfet
 * Date: 24/02/20
 * github: kmos
 * twitter: nmosf
 */
public class NastyChamp {

  public static void main(String[] args) throws IOException, InterruptedException {
    Socket[] socket = new Socket[3000];
    for (int i = 0; i < socket.length; i++) {
      socket[i] = new Socket("localhost", 8080);
    }
    Thread.sleep(100_100);
  }
}
