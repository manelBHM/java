package ch.makery.address.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ch.makery.address.util.LocalDateAdapter;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Person.
 *
 * 
 */
public class Person {

    private final StringProperty Pr�nom;
    private final StringProperty Nom;
    private final IntegerProperty Age;
    private final IntegerProperty postalCode;
    private final StringProperty city;
    private final ObjectProperty<LocalDate> birthday;

    /**
     * Default constructor.
     */
    public Person() {
        this(null, null);
    }
    
    /**
     * Constructor with some initial data.
     * 
     * @param Pr�nom
     * @param Nom
     */
    public Person(String Pr�nom, String Nom) {
        this.Pr�nom = new SimpleStringProperty(Pr�nom);
        this.Nom = new SimpleStringProperty(Nom);
        
        // Some initial dummy data, just for convenient testing.
        this.Age = new SimpleIntegerProperty(25);
        this.postalCode = new SimpleIntegerProperty(1234);
        this.city = new SimpleStringProperty("some city");
        this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }
    
    public String getPr�nom() {
        return Pr�nom.get();
    }

    public void setPr�nom(String Pr�nom) {
        this.Pr�nom.set(Pr�nom);
    }
    
    public StringProperty Pr�nomProperty() {
        return Pr�nom;
    }

    public String getNom() {
        return Nom.get();
    }

    public void setNom(String Nom) {
        this.Nom.set(Nom);
    }
    
    public StringProperty NomProperty() {
        return Nom;
    }

    public int getAge() {
        return Age.get();
    }

    public void setAge(int string) {
        this.Age.set(string);
    }
    
    public IntegerProperty AgeProperty() {
        return Age;
    }

    public int getPostalCode() {
        return postalCode.get();
    }

    public void setPostalCode(int postalCode) {
        this.postalCode.set(postalCode);
    }
    
    public IntegerProperty postalCodeProperty() {
        return postalCode;
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }
    
    public StringProperty cityProperty() {
        return city;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() {
        return birthday.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }
    
    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }
}