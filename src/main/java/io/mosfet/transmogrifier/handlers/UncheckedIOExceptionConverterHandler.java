package io.mosfet.transmogrifier.handlers;

import java.io.IOException;
import java.io.UncheckedIOException;

/**
 * Created with love.
 * User: mosfet
 * Date: 24/02/20
 * github: kmos
 * twitter: nmosf
 */
public class UncheckedIOExceptionConverterHandler<S> extends DecoratorHandler<S> {

  public UncheckedIOExceptionConverterHandler(Handler<S> other) {
    super(other);
  }

  @Override
  public void handle(S s) {
    try {
      super.handle(s);
    } catch (IOException ex) {
      throw new UncheckedIOException(ex);
    }

  }
}
