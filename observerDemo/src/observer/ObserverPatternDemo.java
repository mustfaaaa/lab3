package observerDemo.src.observer;


public class ObserverPatternDemo {
   public static void main(String[] args) {
      // Create a Subject (the object being watched)
      Subject subject = new Subject();

      // Create and attach observers (Binary, Octal, Hexadecimal) to the Subject
      BinaryObserver binaryObserver = new BinaryObserver(subject);
      OctalObserver octalObserver = new OctalObserver(subject);
      HexaObserver hexaObserver = new HexaObserver(subject);

      // Add observers to the Subject's list
      subject.attach(binaryObserver);
      subject.attach(octalObserver);
      subject.attach(hexaObserver);

      // Change the state of the Subject to 15
      // All attached observers will get notified and update their output
      System.out.println("First state change: 15");
      subject.setState(15); // Observers will display their respective formats

      // Expected Output:
      // - BinaryObserver: "Binary String: 1111"
      // - OctalObserver: "Octal String: 17"
      // - HexaObserver: "Hex String: F"

      // Remove HexaObserver, so it will no longer get updates
      System.out.println("Detaching HexaObserver");
      subject.detach(hexaObserver);

      // Change the state of the Subject to 10
      // Only BinaryObserver and OctalObserver will get updated
      System.out.println("Second state change: 10");
      subject.setState(10); 

      // Expected Output:
      // - BinaryObserver: "Binary String: 1010"
      // - OctalObserver: "Octal String: 12"
      // HexaObserver won't display anything since it's detached.
   }}
