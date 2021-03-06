/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Series;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MyRenderer extends DefaultTableCellRenderer {
    Color background;
    Color foreground;

    public MyRenderer (Color background,Color foreground) {
        super();
        this.background = background;
        this.foreground = foreground;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        comp.setBackground(background);
        comp.setForeground(foreground);
        comp.setFont(new java.awt.Font("Tahoma", 1, 14));
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setBorder(javax.swing.BorderFactory.createLineBorder(Color.ORANGE));

        return comp;
    }
}
