package com.openkoda.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class FnolSubmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String fullName;
    public String policyNumber;
    public String email;
    public String primaryPhone;

    public LocalDate lossDate;
    public LocalTime lossTime;
    @Column(length = 2000)
    public String eventDescription;

    public String vin;
    public String make;
    public String model;
    public Integer year;
    public String licensePlate;
    public String licenseState;

    public String driverLicenseNumber;
    public String driverLicenseState;
    public String injuryStatus;
    @Column(length = 1000)
    public String passengerRoster;

    public boolean hasInjuries;
    public boolean isCommercialUse;
    public boolean involvesMultipleVehicles;
    public String preferredLanguage;

    public boolean fraudAcknowledgement;
}
