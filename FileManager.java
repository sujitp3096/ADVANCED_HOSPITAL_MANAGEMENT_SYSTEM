import java.io.*;
import java.util.ArrayList;

public class FileManager {

    static String FILE = "patients.txt";

    public static void savePatients(ArrayList<Patient> list) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Patient p : list)
                pw.println(p.toFileFormat());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Patient> loadPatients() {
        ArrayList<Patient> list = new ArrayList<>();

        File f = new File(FILE);
        if (!f.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] t = line.split(",");
                list.add(new Patient(
                        Integer.parseInt(t[0]),
                        t[1], Integer.parseInt(t[2]),
                        t[3], t[4], t[5]
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
