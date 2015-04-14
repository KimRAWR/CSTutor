package CSTutor.Model.Tutorial.AuthorTutorial;

import CSTutor.Model.Tutorial.*;
import CSTutor.Model.Tutorial.StudentTutorial.*;
import CSTutor.View.Tutorial.*;

/**
* An Author page is an individual topic page within a tutorial track. This is 
* the page that authors fill out their tutorial content on.
*
* @author Kim Arre
*/
public class AuthorPage {
   Description description;
   CodeExample example;
   String tryItYourself;

   EditTextButtons toolbar;

   /*
      pre:                                                          <pre>
         //
         // The Description cannot be empty.
         //
         (description.intro.length() > 0) && (description.syntax.length() > 0);

      post:
         //
         // The edited page exists or has been added to the tutorial track.
         //
         authorPages'.contains(this);

   */
   public void save() {
      System.out.println("Called tutorial save() method.");
   }
   
   public void preview() {
      System.out.println("Called tutorial previow() method.");
   }

}