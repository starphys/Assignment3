package edu.sjsu.assignment3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    @Test
    void compareToSort() {
        Appointment a1 = new OnetimeAppointment("Class starts", LocalDate.parse("2022-01-27"));
        Appointment a2 = new DailyAppointment("Class", LocalDate.parse("2022-01-27"),LocalDate.parse("2022-05-18") );
        Appointment a3 = new DailyAppointment("Assignments", LocalDate.parse("2022-02-16"),LocalDate.parse("2022-05-16") );
        Appointment a4 = new MonthlyAppointment("A meeting", LocalDate.parse("2022-01-27"),LocalDate.parse("2022-05-18") );
        Appointment a5 = new MonthlyAppointment("A meeting", LocalDate.parse("2022-02-16"),LocalDate.parse("2022-05-18") );

        Appointment[] appointments = {a1,a2,a3,a4,a5};

        Arrays.sort(appointments);

        Appointment[] expectedSortedApp = {a1,a4,a2,a3,a5};

        Assertions.assertArrayEquals(expectedSortedApp,appointments);
    }

    @Test
    void desComparatorSort() {
        Appointment a1 = new OnetimeAppointment("Class starts", LocalDate.parse("2022-01-27"));
        Appointment a2 = new DailyAppointment("Class", LocalDate.parse("2022-01-27"),LocalDate.parse("2022-05-18") );
        Appointment a3 = new DailyAppointment("Assignments", LocalDate.parse("2022-02-16"),LocalDate.parse("2022-05-16") );
        Appointment a4 = new MonthlyAppointment("A meeting", LocalDate.parse("2022-01-27"),LocalDate.parse("2022-05-18") );
        Appointment a5 = new MonthlyAppointment("A meeting", LocalDate.parse("2022-02-16"),LocalDate.parse("2022-05-18") );

        Appointment[] appointments = {a1,a2,a3,a4,a5};

        Arrays.sort(appointments, new DesComparator());

        Appointment[] expectedSortedApp = {a4,a5,a3,a2,a1};

        Assertions.assertArrayEquals(expectedSortedApp,appointments);
    }

    @Test
    void desComparatorSort2() {
        Appointment a1 = new OnetimeAppointment("Class starts", LocalDate.parse("2022-01-27"));
        Appointment a2 = new DailyAppointment("Class", LocalDate.parse("2022-01-27"),LocalDate.parse("2022-05-18") );
        Appointment a3 = new DailyAppointment("Assignments", LocalDate.parse("2022-02-16"),LocalDate.parse("2022-05-16") );
        Appointment a4 = new MonthlyAppointment("A meeting", LocalDate.parse("2022-01-27"),LocalDate.parse("2022-05-18") );
        Appointment a5 = new MonthlyAppointment("A meeting", LocalDate.parse("2022-02-16"),LocalDate.parse("2022-05-18") );

        Appointment[] appointments = {a5,a4,a3,a2,a1};

        Arrays.sort(appointments, new DesComparator());

        Appointment[] expectedSortedApp = {a4,a5,a3,a2,a1};

        Assertions.assertArrayEquals(expectedSortedApp,appointments);
    }
}