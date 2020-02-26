package io.mosfet.transmogrifier.handlers;

import java.io.IOException;

/**
 * Created with love.
 * User: mosfet
 * Date: 25/02/20
 * github: kmos
 * twitter: nmosf
 */
public class ThreadedHandler<S> extends  UncheckedIOExceptionConverterHandler<S> {

  public ThreadedHandler(Handler<S> other) {
    super(other);
  }

  @Override
  public void handle(S s) {
    new Thread(() -> super.handle(s)).start();
  }
}
