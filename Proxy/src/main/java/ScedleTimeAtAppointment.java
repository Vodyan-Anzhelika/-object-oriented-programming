import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScedleTimeAtAppointment implements AppointmentSchedule {

    @Override
    public String[] getSchedule() {
        ArrayList<String> list = new ArrayList<>();


        try {

            Scanner scanner = new Scanner(new FileReader(new File("scheduleAppointments.csv")));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error:  " + e);
        }
        return list.toArray(new String[list.size()]);
    }

    @Override
    public String getBeginningOfAppointment(String AppointmentN) {
        String[] schedule = getSchedule();
        for(int i = 0; i<schedule.length; i++) {
            if(schedule[i].startsWith(AppointmentN+";")) return schedule[i];
        }
        return "";
    }
}
