/*
 * Copyright 2016 Alessandro Falappa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.alexfalappa.nbspringboot.templates.actuatorendpoints;

import javax.swing.JPanel;

import org.openide.WizardDescriptor;

import static com.github.alexfalappa.nbspringboot.templates.actuatorendpoints.ActEndpointWizardIterator.WIZ_SAMPLE_OPS;
import static com.github.alexfalappa.nbspringboot.templates.actuatorendpoints.ActEndpointWizardIterator.WIZ_TECHNOLOGY;

public final class ActEndpointVisualPanel1 extends JPanel {

    private final ActEndpointWizardPanel1 panel;

    @SuppressWarnings("LeakingThisInConstructor")
    public ActEndpointVisualPanel1(ActEndpointWizardPanel1 panel) {
        initComponents();
        this.panel = panel;
    }

    void store(WizardDescriptor wd) {
        wd.putProperty(WIZ_TECHNOLOGY, cbTech.getSelectedIndex());
        wd.putProperty(WIZ_SAMPLE_OPS, chSampleOps.isSelected());
    }

    void read(WizardDescriptor wd) {
        cbTech.setSelectedIndex((Integer) wd.getProperty(WIZ_TECHNOLOGY));
        chSampleOps.setSelected((Boolean) wd.getProperty(WIZ_SAMPLE_OPS));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
     * this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTech = new javax.swing.JLabel();
        cbTech = new javax.swing.JComboBox<>();
        chSampleOps = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(lTech, org.openide.util.NbBundle.getMessage(ActEndpointVisualPanel1.class, "ActEndpointVisualPanel1.lTech.text")); // NOI18N

        cbTech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Web and JMX", "only Web", "only JMX" }));
        cbTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTechActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(chSampleOps, org.openide.util.NbBundle.getMessage(ActEndpointVisualPanel1.class, "ActEndpointVisualPanel1.chSampleOps.text")); // NOI18N
        chSampleOps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chSampleOpsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTech)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chSampleOps))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTech)
                    .addComponent(cbTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chSampleOps)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTechActionPerformed
        // Notify that the panel changed
        panel.fireChangeEvent();
    }//GEN-LAST:event_cbTechActionPerformed

    private void chSampleOpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chSampleOpsActionPerformed
        // Notify that the panel changed
        panel.fireChangeEvent();
    }//GEN-LAST:event_chSampleOpsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTech;
    private javax.swing.JCheckBox chSampleOps;
    private javax.swing.JLabel lTech;
    // End of variables declaration//GEN-END:variables

}
