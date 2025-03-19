package LabTask.src.com.example;

public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      // Create observers and attach them
      BinaryObserver binaryObserver = new BinaryObserver(subject);
      OctalObserver octalObserver = new OctalObserver(subject);
      HexaObserver hexaObserver = new HexaObserver(subject);

      // Attach observers
      subject.attach(binaryObserver);
      subject.attach(octalObserver);
      subject.attach(hexaObserver);

      System.out.println("First state change: 15");	
      subject.setState(15);

      // Detach one observer
      System.out.println();
      System.out.println("Detaching HexaObserver");
      subject.detach(hexaObserver);

      System.out.println("Second state change: 10");	
      subject.setState(10);
   }
}