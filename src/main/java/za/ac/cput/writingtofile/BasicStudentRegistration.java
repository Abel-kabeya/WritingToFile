/**
 *
 * @author Abel Kabeya
 */
package za.ac.cput.writingtofile;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BasicStudentRegistration extends JFrame implements ActionListener {

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

    private JPanel panelDOB;
    private JPanel panelNorth;
    private JPanel panelCenter;
    private JPanel panelSouth;

    public BasicStudentRegistration() {

        lblTitle = new JLabel("   Student Registration Form");
        lblSubTitle = new JLabel("   Fill out the form carefully for registration");

        panelNorth = new JPanel();
        lblStudentName = new JLabel("   Student Name");

        panelCenter = new JPanel();
        lblFirstName = new JLabel("   First Name");
        txtFirstName = new JTextField();

        lblMiddleName = new JLabel("   Middle Name");
        txtMiddleName = new JTextField();

        lblLastName = new JLabel("   Last Name");
        txtLastName = new JTextField();

        panelDOB = new JPanel();
        panelDOB.setLayout(new GridLayout(1, 4));
        lblDOB = new JLabel("   Birth Date");
        lblDay = new JLabel("   Day");
        txtDay = new JTextField(2);
        panelDOB.add(txtDay);

        lblMonth = new JLabel("   Month");
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        cboMonth = new JComboBox(months);
        panelDOB.add(cboMonth);
        lblYear = new JLabel("   Year");
        txtYear = new JTextField(4);
        panelDOB.add(txtYear);

        lblGender = new JLabel("   Gebder");
        String gender[] = {"Male", "Female"};
        cboGender = new JComboBox(gender);

        lblStudentEmail = new JLabel("   Student E-mail");
        txtStudentEmail = new JTextField();

        lblMobileNumber = new JLabel("   Mobile Number");
        txtMobileNumber = new JTextField();

        lblAlternateNumber = new JLabel("   Alternate Number");
        txtAlternateNumber = new JTextField();

        lblNationality = new JLabel("   Nationality");
        txtNationality = new JTextField();

        lblCourses = new JLabel("   Courses");
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

        panelNorth.setLayout(new GridLayout(3, 1));
        panelCenter.setLayout(new GridLayout(10, 2));
        panelSouth.setLayout(new GridLayout(1, 3));

        panelNorth.add(lblTitle);
        panelNorth.add(lblSubTitle);

        panelCenter.add(lblFirstName);
        panelCenter.add(txtFirstName);
        panelCenter.add(lblLastName);
        panelCenter.add(txtLastName);
        panelCenter.add(lblDOB);
        panelCenter.add(panelDOB);
        panelCenter.add(lblGender);
        panelCenter.add(cboGender);
        panelCenter.add(lblStudentEmail);
        panelCenter.add(txtStudentEmail);
        panelCenter.add(lblMobileNumber);
        panelCenter.add(txtMobileNumber);
        panelCenter.add(lblAlternateNumber);
        panelCenter.add(txtAlternateNumber);
        panelCenter.add(lblNationality);
        panelCenter.add(txtNationality);
        panelCenter.add(lblCourses);
        panelCenter.add(cboCourses);

        panelSouth.add(btnSave);
        panelSouth.add(btnReset);
        panelSouth.add(btnExit);
        
        btnSave.addActionListener(this);
        btnReset.addActionListener(this);
        btnExit.addActionListener(this);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
    
    public void writeToFile(){
    
        try{
            
            FileWriter fw = new FileWriter("StudentDetails.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write("===================================================================================================================================================================== Student Deatils =====\n");
            fw.write(String.format("%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\n","First Name","Last Name","Birth Day","Birth Month","Birth Year","Gender","Student E-mail","Mobile Number","Alternate Number","Nationality","Courses"));
           
            
            
           
                    String output = String.format("%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s",
                        txtFirstName.getText(),
                        txtLastName.getText(),
                        txtDay.getText(),
                        cboMonth.getSelectedItem(),
                        txtYear.getText(),
                        cboGender.getSelectedItem(),
                        txtStudentEmail.getText(),
                        txtMobileNumber.getText(),
                        txtAlternateNumber.getText(),
                        txtNationality.getText(),
                        cboCourses.getSelectedItem());
                fw.write(output + "\n");
                fw.write("============================================================================================================================================================================================\n");
                 fw.close();
            }catch (Exception e) {
            System.out.println(" Exception Error: " + e.getMessage());
            System.out.println(" Error occured when writing to file ");
        }
 
    }

    @Override
    public void actionPerformed(ActionEvent g) {
        if (g.getSource() == btnSave) {
            
            writeToFile();

            JOptionPane.showMessageDialog(null, "All your information has been saved, have a good day",
                    "Message", JOptionPane.INFORMATION_MESSAGE);
            //System.exit(0);

        }
    }

}
