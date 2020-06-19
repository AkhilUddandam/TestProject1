package ATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class ATM_Sys {

	private JFrame frame;
	private JTextField jlblDisplay;
	private JTextField jtxtEnter;
	private JTextField jtxtnumberofyears;
	private JTextField jlblMonthlyPayment1;
	private JTextField jlblTotalPayment1;
	private JTextField jtxtReceipt;
	private JTextField jtxtEnteloanamount;
	
	private JButton btnExit;
	private JButton btnReset;
	private JButton btnLoan;
	private JButton btnReceipt;

	private JButton jbtnLoan;
	private JButton jbtnBalance;
	private JButton jbtnWithdrawal;
	private JButton jbtnDeposit;
	private JButton jbtn1, jbtn2, jbtn3, jbtn4, jbtn5, jbtn6, jbtn7, jbtn8, jbtn9, jbtn0; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_Sys window = new ATM_Sys();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_Sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(27, 32, 163, 144);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtnBalance = new JButton("");
		jbtnBalance.setEnabled(false);
		jbtnBalance.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-arrow-right-64.png")));
		jbtnBalance.setBounds(33, 10, 96, 58);
		panel.add(jbtnBalance);
		
		JButton jbtnWithdrawal = new JButton("");
		jbtnWithdrawal.setEnabled(false);
		jbtnWithdrawal.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-arrow-right-64.png")));
		jbtnWithdrawal.setBounds(33, 78, 96, 58);
		panel.add(jbtnWithdrawal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(127, 255, 0));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(210, 32, 262, 144);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Balance");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		lblNewLabel.setBounds(21, 10, 84, 34);
		panel_1.add(lblNewLabel);
		
		JLabel lblLoan = new JLabel("Loan");
		lblLoan.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		lblLoan.setBounds(154, 10, 84, 34);
		panel_1.add(lblLoan);
		
		JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		lblDeposit.setBounds(154, 100, 84, 34);
		panel_1.add(lblDeposit);
		
		JLabel lblWithdrawal = new JLabel("Withdrawal");
		lblWithdrawal.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		lblWithdrawal.setBounds(21, 100, 84, 34);
		panel_1.add(lblWithdrawal);
		
		jlblDisplay = new JTextField();
		jlblDisplay.setBackground(new Color(127, 255, 0));
		jlblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		jlblDisplay.setFont(new Font("Tahoma", Font.BOLD, 16));
		jlblDisplay.setBounds(21, 54, 217, 36);
		panel_1.add(jlblDisplay);
		jlblDisplay.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(495, 32, 163, 144);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton jbtnLoan = new JButton("");
		jbtnLoan.setEnabled(false);
		jbtnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnExit.setEnabled(true);
				btnReset.setEnabled(true);
				btnLoan.setEnabled(true);
				btnReceipt.setEnabled(true);
				
				
				
				
				
				
				
				
			}
		});
		jbtnLoan.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-arrow-left-64.png")));
		jbtnLoan.setBounds(34, 10, 96, 58);
		panel_2.add(jbtnLoan);
		
		JButton jbtnDeposit = new JButton("");
		jbtnDeposit.setEnabled(false);
		jbtnDeposit.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-arrow-left-64.png")));
		jbtnDeposit.setBounds(34, 78, 96, 58);
		panel_2.add(jbtnDeposit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(27, 197, 631, 521);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton jbtn1 = new JButton("");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jlblDisplay.getText() + "1";
				jlblDisplay.setText(Enternumber);
				
				
			}
		});
		jbtn1.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-number-1-100.png")));
		jbtn1.setBounds(10, 25, 132, 87);
		panel_3.add(jbtn1);
		
		JButton jbtn2 = new JButton("");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jlblDisplay.getText() + "2";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn2.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-number-2-100.png")));
		jbtn2.setBounds(162, 25, 132, 87);
		panel_3.add(jbtn2);
		
		JButton jbtn3 = new JButton("");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String Enternumber = jlblDisplay.getText() + "3";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn3.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-3-c-100.png")));
		jbtn3.setBounds(318, 25, 132, 87);
		panel_3.add(jbtn3);
		
		JButton jbtnCancel = new JButton("");
		jbtnCancel.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-cancel-64.png")));
		jbtnCancel.setBounds(478, 25, 132, 87);
		panel_3.add(jbtnCancel);
		
		JButton jbtn4 = new JButton("");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jlblDisplay.getText() + "4";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn4.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-number-4-100.png")));
		jbtn4.setBounds(10, 140, 132, 87);
		panel_3.add(jbtn4);
		
		JButton jbtn5 = new JButton("");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jlblDisplay.getText() + "5";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn5.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-5-c-100.png")));
		jbtn5.setBounds(162, 140, 132, 87);
		panel_3.add(jbtn5);
		
		JButton jbtn6 = new JButton("");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jlblDisplay.getText() + "6";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn6.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-number-6-100.png")));
		jbtn6.setBounds(318, 140, 132, 87);
		panel_3.add(jbtn6);
		
		JButton jbtnClear = new JButton("");
		jbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblDisplay.setText("");
			}
		});
		jbtnClear.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-open-pane-100.png")));
		jbtnClear.setBounds(478, 140, 132, 87);
		panel_3.add(jbtnClear);
		
		JButton jbtn7 = new JButton("");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jlblDisplay.getText() + "7";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn7.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-7-c-100.png")));
		jbtn7.setBounds(10, 251, 132, 87);
		panel_3.add(jbtn7);
		
		JButton jbtn8 = new JButton("");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jlblDisplay.getText() + "8";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn8.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-8-c-100.png")));
		jbtn8.setBounds(162, 251, 132, 87);
		panel_3.add(jbtn8);
		
		JButton jbtn9 = new JButton("");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jlblDisplay.getText() + "9";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn9.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-9-c-100.png")));
		jbtn9.setBounds(318, 251, 132, 87);
		panel_3.add(jbtn9);
		
		JButton jbtnEnter = new JButton("");
		jbtnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pin1 = Integer.parseInt(jlblDisplay.getText());
				int pin2 = Integer.parseInt(jlblDisplay.getText());
				int pin3 = Integer.parseInt(jlblDisplay.getText());
				
				 if (pin1 == 1234) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jbtnLoan.setVisible(true);
					jbtnDeposit.setVisible(true);
					jbtnWithdrawal.setVisible(true);
					jbtnBalance.setVisible(true);
					
					
					
					btnLoan.setVisible(true);
					btnReceipt.setVisible(true);
					btnReset.setVisible(true);
					btnExit.setVisible(true);
				}
				
				else if (pin2 == 3333) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jbtnLoan.setVisible(true);
					jbtnDeposit.setVisible(true);
					jbtnWithdrawal.setVisible(true);
					jbtnBalance.setVisible(true);
					
					btnLoan.setEnabled(true);
					btnReceipt.setEnabled(true);
					btnReset.setEnabled(true);
					btnExit.setEnabled(true);
					
					btnLoan.setVisible(true);
					btnReceipt.setVisible(true);
					btnReset.setVisible(true);
					btnExit.setVisible(true);
						
				}
				
				else if (pin3 == 6666) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jbtnLoan.setVisible(true);
					jbtnDeposit.setVisible(true);
					jbtnWithdrawal.setVisible(true);
					jbtnBalance.setVisible(true);
					
					btnLoan.setEnabled(true);
					btnReceipt.setEnabled(true);
					btnReset.setEnabled(true);
					btnExit.setEnabled(true);
					
					btnLoan.setVisible(true);
					btnReceipt.setVisible(true);
					btnReset.setVisible(true);
					btnExit.setVisible(true);
						
				}
				
				
				else
				{
					jlblDisplay.setText("Invalid PIN. Please try again!");
				}			
			}
		});
		jbtnEnter.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-enter-50.png")));
		jbtnEnter.setBounds(478, 251, 132, 87);
		panel_3.add(jbtnEnter);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(10, 366, 132, 87);
		panel_3.add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jlblDisplay.getText() + "0";
				jlblDisplay.setText(Enternumber);
			}
		});
		button_12.setIcon(new ImageIcon(ATM_Sys.class.getResource("/ATM/icons8-0-c-100.png")));
		button_12.setBounds(162, 366, 132, 87);
		panel_3.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBounds(318, 366, 132, 87);
		panel_3.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(478, 366, 132, 87);
		panel_3.add(button_14);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(670, 32, 745, 614);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Interest Rate :");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		lblNewLabel_1.setBounds(31, 43, 196, 67);
		panel_4.add(lblNewLabel_1);
		
		jtxtEnter = new JTextField();
		jtxtEnter.setBounds(213, 51, 117, 51);
		panel_4.add(jtxtEnter);
		jtxtEnter.setColumns(10);
		
		JLabel lblNumberOfYears = new JLabel("Number of Years :");
		lblNumberOfYears.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		lblNumberOfYears.setBounds(31, 112, 196, 75);
		panel_4.add(lblNumberOfYears);
		
		jtxtnumberofyears = new JTextField();
		jtxtnumberofyears.setColumns(10);
		jtxtnumberofyears.setBounds(213, 127, 117, 51);
		panel_4.add(jtxtnumberofyears);
		
		JLabel jlblMonthlyPayment = new JLabel("Monthly Payment :");
		jlblMonthlyPayment.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		jlblMonthlyPayment.setBounds(31, 343, 221, 51);
		panel_4.add(jlblMonthlyPayment);
		
		jlblMonthlyPayment1 = new JTextField();
		jlblMonthlyPayment1.setColumns(10);
		jlblMonthlyPayment1.setBounds(213, 346, 117, 51);
		panel_4.add(jlblMonthlyPayment1);
		
		JLabel jlblTotalPayment = new JLabel("Total Payment :");
		jlblTotalPayment.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		jlblTotalPayment.setBounds(31, 419, 196, 51);
		panel_4.add(jlblTotalPayment);
		
		jlblTotalPayment1 = new JTextField();
		jlblTotalPayment1.setColumns(10);
		jlblTotalPayment1.setBounds(213, 422, 117, 51);
		panel_4.add(jlblTotalPayment1);
		
		jtxtReceipt = new JTextField();
		jtxtReceipt.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
		jtxtReceipt.setForeground(new Color(0, 0, 0));
		jtxtReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtReceipt.setBounds(379, 43, 333, 440);
		panel_4.add(jtxtReceipt);
		
		JButton btnLoan = new JButton("Loan");
		btnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double annualInterestRate = Double.parseDouble(jtxtEnter.getText());
				double monthlyInterestRate = annualInterestRate / 1200;
				int numberOfYears = Integer.parseInt(jtxtnumberofyears.getText());
				double loanAmount= Double.parseDouble(jtxtEnteloanamount.getText());
				
				double monthlyPayment = loanAmount * monthlyInterestRate/(1 - 1 /Math.pow(1 + monthlyInterestRate, numberOfYears *12));
				String imonthlyPayment;
				imonthlyPayment = Double.toString(monthlyPayment);
				imonthlyPayment = String.format("$%.2f", monthlyPayment);
				jlblMonthlyPayment1.setText(imonthlyPayment);
				//
				double totalPayment =  monthlyPayment *numberOfYears * 12;
				String itotalPayment;
				itotalPayment = String.format("$%.2f", totalPayment);
				jlblTotalPayment1.setText(itotalPayment);
			}
		});
		btnLoan.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		btnLoan.setBounds(10, 517, 174, 87);
		panel_4.add(btnLoan);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String annualInterestRate = String.format(jtxtEnter.getText());
				 String numberOfYears = String.format(jtxtnumberofyears.getText());
				 String loanAmount = String.format(jtxtEnteloanamount.getText());
				
				 String monthlyPayment  = String.format(jlblMonthlyPayment1.getText());
				 String totalPayment = String.format(jlblTotalPayment1.getText());
				 
				 int refs= 1325 + (int) (Math.random()*4238);
				 
				 
				 Calendar timer = Calendar.getInstance();
				 timer.getTime();
				 SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				 tTime.format(timer.getTime());
				 SimpleDateFormat tdate = new SimpleDateFormat("dd-MMM-yyyy");
				 tdate.format(timer.getTime());
				 
						 
				//Receipt Template Layout 
				 jtxtReceipt.setText("\tLoan Management System\n" + 
						 "Reference:" + refs + 
								 "\n=============================" +
								 "\nInterest Rate:\t\t\t " + annualInterestRate +
								 "\nRepayment Years:\t\t\t " + numberOfYears +
								 "\nAmont of Loan:\t\t\t " + "$" + loanAmount +
						 		 "\nMonthly Payments of:\t\t " + monthlyPayment +
						 		 "\nTotal Payment:\t\t\t " + totalPayment +
						 		 
						 		 "\n=============================\t" +
						 		 "\nDate: " + tdate.format(timer.getTime()) +
						 		 "\t\tTime: " + tTime.format(timer.getTime()) +
						 		 "\n\n\t\tThank you. Have A Great Day!!\n");
								 
				
				
						 		 
						 
			}
		});
		btnReceipt.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		btnReceipt.setBounds(194, 517, 174, 87);
		panel_4.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtEnter.setText(null);
				jtxtnumberofyears.setText(null);
				jtxtEnteloanamount.setText(null);
				jlblMonthlyPayment1.setText(null);
				jlblTotalPayment1.setText(null);
				
				jtxtReceipt.setText(null);	
						
				
			}
		});
		btnReset.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		btnReset.setBounds(379, 517, 174, 87);
		panel_4.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame,  "Confirm if you want to exit", "ATM System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		btnExit.setBounds(563, 517, 174, 87);
		panel_4.add(btnExit);
		
		JLabel lblAmountOfLoan = new JLabel("Amount of Loan :");
		lblAmountOfLoan.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		lblAmountOfLoan.setBounds(31, 188, 196, 75);
		panel_4.add(lblAmountOfLoan);
		
		jtxtEnteloanamount = new JTextField();
		jtxtEnteloanamount.setColumns(10);
		jtxtEnteloanamount.setBounds(213, 197, 117, 51);
		panel_4.add(jtxtEnteloanamount);
	}
}
