package com.kadir.jOptionPane;

import javax.swing.*;

public class jOptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome on Board!");
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");

        if (username != null && password != null && (
                (username.equals("bburd") && password.equals("swordfish")) ||
                        (username.equals("hritter") && password.equals("preakston")))
        ) {
            JOptionPane.showMessageDialog(null, "You're in.");
        } else {
            JOptionPane.showMessageDialog(null, "You're suspicious.");
        }
    }
}
