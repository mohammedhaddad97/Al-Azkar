
# Al-Azkar
This Application displays the Duaa that Muslims should say in the morning and in the evening.

## The App on YouTube:

 1. ### Part 1:
	 <a href="http://www.youtube.com/watch?feature=player_embedded&v=kVNL-h4xHnE
" target="_blank"><img src="http://img.youtube.com/vi/kVNL-h4xHnE/0.jpg" 
alt="My first personal Project Video on YouTube" width="240" height="180" border="10" /></a>	
 
 2. ### Part 2:
	 <a href="http://www.youtube.com/watch?feature=player_embedded&v=mAPCFMIP4cg
" target="_blank"><img src="http://img.youtube.com/vi/mAPCFMIP4cg/0.jpg" 
alt="My first personal Project Video on YouTube" width="240" height="180" border="10" /></a>
3. ### Part 3 -My final & desired stage-
	 <a href="http://www.youtube.com/watch?feature=player_embedded&v=U6AaELzdCdE
" target="_blank"><img src="http://img.youtube.com/vi/U6AaELzdCdE/0.jpg" 
alt="My first personal Project Video on YouTube" width="240" height="180" border="10" /></a>
## Why I built this App?
The whole purpose of building this App, is to practice and apply the concepts that I learned in the **Jim Wilson\'s Pluralsight course:** [Android Application Basics](https://app.pluralsight.com/library/courses/android-application-basics-understanding/table-of-contents), And this App -insha'Allah- will be my to-practice-upon app, I'll keep updating and improving it with every new concept that I learn, but that doesn't mean I won't build more projects, I'll definitely do that -insha'Allah- 

>I have learned this course a while ago, but I haven't practiced it other than the Application that he builds in the course, but now finally I've applied the concepts to my own personal app.
***

### Concepts Learned in Part 1:

 - Views & How to link between `Java` code and `XML` code.
 - `ConstrainLayout` and how to adjust my views relatively.
 - How to display a list of items on the screen using `ListView`.
 - AdapterView and how to connect it to `ListView`.
 - `OptionsMenu` and how to perform an action based on a specific `menu item`.
 - `Explicit & Implicit Intents` and `Intent Extras`.
 - How to convert a `Reference Type` into a `Parcelable` -a bunch of bytes- to be able to send it as an `Intent Extra`.
 - `Managing Process State` of the App to keep the app data due to system configurations like rotating the devic\'s screen by implementing the interface `ViewModel` and overriding the method `onSaveInstanceState()`.
 - Activity lifecycle and when to use the activity lifecycle methods to perform an action when moving from one state to another.
 - Updating the `ListView` when adding or removing an items of the list.
 
 ### Concepts Learned In Part 2:
 
 - How to use Android Studio in a way that would increase my productivity.
 - What is `Gradle`, and how to add `Dependencies`, change `SDK version` and so on.
 - `JVM Testing`; which is the back-end testing of the App, and it doesn't require running the App.
 - `Unit Testing`.
 - `Instrumented Testing`; Which is testing the UI of the App.
 - How to set up the depndencies for the Instrumented Testing.
 - A brief intro about the Test-Driven Philosophy.

## How I built the App? And Updates:
I really struggled with this part, I had no idea how to start thinking or planning the App, first of all I'm a terrible designer, but -Alhamdulillah- I managed to come up with a design in my mind -of course couldn't build the project exactly as I imagined it because still I need more concepts to be able to do it, and -insha'Allah- I'll update it once I learn those new concepts in the future.
then, looked at the data that I'll use in my app and it appeared to be one thing which is `Alzikr` both kinds, morning duaa, and evening duaa, so I made one class for them, then made three memeber variables for the three pieces of information that each zikr might have, and then used the same design pattern Jim uses in his code which is the `Singleton Design Pattern`, of course that's a ver basic and simple app, but I'm happy that I finally made the move and built something of my own rather than just copying something.

## First Update:
This is the first update, since I made the project.
In this update, I applied the Testing concepts that I learned.

 - Tested the Java -Back End- code of the App with `JUnit`.
 - Tested the UI of the App using the `Espresso` and `Hamcrest` libraries, also JUnit.
 - And finally added an `Alert Dialog` that would pop-up and display a text on clicking any item in the `Listview` .

## Second Update:
Finally I've hit the desired result of the app, nothing too fancy, but I'm happy I've made it. And it really served the purpose which was to:
1. Apply the concepts that I learned, and just start building projects.
2. Build something useful, and I think this App's content is far more than useful -Alhamdulillah, meaning; Thank God in Arabic-.
---

> That's it for this App -Well might learn Fragments and apply them here too.-
> See you in the next Project. Peace be upon you all!

  

#### Credits:

 - Huge thanks to [Islambook.com](https://www.islambook.com/) for
   inspiring me with the idea, I really love how they display Al-Azkar,
   especially the idea of counters and number of repetitions it's really
   amazing.
 - Finally, thanks to you for reading all that, I'm grateful, and I hope I was of help in anyway possible, peace be upon you all.
