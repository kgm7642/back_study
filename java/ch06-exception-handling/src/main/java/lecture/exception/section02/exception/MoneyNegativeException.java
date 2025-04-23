package lecture.exception.section02.exception;

public class MoneyNegativeException extends RuntimeException {
  public MoneyNegativeException() {
  }

  public MoneyNegativeException(String message) {
        super(message);
    }
}
