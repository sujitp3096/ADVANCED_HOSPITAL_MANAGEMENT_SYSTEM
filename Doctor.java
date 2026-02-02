public class Doctor {

    public static String assignDoctor(String symptom) {
        symptom = symptom.toLowerCase();

        if (symptom.contains("heart") || symptom.contains("chest"))
            return "Cardiologist";

        if (symptom.contains("fever") || symptom.contains("cold") || symptom.contains("infection"))
            return "General Physician";

        if (symptom.contains("bone") || symptom.contains("fracture"))
            return "Orthopedic";

        if (symptom.contains("skin") || symptom.contains("rash"))
            return "Dermatologist";

        return "General OPD";
    }
    public static String getPriority(String symptom) {
        symptom = symptom.toLowerCase();

        if (symptom.contains("accident") || symptom.contains("bleeding") ||
            symptom.contains("unconscious") || symptom.contains("chest"))
            return "HIGH";

        if (symptom.contains("fever") || symptom.contains("vomiting") ||
            symptom.contains("cold"))
            return "MEDIUM";

        return "LOW";
    }
}

