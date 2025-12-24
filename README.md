# ADVANCED_HOSPITAL_MANAGEMENT_SYSTEM
# 🏥 AI-Based Hospital Management & Token System (Java)

This is an advanced Hospital Management System built in **Java**, featuring an intelligent **AI Triage Engine**, **doctor-wise assignment**, **QR token generation**, **SMS alert simulation**, **file-based storage**, and a full **Java Swing GUI**.

It works like a real hospital OPD system by automatically analyzing symptoms, deciding priority levels, assigning doctors, generating QR tokens, and notifying patients.

---

## 🚀 Features

### 🤖 AI Triage System
- Automatically detects illness severity  
- Priority levels: **HIGH / MEDIUM / LOW**  
- Queue organized by priority  

### 👨‍⚕️ Doctor-wise Assignment
- Cardiology  
- General Physician  
- Orthopedic  
- Dermatology  
- Auto-detected based on symptoms  

### 📄 Permanent File Saving
- All patients stored in **patients.txt**  
- Reloaded automatically on next run  

### 🔳 QR Token Generator
- Creates a QR-like PNG image for each token  
- Saved as: `qr_<token>.png`

### 📩 SMS Alert Simulation
- Console-based SMS notification  
- Sent automatically when patient registers  

### 🖥 GUI Version (Java Swing)
- Clean & simple UI  
- Easy patient registration  
- Auto-token, priority detection, doctor assignment  
- Generates QR + saves to file + sends notification  

---

## 📂 Project Structure

---

## 🧪 How it Works

1. Enter patient name, age, and symptoms  
2. AI analyzes symptoms → assigns **Priority + Doctor**  
3. Token generated automatically  
4. QR image is created  
5. Patient saved permanently in file  
6. SMS-like notification printed  

---

## ▶ Running the Project

### Compile
## 🖥 Sample Output

========== Hospital Management System ==========
1. Add Patient
2. View Patients
3. Add Doctor
4. View Doctors
5. Book Appointment
6. Generate Bill
7. Exit
Enter your choice: 1

Enter Patient ID: 101

Enter Patient Name: Rahul Sharma

Enter Age: 35

Enter Disease: Fever

Patient added successfully!

-----------------------------------------------

Enter your choice: 2

Patient List:
ID: 101 | 
Name: Rahul Sharma | 
Age: 35 | 
Disease: Fever

-----------------------------------------------

Enter your choice: 7
Thank you for using Hospital Management System




