package clock;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Myframe extends JFrame{
	
//	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	
	
	Myframe(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
//		this.setResizable(false);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEEEE");
		dateFormat = new SimpleDateFormat("MMMM-dd-YYYY");
		
		timeLabel=new JLabel();
		timeLabel.setFont(new Font("Verdana",Font.ITALIC,50));
		timeLabel.setForeground(new Color(0x00FF10));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel=new JLabel();
		dayLabel.setFont(new Font("Ink Free",Font.LAYOUT_RIGHT_TO_LEFT,35));
		
		
		dateLabel=new JLabel();
		dateLabel.setFont(new Font("Ink Free",Font.ITALIC,25));
		
//		time=timeFormat.format(Calendar.getInstance().getTime());
//		timeLabel.setText(time);
		
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		
		setTime();
	}
	public void setTime() {
		while(true) {
		time=timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		day=dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		
		date=dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		try {
		Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	}

}
