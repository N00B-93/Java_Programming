package Inheritance_And_Polymorphism.Hospital;

public class Bill
{
    // Attributes of a Bill.
    private double pharmacyCharges, doctorsFee, roomCharges;

    /**
     * Instantiates a new Bill Object.
     * @param doctorsFee The Doctor's fee.
     * @param pharmacyCharges The pharmacy charges.
     * @param roomCharges The room charges.
     */
    public Bill(double doctorsFee, double pharmacyCharges, double roomCharges)
    {
        this.doctorsFee = doctorsFee;
        this.pharmacyCharges = pharmacyCharges;
        this.roomCharges = roomCharges;
    }

    /**
     * This returns the pharmacy charges.
     *
     * @return The pharmacy charges.
     */
    public double getPharmacyCharges()
    {
        return pharmacyCharges;
    }

    /**
     * This sets the pharmacy charges to the specified value.
     *
     * @param pharmacyCharges The new pharmacy charges.
     */
    public void setPharmacyCharges(double pharmacyCharges)
    {
        this.pharmacyCharges = pharmacyCharges;
    }

    /**
     * This returns the Doctor's fee.
     *
     * @return The Doctor's fee.
     */
    public double getDoctorsFee()
    {
        return doctorsFee;
    }

    /**
     * This sets the Doctor's fee to the specified value.
     *
     * @param doctorsFee The new Doctor's fee.
     */
    public void setDoctorsFee(double doctorsFee)
    {
        this.doctorsFee = doctorsFee;
    }

    /**
     * This returns the room charges.
     *
     * @return The room charges.
     */
    public double getRoomCharges()
    {
        return roomCharges;
    }

    /**
     * This sets the room charges to the specified value.
     *
     * @param roomCharges The new room charges.
     */
    public void setRoomCharges(double roomCharges)
    {
        this.roomCharges = roomCharges;
    }

    /**
     * Returns a String representation of a Bill Object.
     *
     * @return A String representation of a Bill Object.
     */
    @Override
    public String toString() {
        return "\t\tHospital Bill\t\t\n" + "Doctor's Fee: $" + this.getDoctorsFee() + "\n" + "Room Charges: $" + this.getRoomCharges()
        + "\n" + "Pharmacy Charges: $" + this.getPharmacyCharges();
    }
}
