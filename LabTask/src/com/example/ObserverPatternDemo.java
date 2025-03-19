package LabTask.src.com.example;

public class ObserverPatternDemo {
   public static void main(String[] args) {
      // Create a new subject object. This is the object being observed.
      Subject subject = new Subject();

      // Create observers for Binary, Octal, and Hexadecimal formats.
      // These observers will watch for changes in the state of the subject.
      BinaryObserver binaryObserver = new BinaryObserver(subject);
      OctalObserver octalObserver = new OctalObserver(subject);
      HexaObserver hexaObserver = new HexaObserver(subject);

      // Attach the observers to the subject.
      // This means that all of the observers (binary, octal, hex) will be notified
      // when the subject's state changes.
      subject.attach(binaryObserver);
      subject.attach(octalObserver);
      subject.attach(hexaObserver);

      // State change #1: Set the subject state to 15.
      // Since all observers are attached, they will be notified and print their output.
      System.out.println("First state change: 15");	
      subject.setState(15);  // This will trigger the observers' update() methods.

      // At this point, the following output would be produced by the observers:
      // - BinaryObserver will print: "Binary String: 1111"
      // - OctalObserver will print: "Octal String: 17"
      // - HexaObserver will print: "Hex String: F"

      // Detach one observer, specifically the HexaObserver.
      // After this line, the HexaObserver will no longer receive updates from the subject.
      System.out.println("Detaching HexaObserver");
      subject.detach(hexaObserver);  // HexaObserver is removed from the list of observers.

      // State change #2: Set the subject state to 10.
      // This will again trigger the update methods of the remaining observers: BinaryObserver and OctalObserver.
      System.out.println("Second state change: 10");	
      subject.setState(10);  // This will trigger the update() methods of BinaryObserver and OctalObserver.

      // At this point, the following output would be produced by the remaining active observers:
      // - BinaryObserver will print: "Binary String: 1010"
      // - OctalObserver will print: "Octal String: 12"
      // HexaObserver is no longer notified because it has been detached.
   }
}