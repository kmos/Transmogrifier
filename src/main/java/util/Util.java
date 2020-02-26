package util;

/**
 * Created with love.
 * User: mosfet
 * Date: 24/02/20
 * github: kmos
 * twitter: nmosf
 */
public class Util {
  public static int transmogrify(int data) {
    return Character.isLetter(data) ? data ^ ' ' : data;
  }
}
