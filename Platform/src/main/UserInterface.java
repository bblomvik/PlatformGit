package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class UserInterface extends JFrame {

	private Controller c;

	private static String title = "Motor Controller";

	private JPanel contentPane;
	private JTextField m1TextField;
	private JTextField m2TextField;
	private JTextField m3TextField;
	private JKnob m1Knob;
	private JKnob m2Knob;
	private JKnob m3Knob;
	private JPanel panel_1;
	private JButton btnStart;
	private JButton btnStop;

	private Controller controller;

	/**
	 * Constructor for class.
	 * 
	 * @param Controller
	 *            controller that is connected and responds to this user
	 *            interface
	 */
	public UserInterface(Controller c) {
		this.controller = c;
		initialize();
		this.setVisible(true);
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblM = new JLabel("M1");
		GridBagConstraints gbc_lblM = new GridBagConstraints();
		gbc_lblM.insets = new Insets(0, 0, 5, 5);
		gbc_lblM.gridx = 0;
		gbc_lblM.gridy = 0;
		panel.add(lblM, gbc_lblM);

		m1Knob = new JKnob();
		m1Knob.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				m1TextField.setText(upDateTextField(m1TextField, m1Knob));
			}
		});
		GridBagConstraints gbc_m1Knob = new GridBagConstraints();
		gbc_m1Knob.insets = new Insets(0, 0, 5, 5);
		gbc_m1Knob.gridx = 1;
		gbc_m1Knob.gridy = 0;
		panel.add(m1Knob, gbc_m1Knob);

		m1TextField = new JTextField(upDateTextField(m1TextField, m1Knob));
		GridBagConstraints gbc_m1textField = new GridBagConstraints();
		gbc_m1textField.anchor = GridBagConstraints.WEST;
		gbc_m1textField.insets = new Insets(0, 0, 5, 0);
		gbc_m1textField.gridx = 2;
		gbc_m1textField.gridy = 0;
		panel.add(m1TextField, gbc_m1textField);
		m1TextField.setColumns(4);

		JLabel lblM_1 = new JLabel("M2");
		GridBagConstraints gbc_lblM_1 = new GridBagConstraints();
		gbc_lblM_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblM_1.gridx = 0;
		gbc_lblM_1.gridy = 1;
		panel.add(lblM_1, gbc_lblM_1);

		m2Knob = new JKnob();
		m2Knob.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				m2TextField.setText(upDateTextField(m2TextField, m2Knob));
			}
		});

		GridBagConstraints gbc_m2Knob = new GridBagConstraints();
		gbc_m2Knob.insets = new Insets(0, 0, 5, 5);
		gbc_m2Knob.gridx = 1;
		gbc_m2Knob.gridy = 1;
		panel.add(m2Knob, gbc_m2Knob);

		m2TextField = new JTextField(upDateTextField(m2TextField, m2Knob));
		GridBagConstraints gbc_m2textField = new GridBagConstraints();
		gbc_m2textField.anchor = GridBagConstraints.WEST;
		gbc_m2textField.insets = new Insets(0, 0, 5, 0);
		gbc_m2textField.gridx = 2;
		gbc_m2textField.gridy = 1;
		panel.add(m2TextField, gbc_m2textField);
		m2TextField.setColumns(4);

		JLabel lblM_2 = new JLabel("M3");
		GridBagConstraints gbc_lblM_2 = new GridBagConstraints();
		gbc_lblM_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblM_2.gridx = 0;
		gbc_lblM_2.gridy = 2;
		panel.add(lblM_2, gbc_lblM_2);

		m3Knob = new JKnob();
		m3Knob.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				m3TextField.setText(upDateTextField(m3TextField, m3Knob));
			}
		});
		GridBagConstraints gbc_m3Knob = new GridBagConstraints();
		gbc_m3Knob.insets = new Insets(0, 0, 5, 5);
		gbc_m3Knob.gridx = 1;
		gbc_m3Knob.gridy = 2;
		panel.add(m3Knob, gbc_m3Knob);

		m3TextField = new JTextField(upDateTextField(m3TextField, m3Knob));
		GridBagConstraints gbc_m3textField_1 = new GridBagConstraints();
		gbc_m3textField_1.anchor = GridBagConstraints.WEST;
		gbc_m3textField_1.gridx = 2;
		gbc_m3textField_1.gridy = 2;
		panel.add(m3TextField, gbc_m3textField_1);
		m3TextField.setColumns(4);

		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 75, 0 };
		gbl_panel_1.rowHeights = new int[] { 29, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.startMotors();
			}
		});

		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.insets = new Insets(0, 0, 5, 0);
		gbc_btnStart.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnStart.gridx = 0;
		gbc_btnStart.gridy = 0;
		panel_1.add(btnStart, gbc_btnStart);

		btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.stopMotors();
			}
		});
		GridBagConstraints gbc_btnStop = new GridBagConstraints();
		gbc_btnStop.gridx = 0;
		gbc_btnStop.gridy = 1;
		panel_1.add(btnStop, gbc_btnStop);

	}

	
	/**
	 * Print the angle of the knob
	 */
	public void printAngle(JKnob knob) {
		System.out.println(knob.getAngleDegrees());

	}

	/**
	 * Update the value of the angle position to the Knob. The method collect a
	 * double value and decide how many decimals it should return.
	 */
	public String upDateTextField(JTextField tf, JKnob knob) {
		String st;
		double value = knob.getAngleDegrees();		
		
		//int degree = (int) Math.round(value); // in switchCase.		
		//Using String.format to reduce the amount of decimals.
		
		//String.format("%.1f", value);
		if (value < 0){
			value = 360 + value;
		}				
		st = String.format("%.1f", value);
		return st; 
	}

	// /**
	// * Launch the application.
	// */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// UserInterface frame = new UserInterface();
	//
	// frame.setVisible(true);
	// frame.setResizable(false);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }
}
