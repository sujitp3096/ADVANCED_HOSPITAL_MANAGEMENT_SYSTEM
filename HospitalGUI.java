import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HospitalGUI extends JFrame {

    ArrayList<Patient> patients;
    int nextToken = 1;

    public HospitalGUI() {
        setTitle("Hospital AI Management System");
        setSize(500, 500);
        setLayout(new GridLayout(7, 1));

        patients = FileManager.loadPatients();
        if (!patients.isEmpty())
            nextToken = patients.get(patients.size() - 1).token + 1;

        JLabel title = new JLabel("AI Hospital Management System", SwingConstants.CENTER);
        add(title);

        JTextField nameField = new JTextField();
        add(new JLabel("Name:"));
        add(nameField);

        JTextField ageField = new JTextField();
        add(new JLabel("Age:"));
        add(ageField);

        JTextField symptomField = new JTextField();
        add(new JLabel("Symptom:"));
        add(symptomField);

        JButton registerBtn = new JButton("Register Patient");
        add(registerBtn);

        registerBtn.addActionListener(e -> {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String symptom = symptomField.getText();

            String priority = Doctor.getPriority(symptom);
            String doctor = Doctor.assignDoctor(symptom);

            Patient p = new Patient(nextToken, name, age, symptom, priority, doctor);
            patients.add(p);

            FileManager.savePatients(patients);

            QRGenerator.generateQR("TOKEN-" + nextToken, "qr_" + nextToken + ".png");

            SmsSimulator.sendSMS(name, nextToken);

            JOptionPane.showMessageDialog(this,
                    "Registration Successful!\n" +
                            "Token: " + nextToken + "\n" +
                            "Priority: " + priority + "\n" +
                            "Doctor: " + doctor);

            nextToken++;
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HospitalGUI();
    }
}
