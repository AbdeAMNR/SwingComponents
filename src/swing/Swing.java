/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author amnrLaptop
 */
public class Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("swing Class That is in BTS Program");
        window.getContentPane().setLayout(new FlowLayout());
        JLabel titre = new JLabel("objects");
        JButton btn = new JButton("ok");
        JCheckBox chk = new JCheckBox("famale", true);
        JCheckBox chk2 = new JCheckBox("male", false);
        JRadioButton radio = new JRadioButton("dog", false);
        JRadioButton radio2 = new JRadioButton("cat", true);

        JComboBox downList = new JComboBox(new Object[]{"dqsq", "dfss", "fgf", "fdgdg"});
        JList lis = new JList(new Object[]{"dqsq", "dfss", "fgf", "fdgdg"});
        JTable tbl = new JTable(new Object[][]{
            {"dfd", null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        },
                new Object[]{
                    "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
                });
        JTextArea area = new JTextArea("dggggggggggggggggggggn gggggggggggggggggggggggggg");
        area.setWrapStyleWord(false);
        area.setPreferredSize(new Dimension(100, 20));
        window.add(titre);
        window.add(btn);
        window.add(chk);
        window.add(chk2);
        window.add(radio);
        window.add(radio2);
        window.add(tbl);
        window.add(downList);
        window.add(lis);
        window.add(area);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "hello! this a JOptionPane......", "JOptionPane Titre", JOptionPane.INFORMATION_MESSAGE);
            }

        });
    }

}
