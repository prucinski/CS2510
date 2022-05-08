package piotrrucinski;
import java.util.*;

import piotrrucinski.Activity.Emotions;

import java.time.LocalDate;


public class YoungAdult extends Person {
	private List<Activity> activities;
	//defines whether this person is pre lockdown, post lockdown or post-youthsupport
	private int stage;
	public YoungAdult(String firstName, String lastName, LocalDate yearOfBirth, Gender gender, String mobileNumber,
			int[] personality, List<Activity> activities) {

		super(firstName, lastName, yearOfBirth, gender, mobileNumber, personality);

		//only thing that makes a YoungAdult differ in its constructing is adding a List of activities in the constructor
		this.activities = activities;
		this.stage = 0;

	}
	//function that calculates feelings and stores it as a HashMap. Takes an activity list as an input.

	public HashMap<Emotions, Double> calculateFeelings(List<Activity> inputActivityList) {

		//initializing the HashMap by looping through every exsisting emotion in Emotions
		HashMap<Emotions, Double> feelingsTable = new HashMap<Emotions, Double>();
		for(Emotions emotion : Emotions.values()) {
			feelingsTable.put(emotion, 0d);
		}


		//looping through activities in the activity list
		for(Activity activity : inputActivityList) {

			double durationModifier1 = 1;		//preventing some personalities from being dominated by "bored" or "productive" feeling because of university
			double durationModifier2 = 1;
			if (activity.getDuration() > 2){
				durationModifier1 = 0.25d;
			}
			if (activity.getDuration() > 2){
				durationModifier2 = 0.25d;

			}
			//updating emotion values in the hash map. For calculations, the strength of someone's personality trait is used, 
			//the duration of the activity and the type of emotion this activity usually invokes.
			feelingsTable.put(activity.activityName.getEmotion1(), feelingsTable.get(activity.activityName.getEmotion1()) + getPersonality()[activity.activityName.getPersonalityScore1()]*activity.getDuration()*durationModifier1);
			feelingsTable.put(activity.activityName.getEmotion2(), feelingsTable.get(activity.activityName.getEmotion2()) + getPersonality()[activity.activityName.getPersonalityScore2()]*activity.getDuration()*durationModifier2);

		}
		//System.out.println(feelingsTable);
		return feelingsTable;
	}

	//function that takes a HashMap as an input and displays numberOfEmotion most distinguishable emotions (emotions with the highest values)
	public void displayFeelings(int numberOfEmotion, HashMap<Emotions, Double> inputTable) {
		double highestValue = 0;
		int numberOfEmotions = numberOfEmotion;
		Emotions highestEmotion = null;
		HashMap<Emotions, Double> temp = inputTable;
		String[] stage = new String[] {"Pre-lockdown, ", "Post-lockdown, ", "Post Youth Support, "};

		//operating on a temporary HashMap. Passing by value
		temp = calculateFeelings(this.getActivities());
		System.out.println(stage[getStage()] + getFirstName() +" " + getLastName() + ", " + getAge() +" has been feeling:");
		for(int i = 0; i<numberOfEmotions; i++) {					//a loop to display the highest-felt emotions of the young adult
			highestValue = 0;
			for(Emotions emotions : temp.keySet()) {
				if(temp.get(emotions) > highestValue) {
					highestEmotion = emotions;
					highestValue = temp.get(emotions);
				}
			}
			System.out.println(highestEmotion);
			temp.remove(highestEmotion);

		}


	}
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

}
