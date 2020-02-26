package io.mosfet.transmogrifier.server;

import io.mosfet.transmogrifier.handlers.PrintingHandler;
import io.mosfet.transmogrifier.handlers.TransmogrifyHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with love.
 * User: mosfet
 * Date: 30/10/19
 * github: kmos
 * twitter: nmosf
 */
public class SingleThreadedBlockingServer {

  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(8080);
    PrintingHandler<Socket> handler = new PrintingHandler<>(
      new TransmogrifyHandler()
    );
    while (true) {
      Socket s = ss.accept(); // never null
      handler.handle(s);
    }
  }

}
