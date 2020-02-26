package io.mosfet.transmogrifier.handlers;

import java.io.IOException;

/**
 * Created with love.
 * User: mosfet
 * Date: 24/02/20
 * github: kmos
 * twitter: nmosf
 */
public class PrintingHandler<S> extends DecoratorHandler<S> {


  public PrintingHandler(Handler<S> other) {
    super(other);
  }

  @Override
  public void handle(S s) throws IOException {
    System.out.println("Connected to " + s);
    try  {
      super.handle(s);
    } finally {
      System.out.println("Disconnected from " + s);
    }
  }

}
