import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Microwaveoven extends JFrame {
    private JTextField timeDisplay;
    private JButton[] numberButtons;
    private JButton startButton, stopButton;
    private JTextArea foodArea;
    
    public Microwaveoven() {
        setTitle("Microwave Oven");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
        
        initializeComponents();
        setupLayout();
        setupEventHandlers();
    }
    
    private void initializeComponents() {
        // Time display
        timeDisplay = new JTextField("00:00");
        timeDisplay.setFont(new Font("Arial", Font.BOLD, 24));
        timeDisplay.setHorizontalAlignment(JTextField.CENTER);
        timeDisplay.setEditable(false);
        
        // Food area
        foodArea = new JTextArea("Food to be placed here");
        foodArea.setFont(new Font("Arial", Font.PLAIN, 16));
        foodArea.setLineWrap(true);
        foodArea.setWrapStyleWord(true);
        foodArea.setBackground(Color.LIGHT_GRAY);
        
        // Number buttons (0-9)
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 18));
        }
        
        // Control buttons
        startButton = new JButton("Start");
        startButton.setFont(new Font("Arial", Font.BOLD, 16));
        startButton.setBackground(Color.GREEN);
        
        stopButton = new JButton("Stop");
        stopButton.setFont(new Font("Arial", Font.BOLD, 16));
        stopButton.setBackground(Color.RED);
        stopButton.setForeground(Color.WHITE);
    }
    
    private void setupLayout() {
        setLayout(new BorderLayout(10, 10));
        
        // Main panel with padding
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Top panel - Time display
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(timeDisplay, BorderLayout.CENTER);
        topPanel.setBorder(BorderFactory.createTitledBorder("Time Display"));
        
        // Center panel - Food area
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(new JScrollPane(foodArea), BorderLayout.CENTER);
        centerPanel.setBorder(BorderFactory.createTitledBorder("Food Area"));
        
        // Bottom panel - Keypad
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createTitledBorder("Control Panel"));
        
        // Keypad grid
        JPanel keypadPanel = new JPanel(new GridLayout(4, 3, 5, 5));
        
        // Add buttons 1-9
        for (int i = 1; i <= 9; i++) {
            keypadPanel.add(numberButtons[i]);
        }
        
        // Add bottom row (0, Start, Stop)
        keypadPanel.add(numberButtons[0]);
        keypadPanel.add(startButton);
        keypadPanel.add(stopButton);
        
        bottomPanel.add(keypadPanel, BorderLayout.CENTER);
        
        // Add all panels to main panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
    }
    
    private void setupEventHandlers() {
        // Number buttons
        for (int i = 0; i < 10; i++) {
            final int number = i;
            numberButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String currentTime = timeDisplay.getText();
                    if (currentTime.equals("00:00")) {
                        timeDisplay.setText(String.valueOf(number));
                    } else {
                        timeDisplay.setText(currentTime + number);
                    }
                }
            });
        }
        
        // Start button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Microwaveoven.this, 
                    "Microwave started!", "Info", JOptionPane.INFORMATION_MESSAGE);
                foodArea.setText("Cooking in progress...");
            }
        });
        
        // Stop button
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeDisplay.setText("00:00");
                foodArea.setText("Food to be placed here");
                JOptionPane.showMessageDialog(Microwaveoven.this, 
                    "Microwave stopped!", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
    
    public static void main(String[] args) {
        // Set system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Microwaveoven().setVisible(true);
            }
        });
    }
}