package piotrrucinski;



import java.util.*;


import piotrrucinski.Activity.*;



public abstract class COVID {
	
	
	enum ForbiddenActivities {
		ATTENDCLASS,
		PLAYTEAMSPORT,
		GOTOGYM,
		GOSHOPPING,
		MEETFRIENDS,
		DINNERWITHFAMILY,
		VOLUNTEER,
		GOOUT
		}
	
		//a loop to apply a lockdown on a young adult, swapping his forbidden activities for dummy activities.
	public static void ApplyLockdown(YoungAdult youngAdult) {
		youngAdult.setStage(1);
		List<Activity> temp = new ArrayList<Activity>();
		
		boolean activitySwapped = false;
		
		for(Activity activities : youngAdult.getActivities()) {											//iterating through the entire list of activities
			activitySwapped = false;
			for(ForbiddenActivities forbiddenActivity : ForbiddenActivities.values()) {					//iterating through the forbidden activities list to see whether our activity is forbidden
																										//it is worth noting that this is a rather naive algorythm, with O(n^2). But since our lists
																										//are fairly short, it doesn't matter for this computation.
				
																										//first switching into online education
				if (activities.getActivityName() == ActivityName.ATTENDCLASS) {
					temp.add(new Activity (ActivityName.ATTENDONLINECLASS, activities.getStartHour(), activities.getEndHour()));
					activitySwapped = true;
					break;
				}
				if(forbiddenActivity.name() == activities.getActivityName().name()) {
					if(activities.getActivityType() == ActivityType.SPORTS) {							//if our activity is forbidden, we swap it with effectively a "Nothing" activity
						temp.add(new Activity (ActivityName.DONOTHINGSPORTSWISE, activities.getStartHour(), activities.getEndHour()));
						activitySwapped = true;
						break;
					}
					else if(activities.getActivityType() == ActivityType.SOCIALIZATION) {
						temp.add(new Activity (ActivityName.DONOTHINGSOCIALIZATIONWISE, activities.getStartHour(), activities.getEndHour()));
						activitySwapped = true;
						break;
					}
					else if(activities.getActivityType() == ActivityType.ENTERTAINMENT) {
						temp.add(new Activity (ActivityName.DONOTHINGENTERTAINMENTWISE, activities.getStartHour(), activities.getEndHour()));
						activitySwapped = true;
						break;

					}

				}
				
				}
			if(activitySwapped == false) {
				temp.add(activities);
			}

		}
		youngAdult.setActivities(temp);


	}

}

