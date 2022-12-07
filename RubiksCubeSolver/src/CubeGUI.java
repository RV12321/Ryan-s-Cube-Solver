
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;

public class CubeGUI {
	public static JPanel panel = new JPanel();
	public static JButton button0 = new JButton("");
	public static JButton button1 = new JButton("");
	public static JButton button2 = new JButton("");
	public static JButton button3 = new JButton("");
	public static JButton button4 = new JButton("");
	public static JButton button5 = new JButton("");
	public static JButton button6 = new JButton("");
	public static JButton button7 = new JButton("");
	public static JButton button8 = new JButton("");
	public static JButton next = new JButton("Next");
	public static JButton prev = new JButton("Prev");
	public static JButton done = new JButton("Done");
	public static JFrame window = new JFrame();
	public static JLabel sideLabel = new JLabel("");
	public static JLabel bottomText = new JLabel("");
	public static int Side = 0;
	public static int colors[][] = new int[6][9];
	static Solver solver = new Solver();
	
	public static void main(String[] args) {
		final int WINDOW_WIDTH = 550;
		final int WINDOW_HEIGHT = 300;
		
		window.setTitle("Cube Input");
		
		window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);
		
		window.setResizable(false);
		
		addStuff();
		
	}
	
	public static void addStuff() {
		panel.setLayout(null);
		window.add(panel);
		
		sideLabel.setText("This side is Green");
		sideLabel.setLocation(210,20);
		panel.add(sideLabel);
		sideLabel.setSize(250,14);
		
		bottomText.setText("Position the cube with the Orange side facing up");
		bottomText.setLocation(210,40);
		panel.add(bottomText);
		bottomText.setSize(280,14);
		
		panel.add(button0);
		button0.setBounds(10,10,55,55);
		
		panel.add(button3);
		button3.setBounds(10,71,55,55);
		
		panel.add(button6);
		button6.setBounds(10,132,55,55);
		
		panel.add(button1);
		button1.setBounds(71,10,55,55);
		
		panel.add(button4);
		button4.setBounds(71,71,55,55);
		
		panel.add(button7);
		button7.setBounds(71,132,55,55);
		
		panel.add(button2);
		button2.setBounds(132,10,55,55);
		
		panel.add(button5);
		button5.setBounds(132,71,55,55);
		
		panel.add(button8);
		button8.setBounds(132,132,55,55);
		
		panel.add(next);
		next.setBounds(210,78,100,30);
		
		panel.add(prev);
		prev.setBounds(210,118,100,30);
		prev.setEnabled(false);
		
		panel.add(done);
		done.setBounds(210,158,100,30);
		
		
		
		int side[] = {0,0,0,0,0,0,0,0,0};
		button0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				if(side[0] == 5) {
					side[0] = 0;
					button0.setBackground(Color.GREEN);
					colors[Side][0] = 1;
				}
				else if(side[0] == 0) {
					side[0] = 1;
					button0.setBackground(Color.WHITE);
					colors[Side][0] = 2;
				}
				else if(side[0] == 1) {
					side[0] = 2;
					button0.setBackground(Color.BLUE);
					colors[Side][0] = 3;
				}
				else if(side[0] == 2) {
					side[0] = 3;
					button0.setBackground(Color.YELLOW);
					colors[Side][0] = 4;
					
				}
				else if(side[0] == 3) {
					side[0] = 4;
					button0.setBackground(Color.ORANGE);
					colors[Side][0] = 5;
				}
				else if(side[0] == 4) {
					side[0] = 5;
					button0.setBackground(Color.RED);
					colors[Side][0] = 6;
				}
			}
		});
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(side[1] == 5) {
					side[1] = 0;
					button1.setBackground(Color.GREEN);
					colors[Side][1] = 1;
				}
				else if(side[1] == 0) {
					side[1] = 1;
					button1.setBackground(Color.WHITE);
					colors[Side][1] = 2;
				}
				else if(side[1] == 1) {
					side[1] = 2;
					button1.setBackground(Color.BLUE);
					colors[Side][1] = 3;
				}
				else if(side[1] == 2) {
					side[1] = 3;
					button1.setBackground(Color.YELLOW);
					colors[Side][1] = 4;
				}
				else if(side[1] == 3) {
					side[1] = 4;
					button1.setBackground(Color.ORANGE);
					colors[Side][1] = 5;
				}
				else if(side[1] == 4) {
					side[1] = 5;
					button1.setBackground(Color.RED);
					colors[Side][1] = 6;
				}
				
			}
		});
		
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(side[2] == 5) {
					side[2] = 0;
					button2.setBackground(Color.GREEN);
					colors[Side][2] = 1;
				}
				else if(side[2] == 0) {
					side[2] = 1;
					button2.setBackground(Color.WHITE);
					colors[Side][2] = 2;
				}
				else if(side[2] == 1) {
					side[2] = 2;
					button2.setBackground(Color.BLUE);
					colors[Side][2] = 3;
				}
				else if(side[2] == 2) {
					side[2] = 3;
					button2.setBackground(Color.YELLOW);
					colors[Side][2] = 4;
				}
				else if(side[2] == 3) {
					side[2] = 4;
					button2.setBackground(Color.ORANGE);
					colors[Side][2] = 5;
				}
				else if(side[2] == 4) {
					side[2] = 5;
					button2.setBackground(Color.RED);
					colors[Side][2] = 6;
				}
				
			}
		});
		
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(side[3] == 5) {
					side[3] = 0;
					button3.setBackground(Color.GREEN);
					colors[Side][3] = 1;
				}
				else if(side[3] == 0) {
					side[3] = 1;
					button3.setBackground(Color.WHITE);
					colors[Side][3] = 2;
				}
				else if(side[3] == 1) {
					side[3] = 2;
					button3.setBackground(Color.BLUE);
					colors[Side][3] = 3;
				}
				else if(side[3] == 2) {
					side[3] = 3;
					button3.setBackground(Color.YELLOW);
					colors[Side][3] = 4;
				}
				else if(side[3] == 3) {
					side[3] = 4;
					button3.setBackground(Color.ORANGE);
					colors[Side][3] = 5;
				}
				else if(side[3] == 4) {
					side[3] = 5;
					button3.setBackground(Color.RED);
					colors[Side][3] = 6;
				} 
			}
		});
		
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(side[4] == 5) {
					side[4] = 0;
					button4.setBackground(Color.GREEN);
					colors[Side][4] = 1;
				}
				else if(side[4] == 0) {
					side[4] = 1;
					button4.setBackground(Color.WHITE);
					colors[Side][4] = 2;
				}
				else if(side[4] == 1) {
					side[4] = 2;
					button4.setBackground(Color.BLUE);
					colors[Side][4] = 3;
				}
				else if(side[4] == 2) {
					side[4] = 3;
					button4.setBackground(Color.YELLOW);
					colors[Side][4] = 4;
				}
				else if(side[4] == 3) {
					side[4] = 4;
					button4.setBackground(Color.ORANGE);
					colors[Side][4] = 5;
				}
				else if(side[4] == 4) {
					side[4] = 5;
					button4.setBackground(Color.RED);
					colors[Side][4] = 6;
				}
			}
		});
		
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(side[5] == 5) {
					side[5] = 0;
					button5.setBackground(Color.GREEN);
					colors[Side][5] = 1;
				}
				else if(side[5] == 0) {
					side[5] = 1;
					button5.setBackground(Color.WHITE);
					colors[Side][5] = 2;
				}
				else if(side[5] == 1) {
					side[5] = 2;
					button5.setBackground(Color.BLUE);
					colors[Side][5] = 3;
				}
				else if(side[5] == 2) {
					side[5] = 3;
					button5.setBackground(Color.YELLOW);
					colors[Side][5] = 4;
				}
				else if(side[5] == 3) {
					side[5] = 4;
					button5.setBackground(Color.ORANGE);
					colors[Side][5] = 5;
				}
				else if(side[5] == 4) {
					side[5] = 5;
					button5.setBackground(Color.RED);
					colors[Side][5] = 6;
				}
			}
		});
		
		button6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(side[6] == 5) {
					side[6] = 0;
					button6.setBackground(Color.GREEN);
					colors[Side][6] = 1;
				}
				else if(side[6] == 0) {
					side[6] = 1;
					button6.setBackground(Color.WHITE);
					colors[Side][6] = 2;
				}
				else if(side[6] == 1) {
					side[6] = 2;
					button6.setBackground(Color.BLUE);
					colors[Side][6] = 3;
				}
				else if(side[6] == 2) {
					side[6] = 3;
					button6.setBackground(Color.YELLOW);
					colors[Side][6] = 4;
				}
				else if(side[6] == 3) {
					side[6] = 4;
					button6.setBackground(Color.ORANGE);
					colors[Side][6] = 5;
				}
				else if(side[6] == 4) {
					side[6] = 5;
					button6.setBackground(Color.RED);
					colors[Side][6] = 6;
				}
				
			}
		});
		
		button7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(side[7] == 5) {
					side[7] = 0;
					button7.setBackground(Color.GREEN);
					colors[Side][7] = 1;
				}
				else if(side[7] == 0) {
					side[7] = 1;
					button7.setBackground(Color.WHITE);
					colors[Side][7] = 2;
				}
				else if(side[7] == 1) {
					side[7] = 2;
					button7.setBackground(Color.BLUE);
					colors[Side][7] = 3;
				}
				else if(side[7] == 2) {
					side[7] = 3;
					button7.setBackground(Color.YELLOW);
					colors[Side][7] = 4;
				}
				else if(side[7] == 3) {
					side[7] = 4;
					button7.setBackground(Color.ORANGE);
					colors[Side][7] = 5;
				}
				else if(side[7] == 4) {
					side[7] = 5;
					button7.setBackground(Color.RED);
					colors[Side][7] = 6;
				}
			}
		});
		
		button8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(side[8] == 5) {
					side[8] = 0;
					button8.setBackground(Color.GREEN);
					colors[Side][8] = 1;
				}
				else if(side[8] == 0) {
					side[8] = 1;
					button8.setBackground(Color.WHITE);
					colors[Side][8] = 2;
				}
				else if(side[8] == 1) {
					side[8] = 2;
					button8.setBackground(Color.BLUE);
					colors[Side][8] = 3;
				}
				else if(side[8] == 2) {
					side[8] = 3;
					button8.setBackground(Color.YELLOW);
					colors[Side][8] = 4;
				}
				else if(side[8] == 3) {
					side[8] = 4;
					button8.setBackground(Color.ORANGE);
					colors[Side][8] = 5;
				}
				else if(side[8] == 4) {
					side[8] = 5;
					button8.setBackground(Color.RED);
					colors[Side][8] = 6;
				}
			}
		});
		
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetColors(side);
			
				if(Side == 0) {
					sideLabel.setText("Move to the White side");
					Side++;
					prev.setEnabled(true);
				}
				else if(Side == 1) {
					sideLabel.setText("Move to the Blue side");
					Side++;
				}
				else if(Side == 2) {
					sideLabel.setText("Move to the Yellow side");
					Side++;
				}
				else if(Side == 3) {
					sideLabel.setText("The Side is Orange");
					bottomText.setText("Position the cube with the Yellow side facing up");
					Side++;
				}
				else if(Side == 4) {
					sideLabel.setText("The Side is Red");
					bottomText.setText("Position the cube with the White side facing up");
					Side++;
					next.setEnabled(false);
				}
				else if(Side == 5) {
					sideLabel.setText("The Side is Green");
				}
			}
		});
		
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetColors(side);
				
				if(Side == 1) {
					
					sideLabel.setText("The Side is Green");
					Side--;
					prev.setEnabled(false);
				}
				else if(Side == 2) {
					sideLabel.setText("The Side is White");
					Side--;
				}
				else if(Side == 3) {
					sideLabel.setText("The Side is Blue");
					Side--;
				}
				else if(Side == 4) {
					sideLabel.setText("The Side is Yellow");
					Side--;
				}
				else if(Side == 5) {
					Side--;
					sideLabel.setText("The Side is Orange");
					next.setEnabled(true);
				}
			}
		});

		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				solver.setColors(colors);
				solver.whiteSide();
				solver.middleEdges();
				solver.yellowSide();
				System.out.println("\n");
				solver.finish();
			}
		});
		
		
		
	}
	
	public static void resetColors(int[] s) {
		s[0] = 0;
		s[1] = 0;
		s[2] = 0;
		s[3] = 0;
		s[4] = 0;
		s[5] = 0;
		s[6] = 0;
		s[7] = 0;
		s[8] = 0;
		button0.setBackground(null);
		button1.setBackground(null);
		button2.setBackground(null);
		button3.setBackground(null);
		button4.setBackground(null);
		button5.setBackground(null);
		button6.setBackground(null);
		button7.setBackground(null);
		button8.setBackground(null);
	}
}


