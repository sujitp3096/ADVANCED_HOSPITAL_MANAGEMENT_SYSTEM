public class SmsSimulator {
    public static void sendSMS(String patientName, int token) {
        System.out.println("\n📩 SMS SENT TO PATIENT: ");
        System.out.println("Hello " + patientName + " , your token " + token +
                           " will be called shortly.Please be near OPD.\n");
    }
}

