package Entities;

import Abstracts.EntityService;
import org.apache.james.mime4j.dom.datetime.DateTime;

import java.util.Date;


public class Customer implements EntityService {

   private String firstName;
   private String lastName;
   private DateTime dateOfBirth;
   private String nationalityId;




    public Customer( String firstName, String lastName, DateTime dateOfBirth, String nationalityId) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
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

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
