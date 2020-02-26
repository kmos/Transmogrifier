package io.mosfet.transmogrifier.handlers;

import java.io.IOException;

/**
 * Created with love.
 * User: mosfet
 * Date: 26/02/20
 * github: kmos
 * twitter: nmosf
 */
public abstract class DecoratorHandler<S> implements Handler<S> {
  private Handler<S> other;

  public DecoratorHandler(Handler<S> other) {
    this.other = other;
  }

  @Override
  public void handle(S s) throws IOException {
    other.handle(s);
  }
}
