package CSTutor.Model.Tutorial;

import CSTutor.View.Tutorial.*;
import CSTutor.Model.Tutorial.*;
import javax.swing.JOptionPane;

/**
* An Author page is an individual topic page within a tutorial track. This is 
* the page that authors fill out their tutorial content on.
*
* @author Kim Arre (karre@calpoly.edu)
* @version 20Apr2015
*/
public class TutorialEditor {
    /** Gate to the tutorial track */
    public TutorialTrack tutorialTrack;

   /** Contains the editing options for a Tutorial Editor page*/
   public EditTextButtons toolbar;
   
   /** Verification box for proper tutorial content */
   JOptionPane invalidContent;
   
   /** 
    * Constructs a new instance of a TutorialEditor
    */
   public TutorialEditor() {
       //new instance of tutorial track?
   }

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

   /**
   * Saves the changes on the editing page to the tutorial.
   */
   public void save(TutorialData pageData) {
      if (pageData.description.intro.equals("") || pageData.description.syntax.equals("") || pageData.title.equals("")) {
          invalidContent.showMessageDialog(null, "A tutorial must contain a title, description, and syntax.");
      } else {
        tutorialTrack.track.add(pageData);
        System.out.println("Saved! There are now " + tutorialTrack.track.size() + " tutorials.");
      }
   }
   
   /**
   * Shows the tutorial changes from the student point of view.
   */
   public void preview() {
      System.out.println("Called tutorial previow() method.");
   }

}