package io.mosfet.transmogrifier.server;

import io.mosfet.transmogrifier.handlers.*;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created with love.
 * User: mosfet
 * Date: 30/10/19
 * github: kmos
 * twitter: nmosf
 */
public class ExecutorServiceBlockingServer {
// min 12.49
  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(8080);
    ExecutorServiceHandler<Socket> handler =
      new ExecutorServiceHandler<>(
        new PrintingHandler<>(
          new TransmogrifyHandler()
        ), Executors.newFixedThreadPool(10));
    while (true) {
      Socket s = ss.accept(); // never null
      handler.handle(s);
    }
  }
}
