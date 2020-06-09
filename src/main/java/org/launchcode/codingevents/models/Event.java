package org.launchcode.codingevents.models;

import java.util.Date;
import java.util.Objects;
import javax.validation.constraints.*;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters long.")
    private String name;

    @Size(max = 500, message = "Description too long.")
    private String description;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email.  Try again.")
    private String contactEmail;

    @NotBlank(message = "Location is required.")
    @Size(max = 100, message = "Location is too long.")
    private String location;

    //@NotEmpty(message = "YOU MUST ANSWER THIS QUESTION.")
    @AssertTrue(message = "YOU MUST CHECK THIS BOX.")
    private Boolean registrationRequired;

    @Positive(message = "Attendees must be a positive number")
    private int attendees;

    @Future(message = "Event date must be in the future")
    private Date date;

    public Event(String name, String description, String contactEmail, String location, Boolean registrationRequired, int attendees, Date date) {
        this();
        //System.out.println(this.id);
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registrationRequired = registrationRequired;
        this.attendees = attendees;
        this.date = date;
    }

    public Event() {
        this.id = nextId;
        //System.out.println(this.id);
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public Boolean getRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
