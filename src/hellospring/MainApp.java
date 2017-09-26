package hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   
	   /**
	    * Step 1: Create an application context where we used framework API
	    *         ClassPathXmlApplicationContext().
	    *         This API loads beans configuration file and eventually based
	    *         on the provided API, it takes care of creating and initializing
	    *         all the objects, i.e. beans mentioned in the configuration file.
	    */
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      
       /**
        * Step 2: Used to get the required bean using getBean() method of the created
        *         context. This method uses bean ID to return a generic object, which
        *         finally can be casted to the actual object. Once you have an object,
        *         you can use this object to call any class method.
        */
      
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      
      obj.getMessage();
      
   }
}
