package edu.sjsu.assignment3;

import java.util.Comparator;

public class DesComparator implements Comparator<Appointment> {

    @Override
    public int compare(Appointment appointment1, Appointment appointment2) {
        if(appointment1.getDescription().equals(appointment2.getDescription())) {
            if(appointment1.getStartDate().equals(appointment2.getStartDate())) {
                if(appointment1.getEndDate().equals(appointment2.getEndDate())) {
                    return 0;
                }
                return appointment1.getEndDate().compareTo(appointment2.getEndDate());
            }
            return appointment1.getStartDate().compareTo(appointment2.getStartDate());
        }
        return appointment1.getDescription().compareTo(appointment2.getDescription());
    }
}
