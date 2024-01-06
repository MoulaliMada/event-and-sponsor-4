/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.eventmanagementsystem.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.eventmanagementsystem.model.Event;
import com.example.eventmanagementsystem.model.Sponsor;

public interface SponsorRepository {
    ArrayList<Sponsor> getSponsor();

    Sponsor addSponsor(Sponsor sponsor);

    Sponsor getSponsorById(int sponsorId);

    Sponsor updateSponsor(int sponsorId, Sponsor sponsor);

    void deleteSponsorById(int sponsorId);

    List<Event> getAllSponsorEvents(int sponsorId);

}