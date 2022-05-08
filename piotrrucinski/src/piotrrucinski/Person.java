package piotrrucinski;

import java.time.LocalDate;

public class Person {
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	enum Gender{MALE, FEMALE};
	
	private Gender gender;
	
	private String mobileNumber;
	private int[] personality;		//from 1 to 5, in order: [conscientiousness, agreeableness, neuroticism, openness, extraversion]
	private boolean privacyMode;        //determines whether data can be viewed or not
	
	//only one constructor allowed to limit possible bugs
	public Person(String firstName, String lastName, LocalDate yearOfBirth, Person.Gender gender, String mobileNumber, int[] personality) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = yearOfBirth;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.personality = personality;
		this.privacyMode = true;   //by default, privacy mode is ON
		
		
	}
	
	
	
	
	public String getFirstName() {
		if (privacyMode) {
			return "Sam";
		}
	
		return firstName;
	}
	public void setFirstName(String firstName) {
		if (privacyMode) {
		System.out.println("You do not have the permissions to edit that.");	
		
		}
		else{
			this.firstName = firstName;
		}
	}
	public String getLastName() {
		if (privacyMode) {
			return "Doe";
	}
		return lastName;
	}
	public void setLastName(String lastName) {
		if (privacyMode) {
			System.out.println("You do not have the permissions to edit that.");	
			
			}
		else{
			this.lastName = lastName;
			}
	}
	public LocalDate getYearOfBirth() {
		if (privacyMode) {
			return LocalDate.now();
	}
		return dateOfBirth;
	}
	public void setYearOfBirth(LocalDate yearOfBirth) {
		if (privacyMode) {
			
			System.out.println("You do not have the permissions to edit that.");	
			
			}
		else{
			this.dateOfBirth = yearOfBirth;
			}
	}
	public int getAge() {
		//no hiding of age here - this is relevant information
		return LocalDate.now().getYear() - dateOfBirth.getYear();
	}
	public String getMobileNumber() {
		if (privacyMode) {
		return "0123456789";
		}
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		if (privacyMode) {
			System.out.println("You do not have the permissions to edit that.");	
			
			}
		else{
			this.mobileNumber = mobileNumber;
			}
	}
	public int[] getPersonality() {
//no privacy mode for getPersonality() - personal data already hidden
		
		return personality;
	}
	public void setPersonality(int[] personality) {
		if (privacyMode) {
			System.out.println("You do not have the permissions to edit that.");	
			
			}
		else{
			this.personality = personality;
			}
	}
	public boolean getPrivacyMode() {
//no privacy mode for getPrivacyMode - would be pointless
		return privacyMode;
	}
	public void setPrivacyMode(boolean privacyMode, int password) {
		
	if (password == 123) {
			this.privacyMode = privacyMode;			//placeholder method for setting privacy mode to 0/1. This is just POC - privacy mode can be only changed with a password provided
													//having actual code written like this would be incredibly dangerous (with right password being inside an "if")
	}
	}

	//gender is irrelevant when hiding privacy
	public Gender getGender() {
		return gender;
	}
	
	
	
}
