package com.driver;

import java.util.Date;

public class Email {

    private String emailId;
    private String password;
    private String sender;
    private Date date;
    private String message;

    public Email(String sender, Date date, String message) {
        this.sender = sender;
        this.date = date;
        this.message = message;
    }

    public Email(String emailId, String password, String sender, Date date, String message) {
        this.emailId = emailId;
        this.password = password;
        this.sender = sender;
        this.date = date;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Email(String emailId) {
        this.emailId = emailId;
        this.password = "Accio@123";
    }


    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter//65 to 90
        // 3. It contains at least one lowercase letter//97 to 122
        // 4. It contains at least one digit//48 – 57
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        //32–47 / 58–64 / 91–96 / 123–126
        boolean small = false;
        boolean capi = false;
        boolean digit = false;
        boolean special = false;
        if (oldPassword.equals(getPassword())) {

            if (newPassword.length() > 0 && newPassword.length() <= 8) {
                for (int i = 0; i < newPassword.length(); i++) {
                    if (newPassword.charAt(i) >= 65 && newPassword.charAt(i) <= 90) {
                        capi = true;
                    }
                }
                for (int i = 0; i < newPassword.length(); i++) {
                    if (newPassword.charAt(i) >= 97 && newPassword.charAt(i) <= 122) {
                        small = true;
                    }
                }
                for (int i = 0; i < newPassword.length(); i++) {
                    if (newPassword.charAt(i) >= 48 && newPassword.charAt(i) <= 57) {
                        digit = true;
                    }
                }
                for (int i = 0; i < newPassword.length(); i++) {
                    if ((newPassword.charAt(i) >= 32 && newPassword.charAt(i) <= 47) || (newPassword.charAt(i) >= 58 && newPassword.charAt(i) <= 64) || (newPassword.charAt(i) >= 91 && newPassword.charAt(i) <= 96) || (newPassword.charAt(i) >= 123 && newPassword.charAt(i) <= 126)) {
                        special = true;
                    }
                }
            }
            if (capi == true && small == true && digit == true && special == true) {
                setPassword(newPassword);
            }
            else  return;
        }
    }
}
