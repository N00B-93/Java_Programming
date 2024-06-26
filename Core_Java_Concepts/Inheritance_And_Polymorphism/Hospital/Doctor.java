package Inheritance_And_Polymorphism.Hospital;

public class Doctor extends Person
{
    /**
     * Instantiates a new Doctor Object.
     * @param first The Doctor's first name.
     * @param last The Doctor's last name.
     * @param speciality The Doctor's speciality.
     */
    public Doctor(String first, String last, String speciality)
    {
        super(first, last);
        this.speciality = speciality;
    }

    // A Doctor's speciality.
    private String speciality;

    /**
     * This returns a Doctor's speciality.
     *
     * @return A Doctor's speciality.
     */
    public String getSpeciality()
    {
        return speciality;
    }

    /**
     * Sets a Doctor's speciality to the specified value.
     *
     * @param speciality The Doctor's speciality.
     */
    public void setSpeciality(String speciality)
    {
        this.speciality = speciality;
    }

    /**
     * This returns a String description of a Doctor.
     *
     * @return String describing a Doctor.
     */
    @Override
    public String toString()
    {
        return "\n\t\tDoctor's Details\n" + "Full Name: " + super.toString() + "\nSpeciality: " + this.speciality + "\n";
    }
}
