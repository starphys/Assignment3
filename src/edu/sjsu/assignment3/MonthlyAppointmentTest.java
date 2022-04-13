package edu.sjsu.assignment3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonthlyAppointmentTest {

    @Test
    void testOccursOn() {
        LocalDate startDate = LocalDate.parse("2022-01-27");
        LocalDate endDate = LocalDate.parse("2022-05-18");

        LocalDate testDate1 = LocalDate.parse("2022-01-27");
        LocalDate testDate2 = LocalDate.parse("2022-03-18");
        LocalDate testDate3 = LocalDate.parse("2022-05-27");

        Appointment appointment = new MonthlyAppointment("Meeting", startDate, endDate);

        Assertions.assertTrue(appointment.occursOn(testDate1));
        Assertions.assertFalse(appointment.occursOn(testDate2));
        Assertions.assertFalse(appointment.occursOn(testDate3));
    }
}