package observer.eventsmanagement;


public class SMSSupportListener {
    private static final int MAX_SMS_LENGTH = 160;
 
    public void sendSMS(String message, String phoneNumber) {
       if (message.length() > MAX_SMS_LENGTH) {
          System.out.println("Warning: SMS message exceeds " + MAX_SMS_LENGTH + " characters. Please define a valid SMS.");
       } else {
          // Logic to send SMS
          System.out.println("Sending SMS to " + phoneNumber + ": " + message);
       }
    }
 }