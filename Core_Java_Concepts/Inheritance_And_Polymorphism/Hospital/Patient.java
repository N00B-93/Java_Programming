package Inheritance_And_Polymorphism.Hospital;

import java.util.Date;

/**
 * Represents a patient in a hospital.
 * Inherits from the Person class.
 */
public class Patient extends Person
{

    // Attributes of a Patient.
    private int patientID;
    private int age;
    private Date dateOfBirth;
    private Date dateAdmitted;
    private Date dateDischarged;
    private String attendingPhysicianName;
    private Bill patientBill;

    /**
     * Constructor for creating a Patient object.
     *
     * @param first                  The first name of the Patient.
     * @param last                   The last name of the Patient.
     * @param patientID              The ID of the Patient.
     * @param age                    The age of the Patient.
     * @param dateOfBirth            The date of birth of the Patient.
     * @param dateAdmitted           The date when the Patient was admitted to the hospital.
     * @param dateDischarged         The date when the Patient was discharged from the hospital.
     * @param attendingPhysicianName The name of the attending physician.
     * @param patientBill            The Bill of the Patient.
     */
    public Patient(String first, String last, int patientID, int age, Date dateOfBirth, Date dateAdmitted,
                   Date dateDischarged, String attendingPhysicianName, Bill patientBill)
    {
        super(first, last);
        this.patientID = patientID;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.dateAdmitted = dateAdmitted;
        this.dateDischarged = dateDischarged;
        this.attendingPhysicianName = attendingPhysicianName;
        this.patientBill = patientBill;
    }

    /**
     * Retrieves the ID of the Patient.
     *
     * @return The ID of the Patient.
     */
    public int getPatientID()
    {
        return this.patientID;
    }

    /**
     * Sets the ID of the Patient.
     *
     * @param patientID The ID of the Patient.
     */
    public void setPatientID(int patientID)
    {
        this.patientID = patientID;
    }

    /**
     * Retrieves the age of the Patient.
     *
     * @return The age of the Patient.
     */
    public int getAge()
    {
        return this.age;
    }

    /**
     * Sets the age of the Patient.
     *
     * @param age The age of the Patient.
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * Retrieves the date of birth of the Patient.
     *
     * @return The date of birth of the Patient.
     */
    public Date getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    /**
     * Sets the date of birth of the Patient.
     *
     * @param dateOfBirth The date of birth of the Patient.
     */
    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Retrieves the date when the Patient was admitted to the hospital.
     *
     * @return The date when the Patient was admitted to the hospital.
     */
    public Date getDateAdmitted()
    {
        return this.dateAdmitted;
    }

    /**
     * Sets the date when the Patient was admitted to the hospital.
     *
     * @param dateAdmitted The date when the Patient was admitted to the hospital.
     */
    public void setDateAdmitted(Date dateAdmitted)
    {
        this.dateAdmitted = dateAdmitted;
    }

    /**
     * Retrieves the date when the Patient was discharged from the hospital.
     *
     * @return The date when the Patient was discharged from the hospital.
     */
    public Date getDateDischarged()
    {
        return this.dateDischarged;
    }

    /**
     * Sets the date when the Patient was discharged from the hospital.
     *
     * @param dateDischarged The date when the Patient was discharged from the hospital.
     */
    public void setDateDischarged(Date dateDischarged)
    {
        this.dateDischarged = dateDischarged;
    }

    /**
     * Retrieves the name of the attending physician.
     *
     * @return The name of the attending physician.
     */
    public String getAttendingPhysicianName()
    {
        return this.attendingPhysicianName;
    }

    /**
     * Sets the name of the attending physician.
     *
     * @param attendingPhysicianName The name of the attending physician.
     */
    public void setAttendingPhysicianName(String attendingPhysicianName)
    {
        this.attendingPhysicianName = attendingPhysicianName;
    }

    /**
     * Retrieves the Bill of the Patient.
     *
     * @return A patient's Bill.
     */
    public Bill getPatientBill()
    {
        return patientBill;
    }

    /**
     * Sets the Patient's Bill to the specified value.
     *
     * @param patientBill The Patient's Bill.
     */
    public void setPatientBill(Bill patientBill)
    {
        this.patientBill = patientBill;
    }

    /**
     * Returns a string representation of the Patient object.
     *
     * @return A string representation of the Patient object.
     */
    @Override
    public String toString()
    {
        return "\n\t\tPatient Information\n" + "Full Name: " + super.toString() + "\n" + "Age: " + this.getAge() + "\n"
                + "Patient ID: " + this.getPatientID() + "\n"  + "Date Of Birth: " + this.getDateOfBirth() + "\n" +
                "Attending Physician: " + this.getAttendingPhysicianName() + "\n" + "Date Admitted: " + this.getDateAdmitted()
                + "\n" + "Date Discharged: " + this.getDateDischarged() + "\n" + patientBill.toString();
    }
}
