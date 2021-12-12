package edu.neu.csye6200.model;

public class Immunization {

    private long immunizationId;
    private String immunizationName;
    private long studentId;
    private long dose_1_id;
    private String dose_1_date;
    private long dose_2_id;
    private String dose_2_date;
    private long dose_3_id;
    private String dose_3_date;
    private long dose_4_id;
    private String dose_4_date;

    public long getImmunizationId() {
        return immunizationId;
    }

    public void setImmunizationId(long immunizationId) {
        this.immunizationId = immunizationId;
    }

    public String getImmunizationName() {
        return immunizationName;
    }

    public void setImmunizationName(String immunizationName) {
        this.immunizationName = immunizationName;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getDose_1_id() {
        return dose_1_id;
    }

    public void setDose_1_id(long dose_1_id) {
        this.dose_1_id = dose_1_id;
    }

    public String getDose_1_date() {
        return dose_1_date;
    }

    public void setDose_1_date(String dose_1_date) {
        this.dose_1_date = dose_1_date;
    }

    public long getDose_2_id() {
        return dose_2_id;
    }

    public void setDose_2_id(long dose_2_id) {
        this.dose_2_id = dose_2_id;
    }

    public String getDose_2_date() {
        return dose_2_date;
    }

    public void setDose_2_date(String dose_2_date) {
        this.dose_2_date = dose_2_date;
    }

    public long getDose_3_id() {
        return dose_3_id;
    }

    public void setDose_3_id(long dose_3_id) {
        this.dose_3_id = dose_3_id;
    }

    public String getDose_3_date() {
        return dose_3_date;
    }

    public void setDose_3_date(String dose_3_date) {
        this.dose_3_date = dose_3_date;
    }

    public long getDose_4_id() {
        return dose_4_id;
    }

    public void setDose_4_id(long dose_4_id) {
        this.dose_4_id = dose_4_id;
    }

    public String getDose_4_date() {
        return dose_4_date;
    }

    public void setDose_4_date(String dose_4_date) {
        this.dose_4_date = dose_4_date;
    }
}
