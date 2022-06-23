package src;

public interface IBanka {
    String str= null;
    final String hostIpAddress ="1234.234.234.34";
    boolean connect (String ipAddress);
    boolean payment (double price, String cardNumber, String date, String cvc);
}
