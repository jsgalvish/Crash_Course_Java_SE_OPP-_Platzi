package model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable {

    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getId() { return id; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() {  return doctor;  }
    public Date getDate() { return date; }
    public String getTime() {  return time;  }

    public void setId(int id) { this.id = id; }
    public void setPatient(Patient patient) {  this.patient = patient; }
    public void setDoctor(Doctor doctor) {   this.doctor = doctor; }
    public void setDate(Date date) { this.date = date; }
    public void setTime(String time) { this.time = time; }

    @Override
    public void schedule(Date date, String time) {
        this.date = date;
        this.time = time;
    }
}
