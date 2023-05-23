/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HP
 */
public class Booked_Appointments {
     private int id , appointment_id , user_id;
    private String status,doctor_commnet;

    public Booked_Appointments(int id, int appointment_id, int user_id,
                               String status, String doctor_commnet) {
        this.id = id;
        this.appointment_id = appointment_id;
        this.user_id = user_id;
        this.status = status;
        this.doctor_commnet = doctor_commnet;
    }

    public Booked_Appointments() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAppointment_id() {
        return appointment_id;
    }
    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDoctor_commnet() {
        return doctor_commnet;
    }
    public void setDoctor_commnet(String doctor_commnet) {
        this.doctor_commnet = doctor_commnet;
    }
}
