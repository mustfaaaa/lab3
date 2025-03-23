package observerDemo.src.EventManagment.eventsManagment;

import java.io.*;

public  class SMSSupportListener implements EventListener {
    public String phoneNo;
    
    public SMSSupportListener(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public void update(String eventType, File file) {
        
       if(file.getName().length() > 160) {
            System.out.println("Please define valid SMS by making its character less than or equal to 160\n Message doesn't send"); 
            return;
        } 
        
        System.out.println("Your message '" + file.getName() + "' is successfully send to\n\tPhone number: " + phoneNo);
        
    }
}
