# introsde-2017-assignment-3-client

## 1. Identification

Giovanni Rafael Vuolo giovannirafael.vuolo@studenti.unitn.it

My Server: https://assignsde3.herokuapp.com/ws/people?wsdl


## 2. Project

This is the client for the server https://assignsde3.herokuapp.com/ws/people?wsdl. 

#### 2.1. Code

The project is structured as follow:
* __src__ : contains the client (PeopleClient), which implement all the methods of the server, and the classes imported from the server (inside introsde.assignment3.soap).

#### 2.2. Task

The client performs the following methods:
* __Method #1__. Calls readPersonList() to get the list of all people in the database. print them all.
* __Method #2__. Calls readPerson(long id) to get a particular person by its id.
* __Method #3__. Calls updatePerson(Person p) to update a particular person.
* __Method #4__. Calls createPerson(Person p) to create a new Person with a Preference.
* __Method #5__. Calls deletePerson(Long id) to delete a particular person, in this case the one just created.
* __Method #6__. Calls readPersonPreferencesByType(Long id, String activity_type) to get Activities with a particular type and prints them
* __Method #7__. Calls readPreferences() to get the list of all Activities and prints them.
* __Method #8__. Calls readPersonPreferencesById(Long id, Long activity_id) to get the activity with an id inside a person, and prints it.
* __Method #9__. Calls savePersonPreferences(Long id, Activity activity) to ad a new activity to a person, and prints it if it was added.
* __Method #10__. Calls updatePersonPreferences(Long id, Activity activity) to update a particular Activity of a person, and prints the updated attribute.
* __Method #11__. Calls evaluatePersonPreferences(Long id, Activity activity, int value) to set a rating of an activity.
* __Method #12__. Calls getBestPersonPreference(Long id) to get the list of the top rated activities of a person and prints them  



## 3. Execution
To run the clients execute this command from terminal (inside the project's directory)
  ```
   ant execute.client
  ```
it will run the program and it will create the __client-server-xml.log__ inside the root directory.

## 4. Additional Notes
If there is an error the client stops.
