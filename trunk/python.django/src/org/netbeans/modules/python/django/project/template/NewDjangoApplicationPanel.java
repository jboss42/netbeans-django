package org.netbeans.modules.python.django.project.template;

import javax.swing.JButton;
import org.openide.awt.Mnemonics;


/**
 * @author Ravi Hingarajiya
 */
public class NewDjangoApplicationPanel extends javax.swing.JPanel {
    private JButton cancelButton = new JButton();
    private JButton okButton = new JButton();

    /** Creates new form PasswordPanel */
    public NewDjangoApplicationPanel(final String username) {
        initComponents();
       
        Mnemonics.setLocalizedText(cancelButton,"cancel");//NOI18N
        Mnemonics.setLocalizedText(okButton,"OK");//NOI18N
    }

    public JButton getOKButton() {
        return okButton;

    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public String getDjangoApplicationName() {
        return String.valueOf(DjangoApplicationField.getText());
    }

    @Override
    public void addNotify() {
        super.addNotify();
        DjangoApplicationField.requestFocusInWindow();
    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

 
        DjangoApplicationLabel = new javax.swing.JLabel();
        DjangoApplicationField = new javax.swing.JTextField();

 
        DjangoApplicationLabel.setLabelFor(DjangoApplicationField);
        org.openide.awt.Mnemonics.setLocalizedText(DjangoApplicationLabel,"new Django Application"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                .add(DjangoApplicationLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(DjangoApplicationField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(DjangoApplicationLabel)
                .add(DjangoApplicationField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    // Variables declaration - do not modify                     
    private javax.swing.JTextField DjangoApplicationField;
    private javax.swing.JLabel DjangoApplicationLabel;
   
    // End of variables declaration                   
}