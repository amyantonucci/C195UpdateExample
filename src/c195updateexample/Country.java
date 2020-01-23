/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c195updateexample;

import javafx.beans.property.StringProperty;

/**
 *
 * @author amy.antonucci
 */
public class Country {
    StringProperty id;
    StringProperty country;

    public Country(StringProperty id, StringProperty country) {
        this.id = id;
        this.country = country;
    }

    public StringProperty getId() {
        return id;
    }

    public void setId(StringProperty id) {
        this.id = id;
    }

    public StringProperty getCountry() {
        return country;
    }

    public void setCountry(StringProperty country) {
        this.country = country;
    }

    
}
