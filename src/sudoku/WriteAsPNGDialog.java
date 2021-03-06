/*
 * Copyright (C) 2008-11  Bernhard Hobiger
 *
 * This file is part of HoDoKu.
 *
 * HoDoKu is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * HoDoKu is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with HoDoKu. If not, see <http://www.gnu.org/licenses/>.
 */

package sudoku;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

/**
 * 
 * @author hobiwan
 */
public class WriteAsPNGDialog extends javax.swing.JDialog {
    private File bildFile;
    private int aufl?sung;
    private double bildSize;
    private int einheit;
    private boolean ok = false;
    
    private JRadioButton[] einheiten;
    
    /** Creates new form WriteAsPNGDialog */
    public WriteAsPNGDialog(java.awt.Frame parent, boolean modal, File bildFile,
            double size, int aufl?sung, int einheit) {
        super(parent, modal);
        initComponents();
        
        this.aufl?sung = aufl?sung;
        this.bildSize = size;
        this.einheit = einheit;
        this.bildFile = bildFile;
        
        einheiten = new JRadioButton[3];
        einheiten[0] = mmRadioButton;
        einheiten[1] = inchRadioButton;
        einheiten[2] = pixelRadioButton;
        
        if (bildFile != null) {
            dateiNameTextField.setText(bildFile.getAbsolutePath());
            dateiNameTextField.setCaretPosition(dateiNameTextField.getText().length());
        }
        aufl?sungTextField.setText(Integer.toString(aufl?sung));
        gr??eTextField.setText(Double.toString(size));
        einheiten[einheit].setSelected(true);
        
        getRootPane().setDefaultButton(bildSpeichernButton);
        KeyStroke escapeKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false);
        Action escapeAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible( false );
            }
        };
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(escapeKeyStroke, "ESCAPE");
        getRootPane().getActionMap().put("ESCAPE", escapeAction);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        einheitButtonGroup = new javax.swing.ButtonGroup();
        gr??ePanel = new javax.swing.JPanel();
        gr??eLabel = new javax.swing.JLabel();
        aufl?sungLabel = new javax.swing.JLabel();
        gr??eTextField = new javax.swing.JTextField();
        aufl?sungTextField = new javax.swing.JTextField();
        einheitPanel = new javax.swing.JPanel();
        mmRadioButton = new javax.swing.JRadioButton();
        inchRadioButton = new javax.swing.JRadioButton();
        pixelRadioButton = new javax.swing.JRadioButton();
        dateiNameLabel = new javax.swing.JLabel();
        dateiNameTextField = new javax.swing.JTextField();
        durchsuchenButton = new javax.swing.JButton();
        bildSpeichernButton = new javax.swing.JButton();
        abbrechenButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog"); // NOI18N
        setTitle(bundle.getString("WriteAsPNGDialog.title")); // NOI18N

        gr??ePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("WriteAsPNGDialog.gr??ePanel.border.title"))); // NOI18N

        gr??eLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.gr??eLabel.mnemonic").charAt(0));
        gr??eLabel.setLabelFor(gr??eTextField);
        gr??eLabel.setText(bundle.getString("WriteAsPNGDialog.gr??eLabel.text")); // NOI18N

        aufl?sungLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.aufl?sungLabel.mnemonic").charAt(0));
        aufl?sungLabel.setLabelFor(aufl?sungTextField);
        aufl?sungLabel.setText(bundle.getString("WriteAsPNGDialog.aufl?sungLabel.text")); // NOI18N

        javax.swing.GroupLayout gr??ePanelLayout = new javax.swing.GroupLayout(gr??ePanel);
        gr??ePanel.setLayout(gr??ePanelLayout);
        gr??ePanelLayout.setHorizontalGroup(
            gr??ePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gr??ePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gr??ePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gr??eLabel)
                    .addComponent(aufl?sungLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gr??ePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aufl?sungTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(gr??eTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap())
        );
        gr??ePanelLayout.setVerticalGroup(
            gr??ePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gr??ePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gr??ePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(gr??eLabel)
                    .addComponent(gr??eTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gr??ePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(aufl?sungLabel)
                    .addComponent(aufl?sungTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        einheitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("WriteAsPNGDialog.einheitPanel.border.title"))); // NOI18N

        einheitButtonGroup.add(mmRadioButton);
        mmRadioButton.setMnemonic(java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.mmRadioButton.mnemonic").charAt(0));
        mmRadioButton.setSelected(true);
        mmRadioButton.setText(bundle.getString("WriteAsPNGDialog.mmRadioButton.text")); // NOI18N
        mmRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        mmRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        einheitButtonGroup.add(inchRadioButton);
        inchRadioButton.setMnemonic(java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.inchRadioButton.mnemonic").charAt(0));
        inchRadioButton.setText(bundle.getString("WriteAsPNGDialog.inchRadioButton.text")); // NOI18N
        inchRadioButton.setToolTipText(bundle.getString("WriteAsPNGDialog.inchRadioButton.toolTipText")); // NOI18N
        inchRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        inchRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        einheitButtonGroup.add(pixelRadioButton);
        pixelRadioButton.setMnemonic(java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.pixelRadioButton.mnemonic").charAt(0));
        pixelRadioButton.setText(bundle.getString("WriteAsPNGDialog.pixelRadioButton.text")); // NOI18N
        pixelRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        pixelRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout einheitPanelLayout = new javax.swing.GroupLayout(einheitPanel);
        einheitPanel.setLayout(einheitPanelLayout);
        einheitPanelLayout.setHorizontalGroup(
            einheitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einheitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(einheitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mmRadioButton)
                    .addComponent(inchRadioButton)
                    .addComponent(pixelRadioButton))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        einheitPanelLayout.setVerticalGroup(
            einheitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einheitPanelLayout.createSequentialGroup()
                .addComponent(mmRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inchRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pixelRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dateiNameLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.dateiNameLabel.mnemonic").charAt(0));
        dateiNameLabel.setLabelFor(dateiNameTextField);
        dateiNameLabel.setText(bundle.getString("WriteAsPNGDialog.dateiNameLabel.text")); // NOI18N

        durchsuchenButton.setMnemonic('.');
        durchsuchenButton.setText("..."); // NOI18N
        durchsuchenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durchsuchenButtonActionPerformed(evt);
            }
        });

        bildSpeichernButton.setMnemonic(java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.bildSpeichernButton.mnemonic").charAt(0));
        bildSpeichernButton.setText(bundle.getString("WriteAsPNGDialog.bildSpeichernButton.text")); // NOI18N
        bildSpeichernButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bildSpeichernButtonActionPerformed(evt);
            }
        });

        abbrechenButton.setMnemonic(java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.abbrechenButton.mnemonic").charAt(0));
        abbrechenButton.setText(bundle.getString("WriteAsPNGDialog.abbrechenButton.text")); // NOI18N
        abbrechenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abbrechenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gr??ePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(einheitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateiNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateiNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(durchsuchenButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bildSpeichernButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abbrechenButton)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {abbrechenButton, bildSpeichernButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(gr??ePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(einheitPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateiNameLabel)
                    .addComponent(durchsuchenButton)
                    .addComponent(dateiNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bildSpeichernButton)
                    .addComponent(abbrechenButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void bildSpeichernButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bildSpeichernButtonActionPerformed
        String fileName = dateiNameTextField.getText();
        if (fileName.length() > 0) {
            try {
                bildFile = new File(fileName);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.invalid_filename"), 
                        java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.error"),
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (bildFile == null) {
            durchsuchenButtonActionPerformed(null);
        }
        if (bildFile == null) {
            return;
        }
        try {
            aufl?sung = Integer.parseInt(aufl?sungTextField.getText());
            bildSize = Double.parseDouble(gr??eTextField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.invalid_input_format"), 
                    java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.error"),
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (int i = 0; i < einheiten.length; i++) {
            if (einheiten[i].isSelected()) {
                einheit = i;
                break;
            }
        }
        ok = true;
        setVisible(false);
    }//GEN-LAST:event_bildSpeichernButtonActionPerformed
    
    private void durchsuchenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durchsuchenButtonActionPerformed
        JFileChooser chooser = new JFileChooser(getBildFile());
        chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) return true;
                String[] parts = f.getName().split("\\.");
                if (parts.length > 1) {
                    String ext = parts[parts.length - 1];
                    if (ext.equalsIgnoreCase("png"))
                        return true;
                }
                return false;
            }
            @Override
            public String getDescription() {
                return "*.png " + java.util.ResourceBundle.getBundle("intl/WriteAsPNGDialog").getString("WriteAsPNGDialog.files");
            }
        });
        
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            bildFile = chooser.getSelectedFile();
            String name = getBildFile().getAbsolutePath();
            if (! name.toLowerCase().endsWith(".png")) {
                name += ".png";
                bildFile = new File(name);
            }
            dateiNameTextField.setText(getBildFile().getAbsolutePath());
            dateiNameTextField.setCaretPosition(dateiNameTextField.getText().length());
        }
        bildSpeichernButton.requestFocusInWindow();
    }//GEN-LAST:event_durchsuchenButtonActionPerformed
    
    private void abbrechenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abbrechenButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_abbrechenButtonActionPerformed
    
    public File getBildFile() {
        return bildFile;
    }
    
    public int getAufl?sung() {
        return aufl?sung;
    }
    
    public double getBildSize() {
        return bildSize;
    }
    
    public int getEinheit() {
        return einheit;
    }
    
    public boolean isOk() {
        return ok;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WriteAsPNGDialog(new javax.swing.JFrame(), true, null, 0, 0, 0).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abbrechenButton;
    private javax.swing.JLabel aufl?sungLabel;
    private javax.swing.JTextField aufl?sungTextField;
    private javax.swing.JButton bildSpeichernButton;
    private javax.swing.JLabel dateiNameLabel;
    private javax.swing.JTextField dateiNameTextField;
    private javax.swing.JButton durchsuchenButton;
    private javax.swing.ButtonGroup einheitButtonGroup;
    private javax.swing.JPanel einheitPanel;
    private javax.swing.JLabel gr??eLabel;
    private javax.swing.JPanel gr??ePanel;
    private javax.swing.JTextField gr??eTextField;
    private javax.swing.JRadioButton inchRadioButton;
    private javax.swing.JRadioButton mmRadioButton;
    private javax.swing.JRadioButton pixelRadioButton;
    // End of variables declaration//GEN-END:variables
    
}
