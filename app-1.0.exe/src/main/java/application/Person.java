package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);

    }

    //returns object value
    public StringProperty firstNameProperty(){
        return firstName;
    }

}
