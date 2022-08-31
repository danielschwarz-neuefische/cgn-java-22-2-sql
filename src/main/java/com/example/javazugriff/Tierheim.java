package com.example.javazugriff;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Tierheim {
    @Id
    public String id;
    public String name;
    public String adresse;
    public Boolean nimmtReptilienAuf;

}
