package piotrrucinski;

import piotrrucinski.Activity.ActivityName;
import piotrrucinski.Person.Gender;
import java.time.LocalDate;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		int robertsPersonality[] = {1, 5, 4, 3, 1};
		int mumsPersonality [] = {1, 2, 3, 4, 5};
		int dadsPersonality [] = {5, 4, 3, 2, 1};
		int mariesPersonality[] = {5, 2, 3, 1, 4};
		
		List<Activity> mariesActivities = new ArrayList<Activity>();		//hardcoded list of activities with a lot of bug potential - but works for POC
		mariesActivities.add(new Activity (ActivityName.ATTENDCLASS, 8, 9));
		mariesActivities.add(new Activity (ActivityName.WALK, 9, 10));
		mariesActivities.add(new Activity (ActivityName.ATTENDCLASS, 10, 13));
		mariesActivities.add(new Activity (ActivityName.PLAYTEAMSPORT, 13, 14));
		mariesActivities.add(new Activity (ActivityName.MEETFRIENDS, 14, 16));
		mariesActivities.add(new Activity (ActivityName.VOLUNTEER, 16, 18));
		mariesActivities.add(new Activity (ActivityName.DINNERWITHFLATMATES, 18, 19));
		mariesActivities.add(new Activity (ActivityName.DOHOMEWORK, 19, 20));
		mariesActivities.add(new Activity (ActivityName.WATCHNETFLIX, 20, 24));
		
		List<Activity> robertsActivities = new ArrayList<Activity>();
		
		robertsActivities.add(new Activity (ActivityName.ATTENDCLASS, 8, 15));
		robertsActivities.add(new Activity (ActivityName.DINNERWITHFAMILY, 15, 16));
		robertsActivities.add(new Activity (ActivityName.GOTOGYM, 16, 18));
		robertsActivities.add(new Activity (ActivityName.DOHOMEWORK, 18, 20));
		
		robertsActivities.add(new Activity (ActivityName.PLAYOFFLINEVIDEOGAMES, 20, 23));
		
		
		
		
		
		
		YoungAdult MarieLee = new YoungAdult("Marie", "Lee",LocalDate.of(2000, 05, 05), Gender.FEMALE, "0125592523", mariesPersonality, mariesActivities);
		YoungAdult RobertLee = new YoungAdult("Robert", "Lee", LocalDate.of(2003, 01, 01), Gender.MALE, "124126841", robertsPersonality, robertsActivities);
		Adult Mum = new Adult("Rene", "Lee", LocalDate.of(1969,10,10), Gender.FEMALE, "12512512512521", mumsPersonality);
		Adult Dad = new Adult("Robbie", "Lee", LocalDate.of(1982,11,11), Gender.MALE, "1252112512521", dadsPersonality);
		Person[] robertsDinner = {Mum, Dad};
		robertsActivities.get(1).setParticipants(robertsDinner);
		
		//System.out.println(MarieLee.getFirstName());
		//MarieLee.setPrivacyMode(false, 2);
		MarieLee.setPrivacyMode(false, 123);
		//System.out.println(MarieLee.getFirstName());
		//System.out.println(MarieLee.CalculateFeelings());
		MarieLee.displayFeelings(3, MarieLee.calculateFeelings(MarieLee.getActivities()));
		RobertLee.displayFeelings(4, RobertLee.calculateFeelings(RobertLee.getActivities()));
		//System.out.println(MarieLee.getActivities());
		COVID.ApplyLockdown(MarieLee);
		COVID.ApplyLockdown(RobertLee);
		//System.out.println(MarieLee.getActivities());
		MarieLee.displayFeelings(3, MarieLee.calculateFeelings(MarieLee.getActivities()));
		RobertLee.displayFeelings(4, RobertLee.calculateFeelings(RobertLee.getActivities()));
		YouthSupport.ApplyYouthSupport(MarieLee);
		YouthSupport.ApplyYouthSupport(RobertLee);
		//System.out.println(MarieLee.getActivities());
		MarieLee.displayFeelings(3, MarieLee.calculateFeelings(MarieLee.getActivities()));
		RobertLee.displayFeelings(4, RobertLee.calculateFeelings(RobertLee.getActivities()));
		
		//Comment - Robert's activities haven't been affected much by COVID, his daily routine is already causing him to feel negative feelings.
		//In that case, Youth Support as a programme recommending activities to be undertaken instead of covid doesn't help much because it wasn't designed
		//to deal with such cases.
		
		
	}

}
