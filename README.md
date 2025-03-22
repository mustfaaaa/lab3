<h1>Explanation of Subject Class</h1>
    
<p>The <strong>Subject</strong> class is a key part of the Observer Pattern. It maintains a list of observers and ensures that they are notified whenever there is a change in the state.</p>
    
<h2>How It Works</h2>
    <p>The Subject class allows multiple observers to register themselves using the <code>attach()</code> method. When the state changes, the <code>notifyAllObservers()</code> method is called to inform all attached observers.</p>
    
   <h2>Key Functions</h2>
    <ul>
        <li><strong>getState()</strong> - Returns the current state of the subject.</li>
        <li><strong>setState(int state)</strong> - Updates the state and calls <code>notifyAllObservers()</code>.</li>
        <li><strong>attach(Observer observer)</strong> - Adds an observer to the list.</li>
        <li><strong>detach(Observer observer)</strong> - Removes an observer from the list so it no longer receives updates.</li>
        <li><strong>notifyAllObservers()</strong> - Iterates through the observer list and calls their <code>update()</code> method.</li>
    </ul>
    
   <h2>Why It Is Useful</h2>
    <p>This pattern is useful when multiple objects need to stay updated with changes in another object’s state. It promotes loose coupling, as the subject does not need to know details about its observers.</p>

   <h1>Explanation of Observer Class</h1>
    
   <p>The <strong>Observer</strong> class is an essential part of the Observer Pattern. It represents an entity that listens for changes in the <strong>Subject</strong> and updates itself accordingly.</p>
    
   <h2>How It Works</h2>
  <p>Observers register themselves with a <strong>Subject</strong>. When the subject’s state changes, it calls the <code>update()</code> method on all registered observers, allowing them to react accordingly.</p>
    
   <h2>Key Functions</h2>
    <ul>
        <li><strong>update()</strong> - This method is called when the subject's state changes. Each observer implements this method differently to handle the update as needed.</li>
        <li><strong>Constructor</strong> - Observers typically receive a reference to the subject during creation so they can register themselves.</li>
    </ul>
        <h2>Why It Is Useful</h2>
    <p>The Observer Pattern is useful for creating a one-to-many dependency between objects. It ensures that changes in the subject are automatically reflected in all observers, keeping them synchronized.</p>
    <h2> Notification message </h2>
    yes the notification message for the length more then 160 character in the class and the giving warning has been added.
