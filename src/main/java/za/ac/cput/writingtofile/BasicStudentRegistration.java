/**
 *
 * @author Abel Kabeya
 */
package za.ac.cput.writingtofile;

import java.awt.GridLayout;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BasicStudentRegistration extends JFrame {

    private JLabel lblTitle;
    private JLabel lblSubTitle;

    private JLabel lblStudentName;

    private JLabel lblFirstName;
    private JTextField txtFirstName;

    private JLabel lblMiddleName;
    private JTextField txtMiddleName;

    private JLabel lblLastName;
    private JTextField txtLastName;

    private JLabel lblDOB;
    private JLabel lblDay;
    private JTextField txtDay;
    private JLabel lblMonth;
    private JComboBox cboMonth;
    private JLabel lblYear;
    private JTextField txtYear;

    private JLabel lblGender;
    private JComboBox cboGender;

    private JLabel lblStudentEmail;
    private JTextField txtStudentEmail;

    private JLabel lblMobileNumber;
    private JTextField txtMobileNumber;

    private JLabel lblAlternateNumber;
    private JTextField txtAlternateNumber;

    private JLabel lblNationality;
    private JTextField txtNationality;

    private JLabel lblCourses;
    private JComboBox cboCourses;

    private JButton btnSave;
    private JButton btnReset;
    private JButton btnExit;

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;

    public BasicStudentRegistration() {

        lblTitle = new JLabel("Student Registration Form");
        lblSubTitle = new JLabel("Fill out the form carefully for registration");

        panel1 = new JPanel();
        panel2 = new JPanel();
        lblStudentName = new JLabel("Student Name");

        lblFirstName = new JLabel("First Name");
        txtFirstName = new JTextField();

        lblMiddleName = new JLabel("Middle Name");
        txtMiddleName = new JTextField();

        lblLastName = new JLabel("Last Name");
        txtLastName = new JTextField();

        lblDOB = new JLabel("Birth Date");
        lblDay = new JLabel("Day");
        txtDay = new JTextField();
        lblMonth = new JLabel("Month");
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        cboMonth = new JComboBox(months);
        lblYear = new JLabel("Year");
        txtYear = new JTextField();

        lblGender = new JLabel("Gebder");
        String gender[] = {"Male", "Female"};
        cboGender = new JComboBox(gender);

        lblStudentEmail = new JLabel("Student E-mail");
        txtStudentEmail = new JTextField();

        lblMobileNumber = new JLabel("Mobile Number");
        txtMobileNumber = new JTextField();

        lblAlternateNumber = new JLabel("Alternate Number");
        txtAlternateNumber = new JTextField();

        lblNationality = new JLabel("Nationality");
        txtNationality = new JTextField();

        lblCourses = new JLabel("Courses");
        String courses[] = {"Agriculture and Veterinary", "Applied and Pure Sciences", "Architecture and Construction", "Business and Management",
            "Computer Science and IT", "Creative Arts and Design", "Education and Trainning", "Engineering", "Health and Medicine",
            "Humanities", "Law", "MBA", "Personal Care and Fitness", "Social Studies and Media", "Travel and Hospitality"};
        cboCourses = new JComboBox(courses);

        btnSave = new JButton("Save");
        btnReset = new JButton("Reset");
        btnExit = new JButton("Exit");

    }
    
    public void setGUI(){
    
        panel1.setLayout(new GridLayout(1, 1));
        panel1.setLayout(new GridLayout(1, 3));
        
        panel1.add(lblStudentName);
        
        panel2.add(txtFirstName);
        panel2.add(txtMiddleName);
        panel2.add(txtLastName);
    
        this.add(panel1);
        this.add(panel2);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    
    
    }

}

class Run{

    
    public static void main(String[] args) {
        
        new BasicStudentRegistration().setGUI();
        
    }



}
