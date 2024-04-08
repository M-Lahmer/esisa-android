package esisa.ac.ma.projet_natif.entities;

import java.util.Vector;

public class Contact {

    private String name;
    //update date of the contact
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //Contact can have one or more phones or emails
    private Vector<String> phones=new Vector<>();
    private Vector<String> emails=new Vector<>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Vector<String> getPhones() {
        return phones;
    }

    public void setPhones(Vector<String> phones) {
        this.phones = phones;
    }

    public Vector<String> getEmails() {
        return emails;
    }

    public void setEmails(Vector<String> emails) {
        this.emails = emails;
    }
}
