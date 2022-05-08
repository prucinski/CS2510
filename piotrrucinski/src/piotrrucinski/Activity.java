package piotrrucinski;


public class Activity {
	
	enum ActivityName{																				//By inverse I mean - the higher the score, the lower the multiplier
		ATTENDCLASS(Emotions.BORED, 2, Emotions.PRODUCTIVE, 0, ActivityType.EDUCATIONAL), 
		ATTENDONLINECLASS(Emotions.LONELY, 4, Emotions.BORED, 2, ActivityType.EDUCATIONAL), 
		DOHOMEWORK(Emotions.FRUSTRATED, 2, Emotions.PRODUCTIVE, 0, ActivityType.EDUCATIONAL),
		READBOOK(Emotions.BORED, 2, Emotions.HOPEFUL, 0, ActivityType.EDUCATIONAL),					
		LEARNANEWSKILL(Emotions.HOPEFUL, 2, Emotions.EXCITED, 3, ActivityType.EDUCATIONAL),
		DODISHES(Emotions.BORED, 2, Emotions.EXHAUSTED, 0, ActivityType.HOMECHORES),				
		CLEANHOME(Emotions.PRODUCTIVE, 0, Emotions.EXHAUSTED, 0, ActivityType.HOMECHORES),
		VACCUUM(Emotions.BORED, 2, Emotions.EXHAUSTED, 0, ActivityType.HOMECHORES),					
		MAKENEWFOOD(Emotions.HAPPY, 3, Emotions.CONFIDENT, 2, ActivityType.HOMECHORES),
		WALK(Emotions.HOPEFUL, 1, Emotions.EXCITED, 2, ActivityType.SPORTS),
		JOG(Emotions.HOPEFUL, 1, Emotions.EXCITED, 2,ActivityType.SPORTS),
		PLAYTEAMSPORT(Emotions.CONFIDENT, 4, Emotions.EXCITED, 3,ActivityType.SPORTS),
		DOYOGA(Emotions.CONFIDENT, 0, Emotions.HOPEFUL, 1, ActivityType.SPORTS),
		GOTOGYM(Emotions.CONFIDENT, 4, Emotions.EXCITED, 3,ActivityType.SPORTS),
		GOTOOUTDOORGYM(Emotions.HOPEFUL, 4, Emotions.EXCITED, 3,ActivityType.SPORTS),
		
		PLAYONLINEVIDEOGAMES(Emotions.CONTENT, 4, Emotions.EXCITED, 2, ActivityType.ENTERTAINMENT), 
		PLAYOFFLINEVIDEOGAMES(Emotions.CONTENT, 0, Emotions.EXCITED, 1, ActivityType.ENTERTAINMENT), 
		PLAYBOARDGAMES(Emotions.HAPPY, 4, Emotions.EXCITED, 4, ActivityType.ENTERTAINMENT),
		WATCHYOUTUBE(Emotions.BORED, 2, Emotions.CONTENT, 0, ActivityType.ENTERTAINMENT),	
		WATCHNETFLIX(Emotions.BORED, 2, Emotions.CONTENT, 1, ActivityType.ENTERTAINMENT),	
		GOSHOPPING(Emotions.EXCITED, 3, Emotions.HOPEFUL, 3, ActivityType.ENTERTAINMENT),
		MEETFRIENDS(Emotions.EXCITED, 4, Emotions.HAPPY, 4, ActivityType.SOCIALIZATION),
		VIDEOCALLFRIENDS(Emotions.EXCITED, 3, Emotions.HAPPY, 4, ActivityType.SOCIALIZATION),
		STUDYONLINEWITHFRIENDS(Emotions.PRODUCTIVE, 0, Emotions.HAPPY, 0, ActivityType.SOCIALIZATION),
		DINNERWITHFAMILY(Emotions.HOPEFUL, 4, Emotions.HAPPY, 1, ActivityType.SOCIALIZATION),
		DINNERWITHFLATMATES(Emotions.HOPEFUL, 1, Emotions.HAPPY, 4,ActivityType.SOCIALIZATION),
		VOLUNTEER(Emotions.HOPEFUL, 3, Emotions.EXCITED, 3, ActivityType.SOCIALIZATION),
		GOOUT(Emotions.EXCITED, 4, Emotions.HAPPY, 4, ActivityType.SOCIALIZATION),
		
		//COVID-related swap activities
		DONOTHINGSPORTSWISE(Emotions.SAD, 2, Emotions.ANXIOUS, 4, ActivityType.SPORTS),
		DONOTHINGSOCIALIZATIONWISE(Emotions.LONELY, 4, Emotions.ANXIOUS, 4, ActivityType.SOCIALIZATION), 
		DONOTHINGENTERTAINMENTWISE(Emotions.BORED, 3, Emotions.SAD, 2, ActivityType.ENTERTAINMENT);
		
		
		
		
		private ActivityType type;
		private Emotions emotion1;
		private int personalityScore1;		
		private Emotions emotion2;
		private int personalityScore2;			//personalityScore determines which trait plays part in determining the strength of the emotion (
												//value is an index of the array [conscientiousness, agreeableness, neuroticism, openness, extraversion
												//this is relevant when computing the emotions of a person by their dayplan
	
		private ActivityName(Emotions emotion1,int personalityScore1, Emotions emotion2,  int personalityScore2, ActivityType type) {
			this.emotion1 = emotion1;
			this.emotion2 = emotion2;
			this.personalityScore1 = personalityScore1;
			this.personalityScore2 = personalityScore2;
			this.type = type;
		}
		public  Emotions getEmotion1() {
			return emotion1;
		}
		public  Emotions getEmotion2() {
			return emotion2;
		}
		public int getPersonalityScore1() {
			return personalityScore1;
		}
		public int getPersonalityScore2() {
			return personalityScore2;
		}
		
	}
			
	enum ActivityType{EDUCATIONAL, HOMECHORES, SPORTS, ENTERTAINMENT, SOCIALIZATION}
	enum Emotions{HAPPY, SAD, BORED, EXCITED, FRUSTRATED, LONELY, ANXIOUS, HOPEFUL, HOPELESS, EXHAUSTED, CONFIDENT, PRODUCTIVE, CONTENT}
	
	public ActivityName activityName;
	public ActivityType activityType;
	private int startHour;		//simplified start hour and end hour, e. g 9 is representing 9:00, 13 is representing 13:00. A major simplification
	private int endHour;
	private int duration;
	public Person[] participants;
	public Activity(ActivityName activityName, int startHour, int endHour) {
		this.activityName = activityName;
		this.activityType = activityName.type;
		this.startHour = startHour;
		this.endHour = endHour;
		this.duration = this.endHour - this.startHour;
		
	}
	
	public String toString() {
		return activityName.toString();
	}
	public Person[] getParticipants() {
		return participants;
	}
	
	//this is undefined in the constructor
	public void setParticipants(Person[] participants) {
		this.participants = participants;
	}
	public ActivityName getActivityName() {
		return activityName;
	}
	public ActivityType getActivityType() {
		return activityType;
	}
	public int getStartHour() {
		return startHour;
	}
	public int getEndHour() {
		return endHour;
	}
	public int getDuration() {
		return duration;
	}

	
	
}
