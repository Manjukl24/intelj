package model;

public class Doctor {
    public double setFees;
    private Integer doctorId;
    private String doctorName;
    private String speciality;
    private double fees;
    private int ratings;
    private int experience;

    public Doctor(String doctorName, String speciality, double fees, int ratings, int experience) {
        this.doctorName = doctorName;
        this.speciality = speciality;
        this.fees = fees;
        this.ratings = ratings;
        this.experience = experience;
    }

    public Doctor(double setFees, Integer doctorId, String doctorName, String speciality, double fees, int ratings, int experience) {
        this.setFees = setFees;
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.speciality = speciality;
        this.fees = fees;
        this.ratings = ratings;
        this.experience = experience;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double setSetFees(double setFees) {
        this.setFees = setFees;


        public int setSetFees () {
            double setFees1 = setFees;
            return setFees1;
        }
    }

