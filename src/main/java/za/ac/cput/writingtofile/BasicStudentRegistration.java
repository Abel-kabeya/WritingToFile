/**
 *
 * @author Abel Kabeya
 */
package za.ac.cput.writingtofile;

import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BasicStudentRegistration {

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

    private JLabel lblCourses;
    private JComboBox cboCourses;
    
    private JButton btnSave;
    private JButton btnReset;
    private JButton btnExit;
    

    public BasicStudentRegistration() {

        lblTitle = new JLabel("Student Registration Form");
        lblSubTitle = new JLabel("Fill out the form carefully for registration");

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
        String months[] = {"January","February","March","April","May", "June", "July","August","September","October","November","December"};
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
        
        lblCourses = new JLabel("Courses");
        String courses[] = {"Agriculture and Veterinary","Applied and Pure Sciences","Architecture and Construction","Business and Management",
            "Computer Science and IT","Creative Arts and Design","Education and Trainning","Engineering","Health and Medicine",
            "Humanities","Law","MBA","Personal Care and Fitness","Social Studies and Media","Travel and Hospitality"};
        cboCourses = new JComboBox(courses);
        
        btnSave = new JButton("Save");
        btnReset = new JButton("Reset");
        btnExit = new JButton("Exit");
        
        

    }

}
