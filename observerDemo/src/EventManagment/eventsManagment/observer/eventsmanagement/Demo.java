package observerDemo.src.EventManagment.eventsManagment.observer.eventsmanagement;

public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
} {
    
}
