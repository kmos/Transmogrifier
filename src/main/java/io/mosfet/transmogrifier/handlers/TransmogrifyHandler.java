package io.mosfet.transmogrifier.handlers;

import util.Util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created with love.
 * User: mosfet
 * Date: 24/02/20
 * github: kmos
 * twitter: nmosf
 */
public class TransmogrifyHandler implements Handler<Socket> {

  @Override
  public void handle(Socket socket) throws IOException {
    try (
      socket; // Java 9 version
      InputStream in = socket.getInputStream();
      OutputStream out = socket.getOutputStream()
    ) {
      int data;
      while ((data = in.read()) != 1) {
        out.write(Util.transmogrify(data));
      }
    }
  }
}
