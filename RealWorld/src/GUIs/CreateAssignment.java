/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Design.Colors;
import firebase.Assignment;
import firebase.FullAssignmentData;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import org.jdesktop.swingx.JXFrame;
import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.SwingXUtilities;

/**
 *
 * @author Nathan Smith
 */
public class CreateAssignment extends JXPanel {

    /**
     * Creates new form CreateAssignment
     */
    String ID;

    /**
     *
     * @param courseID
     */
    public CreateAssignment(String courseID) {
        this.ID = courseID;
        initComponents();
        SimpleDateFormat newSimple = new SimpleDateFormat("MM/dd/yyyy");
        dueDatePicker.setFormats(newSimple);
        dueDatePicker.setDate(new Date());
        dueDatePicker.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        assignmentInfoTextBox = new org.jdesktop.swingx.JXTextArea();
        assignmentNameTextBox = new org.jdesktop.swingx.JXTextField();
        dueDatePicker = new org.jdesktop.swingx.JXDatePicker();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        createButton = new org.jdesktop.swingx.JXButton();

        setBackground(Colors.MainBack.color());

        assignmentInfoTextBox.setColumns(20);
        assignmentInfoTextBox.setLineWrap(true);
        assignmentInfoTextBox.setRows(5);
        assignmentInfoTextBox.setText("Optional: A introduction to the assignment  or comments for the students");
        jScrollPane1.setViewportView(assignmentInfoTextBox);

        assignmentNameTextBox.setText("New Assignment Name");
        assignmentNameTextBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dueDatePicker.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dueDatePicker.setFormats("MM/DD/YYYY");

        jXLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel1.setText("Assignment Name");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel1.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.RIGHT);

        jXLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel2.setText("Assignment Info");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel2.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.RIGHT);

        jXLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel3.setText("Due Date");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel3.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.RIGHT);

        createButton.setBackground(Colors.ButtonColorOrange.color());
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create");
        createButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dueDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(assignmentNameTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignmentNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dueDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

        SimpleDateFormat pickerFormat = new SimpleDateFormat("MM/dd/yyyy");
        String date = pickerFormat.format(dueDatePicker.getDate());
        Assignment newAssignment = new Assignment(date, UUID.randomUUID().toString(), assignmentInfoTextBox.getText(), assignmentNameTextBox.getText(), false);
        FullAssignmentData fullAssignment = new FullAssignmentData(newAssignment);
        fullAssignment.setCourseID(ID);
        JXFrame editingPane = new JXFrame();
        editingPane.setExtendedState(JXFrame.MAXIMIZED_BOTH);
        editingPane.setLayout(new FlowLayout(FlowLayout.CENTER));
        editingPane.setDefaultCloseOperation(JXFrame.DISPOSE_ON_CLOSE);
        NewAssignment newAssignmentPanel = new NewAssignment(fullAssignment, true);
        editingPane.add(newAssignmentPanel);
        editingPane.getContentPane().setBackground(Colors.BackgroundGray.color());
        editingPane.setVisible(true);
        JXFrame currentDialog = SwingXUtilities.getAncestor(JXFrame.class, this);
        currentDialog.dispose();

    }//GEN-LAST:event_createButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTextArea assignmentInfoTextBox;
    private org.jdesktop.swingx.JXTextField assignmentNameTextBox;
    private org.jdesktop.swingx.JXButton createButton;
    private org.jdesktop.swingx.JXDatePicker dueDatePicker;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    // End of variables declaration//GEN-END:variables
}
