package piotrrucinski;



import java.util.*;





import piotrrucinski.Activity.ActivityName;


public abstract class YouthSupport {

	//a method to apply  youth support on a young adult, swapping covid-forbidden activities for new, recommended activities
	
	public static void ApplyYouthSupport(YoungAdult youngAdult) {

		youngAdult.setStage(2);
		List<Activity> temp = new ArrayList<Activity>();
		boolean activitySwapped = false;
		int mostPotentTrait = Arrays.stream(youngAdult.getPersonality()).max().getAsInt();
		int mostPotentTraitIndex = 0;

		//java has a horrible handling of primitives, thus a loop has been created to find the index of the first maximum element. Only this first element is taken into account.
		//Were there more such cases where I need to define some functionality, I would have created an abstract class "Methods"
		//and would have called the methods from there. As this is a single isolated case, I decided to write it here.
		for(int i = 0; i< youngAdult.getPersonality().length; i++) {
			if (youngAdult.getPersonality()[i] == mostPotentTrait) {
				mostPotentTraitIndex = i;
				break;

			}

		}

		for(Activity activities : youngAdult.getActivities()) {											//iterating through the entire list of activities
			activitySwapped = false;																	//to find activities affected by COVID. Then, depending on what is the most potent
			//personality trait, swap them with a suggested activity


			if(activities.getActivityName() == ActivityName.DONOTHINGSPORTSWISE) {	
				switch(mostPotentTraitIndex) {
				//while switches are elegant, this is obviously not the best way to do this, albeit most intuitive.
				//Doing recommendations this way is not scalable at all and a better way would have to be implemented.
				case 0, 1:
					temp.add(new Activity (ActivityName.DOYOGA, activities.getStartHour(), activities.getEndHour()));
				break;

				case 2:
					temp.add(new Activity (ActivityName.JOG, activities.getStartHour(), activities.getEndHour()));
					break;

				case 3,4:
					temp.add(new Activity (ActivityName.GOTOOUTDOORGYM, activities.getStartHour(), activities.getEndHour()));
				}

				activitySwapped = true;
				continue;
			}
			else if(activities.getActivityName() == ActivityName.DONOTHINGSOCIALIZATIONWISE) {
				switch(mostPotentTraitIndex) {

				case 0:
					temp.add(new Activity (ActivityName.STUDYONLINEWITHFRIENDS, activities.getStartHour(), activities.getEndHour()));

					break;
				case 1:
					temp.add(new Activity (ActivityName.DINNERWITHFLATMATES, activities.getStartHour(), activities.getEndHour()));
					break;

				case 2:
					temp.add(new Activity (ActivityName.PLAYONLINEVIDEOGAMES, activities.getStartHour(), activities.getEndHour()));
					break;

				case 3,4:
					temp.add(new Activity (ActivityName.VIDEOCALLFRIENDS, activities.getStartHour(), activities.getEndHour()));
				break;
				}
				activitySwapped = true;
				continue;
			}
			else if(activities.getActivityName() == ActivityName.DONOTHINGENTERTAINMENTWISE) {
				switch(mostPotentTraitIndex) {

				case 0, 1:
					temp.add(new Activity (ActivityName.PLAYOFFLINEVIDEOGAMES, activities.getStartHour(), activities.getEndHour()));
				break;

				case 2,3:
					temp.add(new Activity (ActivityName.MAKENEWFOOD, activities.getStartHour(), activities.getEndHour()));
				break;

				case 4:
					temp.add(new Activity (ActivityName.PLAYBOARDGAMES, activities.getStartHour(), activities.getEndHour()));
				}
				activitySwapped = true;
				continue;

			}




			if(activitySwapped == false) {
				temp.add(activities);
			}

		}
		youngAdult.setActivities(temp);


	}

}
