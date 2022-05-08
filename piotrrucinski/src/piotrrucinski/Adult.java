package piotrrucinski;

import java.time.LocalDate;

public class Adult extends Person {

	public Adult(String firstName, String lastName, LocalDate yearOfBirth, Gender gender, String mobileNumber,
			int[] personality) {
		super(firstName, lastName, yearOfBirth, gender, mobileNumber, personality);
		// This class is used only for initialization of family members/tutors of a young adult. It exclusively inherits from Person.
		//for this POC, the required yearOfBirth is not specified, but in the implementation it would be taken into account whether a person is over or under 24 to set their class.
	}

}
