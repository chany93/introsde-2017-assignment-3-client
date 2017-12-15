package introsde.assignment3.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.xml.ws.Holder;

import introsde.assignment3.soap.Activity;
import introsde.assignment3.soap.ActivityType;
import introsde.assignment3.soap.Person;
import introsde.assignment3.soap.Person.Evaluation;
import introsde.assignment3.soap.Person.Evaluation.Entry;
import introsde.assignment3.soap.People;
import introsde.assignment3.soap.PeopleService;

public class PeopleClient {
	  public static void main(String[] args) {
	        PeopleService peopleService = new PeopleService();
	        People people = peopleService.getPeopleImplPort();
	        
	        String out = "";
	        
	        List<Activity> aList = new ArrayList<>();
	        List<Evaluation.Entry> map;
	        
	       	out = out + "Calling " + peopleService.getWSDLDocumentLocation() + "\n\n\n";
	       
	       	//Method#1        
	      	out = out + "\nMethod #1: readPersonList()" + "\n" 
	       			+ "Paramenter: None\n"
	       			+ "Response: \n";
	       	
	        List<Person> pList = people.readPersonList();
	        for(Person person : pList) {
	        	 	out = out + "- Person " + person.getIdPerson() + " in the list ==> "+person.getFirstname() + "\n  ";
	        	 	for (Activity activity : person.getPreferences().getActivity()) {
	        	 		out = out + "- Activity " + activity.getIdActivity() + " => " + activity.getName() + "\n  ";
	        	 	}
	        	 	out = out + "\n";
	        }
	        
	        out = out + "\n=============================\n";
	        
	        //Method#2
	        out = out + "\nMethod #2: readPerson(long id)" + "\n" 
	       			+ "Paramenter: (3)\n"
	       			+ "Response: \n";
	        Person p = people.readPerson(3);
	        map = p.getEvaluation().getEntry();
	        out = out + "Name: " + p.getFirstname() + "\n" 
	        			+ "Lastname: " + p.getLastname() + "\n"
	        			+ "Birthdate: " + p.getBirthdate() + "\n"
	        			+ "Preferences: \n  ";
	        int i = 0;
	        for (Activity activity : p.getPreferences().getActivity()) {
    	 			out = out + "Id:  " + activity.getIdActivity() + "\n  "
    	 					+ "Name: " + activity.getName() + "\n  "
    	 					+ "Description: " + activity.getDescription() + "\n  "
    	 					+ "Place: " + activity.getPlace() + "\n  "
    	 					+ "Type: " + activity.getType().toString() + "\n  "
    	 					+ "Startdate: " + activity.getStartdate() + "\n  "
    	 					+ "Rating: " + map.get(i).getValue() + "\n";
    	 					i++;  	 				
    	 		}
	        			
	               
	        out = out + "\n=============================\n";
	        
	        //Method#3
	        out = out + "\nMethod #3: updatePerson(Person p)" + "\n" 
	       			+ "Paramenter: (p with id 1)\n"
	       			+ "Response: \n";
	        
	        p = people.readPerson(1);
	        p.setFirstname("Gennaro");
	        Person person = people.updatePerson(p);
	        
	        out = out + "Name changed to: " + person.getFirstname();
	        
	    
	        
	        out = out + "\n=============================\n";
	        
	        //Method#4
	        out = out + "\nMethod #4: createPerson(Person p)" + "\n" 
	       			+ "Paramenter: (new person p)\n"
	       			+ "Response: \n";
	       
	        //creating new person
	        p = new Person();
	        p.setFirstname("Valerio");
	        p.setLastname("Pelo");
	        p.setBirthdate("1995-04-12");
	      
	        	//creating new activity
	        Activity a = new Activity();	        
	        a.setName("Jump");
	        a.setDescription("Jumping on the ground");
	        a.setPlace("Dance Floor");
	        a.setType(ActivityType.ENTERTAINMENT);
	        a.setStartdate("2000-03-29T00:00:00.0");
	        
	        Entry e = new Entry();
	       
	        e.setKey(a.getName());
	        e.setValue(5);
			
			Evaluation eval = new Evaluation();
			eval.getEntry().add(e);
			
			p.setEvaluation(eval);
	        p = people.createPerson(p);
	        aList.add(a);
	        people.savePersonPreferences(p.getIdPerson(), a);
	        
	    
	        p = people.readPerson(p.getIdPerson());
	        out = out + "Name: " + p.getFirstname() + "\n" 
        			+ "Lastname: " + p.getLastname() + "\n"
        			+ "Birthdate: " + p.getBirthdate() + "\n"
        			+ "Preferences: \n  ";
	        	i = 0;
	        	
	        	for (Activity activity : p.getPreferences().getActivity()) {
	 			out = out + "Id:  " + activity.getIdActivity() + "\n  "
	 					+ "Name: " + activity.getName() + "\n  "
	 					+ "Description: " + activity.getDescription() + "\n  "
	 					+ "Place: " + activity.getPlace() + "\n  "
	 					+ "Type: " + activity.getType().toString() + "\n  "
	 					+ "Startdate: " + activity.getStartdate() + "\n  "
	 					+ "Rating: " + map.get(i).getValue() + "\n";
	 					i++;  	 				
	 		}
        		       
	        
	        out = out + "\n=============================\n";
	        
	        //Method#5
	        out = out + "\nMethod #5: deletePerson(long id)" + "\n" 
	       			+ "Paramenter: (id of person create in method#4)\n"
	       			+ "Response: \n";
	        
	        long ret = people.deletePerson(p.getIdPerson());
	        if (ret == 0) {
	        		out = out + "Person deleted \n";
	        }else {
	        		out = out + "Person not in db \n";
	        }
	        
	         
	         
	        
	        
	        
	        
	        out = out + "\n=============================\n";
	        
	        //Method#6
	        out = out + "\nMethod #6: readPersonPreferencesByType(Long id, String activity_type)" + "\n" 
	       			+ "Paramenter: (7, Sport)\n"
	       			+ "Response: \n";	
	        	
	        aList = people.readPersonPreferencesByType(7, "Sport");
	        //System.out.println("Result ==> "+aList);
	        for(Activity activity : aList) {
	        		out = out + "Activity " + activity.getIdActivity() + " in the list ==> "+activity.getName();
	    }

	        
	        
	        out = out + "\n=============================\n";
	        
	        //Method#7
	        out = out + "\nMethod #7: readPreferences()" + "\n" 
	       			+ "Paramenter: None\n"
	       			+ "Response: \n  ";
	      
	        aList = people.readPreferences();
	        	for(Activity activity : aList) {
	        		out = out + "Activity " + activity.getIdActivity() + " in the list ==> "+activity.getName() + "\n  ";
	         }
         
	        
	        
	        
	        
	        	out = out + "\n=============================\n";
	        
	        //Method#8
	        out = out + "\nMethod #8: readPersonPreferencesById(long id, long activity_id)" + "\n" 
	       			+ "Paramenter: (10, 11)\n"
	       			+ "Response: \n";
	        
	        
	        Activity activity = people.readPersonPreferencesById(10, 11);
	        //System.out.println("Result ==> "+aList);
	       
	    	 	out = out + "Activity with id: " + activity.getIdActivity() + " => "+activity.getName() +"\n";
	  
	        
	     
	        
	    	 	out = out + "\n=============================\n";
	        
	        //Method#9
	        out = out + "\nMethod #9:  savePersonPreferences(Long id, Activity activity)" + "\n" 
	       			+ "Paramenter: (10, newAct)\n"
	       			+ "Response: \n";
	        
	        Activity newAct = new Activity();
	        newAct.setName("Dance");
	        newAct.setDescription("Dancing all night");
	        newAct.setPlace("Disco");
	        newAct.setType(ActivityType.SOCIAL);
	        newAct.setStartdate("2012-01-28T00:00:00.0");
	        people.savePersonPreferences(10, newAct);
	        
	        aList = people.readPersonPreferencesByType(10, "Social");
	       
	        for(Activity activ : aList) {
        			out = out + "Activity " + activ.getIdActivity() + " in the list ==> "+activ.getName();
	        }

	        
	    	 	out = out + "\n=============================\n";
	        
	        //Method#10
	        out = out + "\nMethod #10: updatePersonPreferences(Long id, Activity activity)" + "\n" 
	       			+ "Paramenter: (10, a random activity of the person) \n"
	       			+ "Response: \n";
	        
	        
	        	p = people.readPerson(10);
	        	Activity upAct = new Activity();
	        for(Activity acti : p.getPreferences().getActivity()) {
	        		upAct = acti;
	        }
	        upAct.setName("Videogaming");
	        
	        upAct = people.updatePersonPreferences(10, upAct);
	        
	        out = out + "Activity changed.... new name: " + upAct.getName() + "\n";	       
	        
	        
	        out = out + "\n=============================\n";
	        
	        //Method#11
	        out = out + "\nMethod #11: evaluatePersonPreferences(Long id, Activity activity, int value)" + "\n" 
	       			+ "Paramenter: (3, 4, 3)\n"
	       			+ "Response: \n";
	        
	        people.evaluatePersonPreferences(3, people.readPersonPreferencesById(3, 4),3);
	        out = out + "Activity: " + people.readPersonPreferencesById(3, 4).getName() + " of person with id: 3 gets an evaluation"
	        		+ " of 3 out of 5\n";
	        
	        out = out + "\n=============================\n";
	        
	        //Method#12
	        out = out + "\nMethod #12: getBestPersonPreferences(long id)" + "\n" 
	       			+ "Paramenter: 1\n"
	       			+ "Response: \n";
	        
	        aList = people.getBestPersonPreferences(12);
		       for(Activity act : aList) {
		   	 	out = out + "Best activity " + act.getIdActivity() + " in the list ==> "+act.getName() + "\n";
		       
		       
		       } 
	      
		    
	        xmlToLog(out);
	        //System.out.println(out);
	        
	    }
	  
	  //creates log file
	  public static void xmlToLog(String text) {
		 	
		    Logger logger = Logger.getLogger("MyLog");
		    FileHandler fh;
		     
		    try {
		         
		        // This block configure the logger with handler and formatter
		        fh = new FileHandler("client-server-xml.log", false);
		        logger.addHandler(fh);
		        //logger.setLevel(Level.ALL);
		        SimpleFormatter formatter = new SimpleFormatter();
		        fh.setFormatter(formatter);
		         
		        // the following statement is used to log any messages
		        logger.info(text);
		         
		    } catch (SecurityException e) {
		        e.printStackTrace();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		    
		}
}