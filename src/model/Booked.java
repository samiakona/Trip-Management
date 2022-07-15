/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USer
 */
public class Booked {
    private String userEmail;
    private String userName;
    private int userPhone;
    private String hotelName;
    private String timeDuration;

    public Booked() {
    }

    public Booked(String userEmail, String userName, int userPhone, String hotelName, String timeDuration) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPhone = userPhone;
        this.hotelName = hotelName;
        this.timeDuration = timeDuration;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
    }

    @Override
    public String toString() {
        return "Booked{" + "userEmail=" + userEmail + ", userName=" + userName + ", userPhone=" + userPhone + ", hotelName=" + hotelName + ", timeDuration=" + timeDuration + '}';
    } 
    
}
