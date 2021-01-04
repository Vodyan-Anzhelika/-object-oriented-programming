public class  ScedleTimeAtAppointmentProxy implements AppointmentSchedule {
    private AppointmentSchedule appointmentSchedule = new ScedleTimeAtAppointment();
    private String[] scheduleCache = null;

    @Override
    public String[] getSchedule() {
        if(scheduleCache == null) {
            scheduleCache =appointmentSchedule.getSchedule();
        }
        return scheduleCache;
    }

    @Override
    public String getBeginningOfAppointment(String AppointmentN) {
        if(scheduleCache == null) {
            scheduleCache = appointmentSchedule.getSchedule();
        }
        for(int i = 0; i < scheduleCache.length; i++) {
            if(scheduleCache[i].startsWith(AppointmentN+";")) return scheduleCache[i];
        }
        return "";
    }

    public void clearCache() {
        appointmentSchedule = null;
    }
}
