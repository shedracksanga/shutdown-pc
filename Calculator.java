package calculator;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame {
    private TextField display;
    private String operator;
    private double firstOperand;
    private boolean isOperatorClicked;

    public Calculator() {
        setLayout(new BorderLayout());

        display = new TextField();
        display.setEditable(false);
        display.setPreferredSize(new Dimension(300, 50));
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);

        setTitle("Simple Calculator");
        setSize(400, 500);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            String command = ((Button) evt.getSource()).getLabel();

            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                if (isOperatorClicked) {
                    display.setText("");
                    isOperatorClicked = false;
                }
                display.setText(display.getText() + command);
            } else if (command.equals("C")) {
                display.setText("");
                operator = "";
                firstOperand = 0;
            } else if (command.equals("=")) {
                double secondOperand = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator) {
                    case "+":
                        result = firstOperand + secondOperand;
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        break;
                    case "/":
                        result = firstOperand / secondOperand;
                        break;
                }

                display.setText(String.valueOf(result));
                operator = "";
                isOperatorClicked = false;
            } else {
                firstOperand = Double.parseDouble(display.getText());
                operator = command;
                isOperatorClicked = true;
            }
        }
    }
}
