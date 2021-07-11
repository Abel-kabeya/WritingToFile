/**
 *
 * @author Abel Kabeya
 */
package za.ac.cput.writingtofile;

import java.awt.BorderLayout;
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

    private JPanel panel1st;
    private JPanel panel2nd;

    private JPanel panelNorth;
    private JPanel panelCenter;
    private JPanel panelSouth;

    public BasicStudentRegistration() {

        lblTitle = new JLabel("Student Registration Form");
        lblSubTitle = new JLabel("Fill out the form carefully for registration");

        panel1st = new JPanel();
        panel1st.setLayout(new GridLayout(1, 3));
        panel2nd = new JPanel();
        panel2nd.setLayout(new GridLayout(1, 3));

        panelNorth = new JPanel();
        lblStudentName = new JLabel("Student Name");

        panelCenter = new JPanel();
        lblFirstName = new JLabel("First Name");
        txtFirstName = new JTextField();
        panel1st.add(txtFirstName);

        lblMiddleName = new JLabel("Middle Name");
        txtMiddleName = new JTextField();
        panel1st.add(txtMiddleName);

        lblLastName = new JLabel("Last Name");
        txtLastName = new JTextField();
        panel1st.add(txtLastName);

        lblDOB = new JLabel("Birth Date");
        lblDay = new JLabel("Day");
        txtDay = new JTextField();
        panel2nd.add(txtDay);

        lblMonth = new JLabel("Month");
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        cboMonth = new JComboBox(months);
        panel2nd.add(cboMonth);
        lblYear = new JLabel("Year");
        txtYear = new JTextField();
        panel2nd.add(txtYear);

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

        panelSouth = new JPanel();
        btnSave = new JButton("Save");
        btnReset = new JButton("Reset");
        btnExit = new JButton("Exit");

    }

    public void setGUI() {

        panelNorth.setLayout(new GridLayout(1, 1));
        panelCenter.setLayout(new GridLayout(4, 2));
        panelSouth.setLayout(new GridLayout(1, 3));

        panelNorth.add(lblTitle);

        //panelCenter.add(panel1st);
        panelCenter.add(panel2nd , cboGender);
        panelCenter.add(cboGender);
//        panelCenter.add(txtStudentEmail);
//        panelCenter.add(txtMobileNumber);
//        panelCenter.add(txtAlternateNumber);
//        panelCenter.add(txtNationality);
//        panelCenter.add(cboCourses);

        panelSouth.add(btnSave);
        panelSouth.add(btnReset);
        panelSouth.add(btnExit);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
