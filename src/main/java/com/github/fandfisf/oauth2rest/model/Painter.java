package com.github.fandfisf.oauth2rest.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Prashant S Khanwale @ Suveda LLC  on 7/16/16.
 */
@Entity
@Table(name = "painters")
public class Painter {
    /**
     * Created by Prashant S Khanwale @ Suveda LLC  on 7/16/16.
     */
    @Id
    @Column(name = "painter_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "PSEUDONYM")
    private String pseudonym;
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Column(name = "date_of_death")
    @Temporal(TemporalType.DATE)
    private Date dateOfDeath;
    @Column(name = "picture")
    private String picture;
    @Column(name = "version")
    private int version;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Painter{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                ", birthDate=" + birthDate +
                ", dateOfDeath=" + dateOfDeath +
                ", picture='" + picture + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Painter painter = (Painter) o;

        if (version != painter.version) return false;
        if (id != null ? !id.equals(painter.id) : painter.id != null) return false;
        if (firstName != null ? !firstName.equals(painter.firstName) : painter.firstName != null) return false;
        if (lastName != null ? !lastName.equals(painter.lastName) : painter.lastName != null) return false;
        if (pseudonym != null ? !pseudonym.equals(painter.pseudonym) : painter.pseudonym != null) return false;
        if (birthDate != null ? !birthDate.equals(painter.birthDate) : painter.birthDate != null) return false;
        if (dateOfDeath != null ? !dateOfDeath.equals(painter.dateOfDeath) : painter.dateOfDeath != null) return false;
        return picture != null ? picture.equals(painter.picture) : painter.picture == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (pseudonym != null ? pseudonym.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (dateOfDeath != null ? dateOfDeath.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        result = 31 * result + version;
        return result;
    }

}
