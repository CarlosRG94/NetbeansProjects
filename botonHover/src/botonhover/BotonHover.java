/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botonhover;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

/**
 *
 * @author carli
 */
public class BotonHover extends JButton implements Serializable {

    private JCheckBox enableHoverEffect;

    // Constructor básico
    public BotonHover() {
        super();
        initialize();
    }

    // Constructor con el JCheckBox asociado
    public BotonHover(String text, JCheckBox enableHoverEffect) {
        super(text);
        this.enableHoverEffect = enableHoverEffect;
        initialize();
    }

    public JCheckBox getEnableHoverEffect() {
        return enableHoverEffect;
    }

    public void setEnableHoverEffect(JCheckBox enableHoverEffect) {
        this.enableHoverEffect = enableHoverEffect;
    }

    // Método de inicialización
    private void initialize() {
        // Estilo básico
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(true);
        setVerticalAlignment(SwingConstants.BOTTOM);
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.BLACK);
        setFont(new Font("SansSerif", Font.BOLD, 16));
        setHorizontalAlignment(SwingConstants.LEFT);
        setPreferredSize(new Dimension(150, 50));

        // Efecto hover condicionado por el estado del JCheckBox
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (enableHoverEffect == null || enableHoverEffect.isSelected()) {
                    setBackground(new Color(144, 238, 144)); // Fondo verde claro
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(211, 211, 211)); // Fondo original
            }
        });
    }

}
