/*
 * Copyright (C) 2008/09/10  Bernhard Hobiger
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

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author  Bernhard Hobiger
 */
public class SplitPanel extends javax.swing.JPanel {
    private SudokuPanel sudokuPanel;
    private Component rightComponent;
    
    /** Creates new form SplitPanel */
    public SplitPanel() {
        initComponents();
        splitPane.getActionMap().getParent().remove("startResize");
        splitPane.getActionMap().getParent().remove("toggleFocus");
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        splitPane.setDividerLocation(800);
        splitPane.setContinuousLayout(true);
        splitPane.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        adjustDividerBar();
    }//GEN-LAST:event_formComponentResized
    
    /**
     * Wird aufgerufen, wenn von der "Nur-Sudoku" auf die "Split-Pane"-Ansicht
     * umgeschaltet wird. Es wird versucht, das Sudoku in der Gr��e zu erhalten
     * (preferredSize wird auf aktuelle Gr��e gesetzt, die Breite kann dabei
     * verringert werden, wenn Platz ist).<br />
     * Die aufrufende Funktion ruft anschlie�end pack() auf.
     */
    public void setSplitPane(SudokuPanel sudokuPanel, JPanel rightPanel) {
        Dimension preferredSize;
        int height = sudokuPanel.getHeight();
        int width = sudokuPanel.getWidth();
        if (height >= width) {
            preferredSize = new Dimension(height, width);
        } else {
            preferredSize = new Dimension(height, height);
        }
        sudokuPanel.setPreferredSize(preferredSize);
        this.sudokuPanel = sudokuPanel;
        splitPane.setLeftComponent(sudokuPanel);
        
        setRight(rightPanel);
        
        adjustDividerBar();
    }
    
    public void setRight(Component newRightComponent) {
        this.rightComponent = newRightComponent;
        //splitPane.setRightComponent(new JScrollPane(rightComponent));
        splitPane.setRightComponent(newRightComponent);
        adjustDividerBar();
    }
    
    /**
     * Checks whether the SplitPane has a right component set.
     * 
     * @return
     */
    public boolean hasRight() {
        return splitPane.getRightComponent() != null;
    }
    
    /**
     * Es wird versucht, das Sudoku so gut wie m�glich einzupassen, wobei die Breite
     * des Sudokus nicht �ber 80% der Gesamtbreite liegen darf.
     *
     *2 F�lle:
     *   width > height: width wird auf height gesetzt
     *   height > width: width wird auf min(height, maxWidth) gesetzt
     */
    private void adjustDividerBar() {
        //if (sudokuPanel != null && rightComponent != null) {
        if (sudokuPanel != null) {
            int height = sudokuPanel.getHeight();
            int maxWidth = (int)(getWidth() * 0.8);
            int pos = 0;
            pos = height > maxWidth ? maxWidth : height;
            splitPane.setDividerLocation(pos);
        }
    }
    
    public int getDividerLocation() {
        return splitPane.getDividerLocation();
    }
    
    public void setDividerLocation( int value) {
        splitPane.setDividerLocation(value);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
    
}
