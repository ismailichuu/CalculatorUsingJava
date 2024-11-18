import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.MulticastChannel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	String oldvalue;
	boolean isOperatorClicked=false;
	
	JLabel displayLabel;
	JButton sevenBtn,eightBtn,nineBtn,fourBtn,fiveBtn,sixBtn,oneBtn,twoBtn,threeBtn,zeroBtn;
	JButton dotBtn,equalBtn,clearBtn;
	JButton addBtn,subBtn,divBtn,mulBtn;
	
	public Calculator(){
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300,100);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		sevenBtn=new JButton("7");
		sevenBtn.setBounds(30, 120, 60, 60);
		sevenBtn.addActionListener(this);
		jf.add(sevenBtn);
		
		eightBtn=new JButton("8");
		eightBtn.setBounds(110, 120, 60, 60);
		eightBtn.addActionListener(this);
		jf.add(eightBtn);
		
		nineBtn=new JButton("9");
		nineBtn.setBounds(190, 120, 60, 60);
		nineBtn.addActionListener(this);
		jf.add(nineBtn);
		
		fourBtn=new JButton("4");
		fourBtn.setBounds(30, 200, 60, 60);
		fourBtn.addActionListener(this);
		jf.add(fourBtn);
		
		fiveBtn=new JButton("5");
		fiveBtn.setBounds(110, 200, 60, 60);
		fiveBtn.addActionListener(this);
		jf.add(fiveBtn);
		
		sixBtn=new JButton("6");
		sixBtn.setBounds(190, 200, 60, 60);
		sixBtn.addActionListener(this);
		jf.add(sixBtn);
		
		oneBtn=new JButton("1");
		oneBtn.setBounds(30, 280, 60, 60);
		oneBtn.addActionListener(this);
		jf.add(oneBtn);
		
		twoBtn=new JButton("2");
		twoBtn.setBounds(110, 280, 60, 60);
		twoBtn.addActionListener(this);
		jf.add(twoBtn);
		
		threeBtn=new JButton("3");
		threeBtn.setBounds(190, 280, 60, 60);
		threeBtn.addActionListener(this);
		jf.add(threeBtn);
		
		dotBtn=new JButton(".");
		dotBtn.setBounds(30, 360, 60, 60);
		dotBtn.addActionListener(this);
		jf.add(dotBtn);
		
		zeroBtn=new JButton("0");
		zeroBtn.setBounds(110, 360, 60, 60);
		zeroBtn.addActionListener(this);
		jf.add(zeroBtn);
		
		equalBtn=new JButton("=");
		equalBtn.setBounds(190,  360, 60, 60);
		jf.add(equalBtn);
		
		addBtn=new JButton("+");
		addBtn.setBounds(270, 120, 60, 60);
		addBtn.addActionListener(this);
		jf.add(addBtn);
		
		subBtn=new JButton("-");
		subBtn.setBounds(270, 200, 60, 60);
		subBtn.addActionListener(this);
		jf.add(subBtn);
		
		divBtn=new JButton("/");
		divBtn.setBounds(270, 280, 60, 60);
		divBtn.addActionListener(this);
		jf.add(divBtn);
		
		mulBtn=new JButton("x");
		mulBtn.setBounds(270, 360, 60, 60);
		mulBtn.addActionListener(this);
		jf.add(mulBtn);
		
		clearBtn=new JButton("C");
		clearBtn.setBounds(350, 360, 60, 60);
		clearBtn.addActionListener(this);
		jf.add(clearBtn);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== sevenBtn) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		else if(e.getSource()== eightBtn) {
			displayLabel.setText(displayLabel.getText()+"8");
		}
		else if(e.getSource()== nineBtn) {
			displayLabel.setText(displayLabel.getText()+"9");
		}
		else if(e.getSource()== fourBtn) {
			displayLabel.setText(displayLabel.getText()+"4");
		}
		else if(e.getSource()== fiveBtn) {
			displayLabel.setText(displayLabel.getText()+"5");
		}
		else if(e.getSource()== sixBtn) {
			displayLabel.setText(displayLabel.getText()+"6");
		}
		else if(e.getSource()== oneBtn) {
			displayLabel.setText(displayLabel.getText()+"1");
		}
		else if(e.getSource()== twoBtn) {
			displayLabel.setText(displayLabel.getText()+"2");
		}
		else if(e.getSource()== threeBtn) {
			displayLabel.setText(displayLabel.getText()+"3");
		}
		else if(e.getSource()== zeroBtn) {
			displayLabel.setText(displayLabel.getText()+"0");
		}
		else if(e.getSource()==addBtn) {
			isOperatorClicked=true;
			oldvalue= displayLabel.getText();
		}
		else if(e.getSource()==subBtn) {
		}
		else if(e.getSource()==divBtn) {
		}
		else if(e.getSource()==mulBtn) {
		}
		else if(e.getSource()==clearBtn) {
			displayLabel.setText("");
		}
	}	
	
}
