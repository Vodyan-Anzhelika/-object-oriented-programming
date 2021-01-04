public class DisplaySchedule {
    private AppointmentSchedule appointmentSchedule = new ScedleTimeAtAppointmentProxy();



    public void printTimetable() {
        String[] timetable = appointmentSchedule.getSchedule();
        String[] tmpArr;
        System.out.println("Запись№\tКонсультация\tВид деятельности\t\tВремя начала\tВремя конца\t");
        for(int i = 0; i < timetable.length; i++) {
            tmpArr = timetable[i].split(";");
            System.out.printf("%s\t\t%s\t\t\t%s\t\t%s\t\t\t\t%s\n", tmpArr[0], tmpArr[1], tmpArr[2], tmpArr[3], tmpArr[4]);

        }

    }
}