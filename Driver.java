/*  Author: Ryan Nolan
    Date: April 1st, 2015
    Filename: Driver.java
    Purpose: Core of the Entire Application
*/

public Driver implements Runnable
{
    // Properties
    
    // Objects
    
    // Initializers
    public Driver ()
    {
        System.out.println("Hello World");
    }
    
    // Main Methods
    public static void main (String[] args)
    {
        Thread driver = new Thread(this);
        driver.start();
    }
    
    // Helper Methods
    
    // Methods
    public void run()
    {
        
    }
}
