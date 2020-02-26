package io.mosfet.transmogrifier.handlers;

import java.io.IOException;

/**
 * Created with love.
 * User: mosfet
 * Date: 24/02/20
 * github: kmos
 * twitter: nmosf
 */

// decorator
public interface Handler<S> {
  void handle(S s) throws IOException;
}
