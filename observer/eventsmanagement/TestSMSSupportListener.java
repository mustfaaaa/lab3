package observer.eventsmanagement;

import observer.eventsmanagement.SMSSupportListener;

public class TestSMSSupportListener {
   public static void main(String[] args) {
      SMSSupportListener smsSupport = new SMSSupportListener();

      // Test sending valid SMS
      smsSupport.sendSMS("Hello, this is a valid message.", "1234567890");

      // Test sending SMS that exceeds the character limit
      String longMessage = "This message is too long and exceeds the limit of 160 characters. " +
         "It should trigger a warning and not be sent to the phone number, as it is invalid.";
      smsSupport.sendSMS(longMessage, "9876543210");
   }
}