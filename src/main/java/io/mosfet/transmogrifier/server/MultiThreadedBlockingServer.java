package io.mosfet.transmogrifier.server;

import io.mosfet.transmogrifier.handlers.PrintingHandler;
import io.mosfet.transmogrifier.handlers.ThreadedHandler;
import io.mosfet.transmogrifier.handlers.TransmogrifyHandler;
import io.mosfet.transmogrifier.handlers.UncheckedIOExceptionConverterHandler;

import java.io.IOException;
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
// min 12.49
  public static void main(String[] args) throws IOException {
    System.out.println("starting...");
    ServerSocket ss = new ServerSocket(8080);
    UncheckedIOExceptionConverterHandler<Socket> handler =
      new ThreadedHandler<>(
        new PrintingHandler<>(
          new TransmogrifyHandler()
        )
      );
    while (true) {
      Socket s = ss.accept(); // never null
      handler.handle(s);
    }
  }
}
