package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*; 

public class poloshirt extends JFrame implements MouseListener
{
	JLabel logo,donatepic,customercarepic,searchbar,line2,languagepic, title,subtitle,line1,poloshirtl,gownl,blackpoloshirtL,ballgownl,sheathl,fitandflarel,alinel, name, name1;
	JPanel panel;
	Color c1=new Color(228,225,217);
	//Color c2=new Color(205, 204, 200);
	Color c2=new Color(150, 150, 100);
	Color c3=new Color(60,80,10);
	Font f1=new Font("Garamond",Font.PLAIN,20); 
	JRadioButton r1,r2,r3,r4;
	ButtonGroup bg1;
	//ImageIcon img;
	JButton back,donate,languages,customercare,poloshirt,gown,blackpoloshirt,ballgown,sheath,fitandflare,aline,facebook,insta,twiter,image1,purchasep,p11,p22,p33;
	Border b1=BorderFactory.createLineBorder(new Color(120,120,120),3,true);
	JTextField searchT;
	JFrame frame;
	
	private String product_poloshirt="Lauren Slim Fit Mesh Polo Shirt";
	private String proPrice="150";
	private String quantity1="1";
	 
	public poloshirt()
	{
		super("Gents Formal Section");
        frame = new JFrame();
        frame.setSize(1200,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("images/mainlogo.png"); // Console Icon
		frame.setIconImage(icon.getImage());
		
		panel = new JPanel();
		//panel.setLayout(null);
        panel.setBounds(0,0,1200,700);
        panel.setBackground(new Color(228,225,217));
		
		back=new JButton(new ImageIcon("images/back.png"));
		back.setBackground(c1);
		back.setOpaque(true);
		back.setBorder(null);
		back.setBounds(1,10,32,32);
		back.addMouseListener(this);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(back);
		
		JButton logo=new JButton(new ImageIcon("images/mainlogo.png"));
		logo.setBounds(1080,0,100,100);
		logo.setOpaque(true);
		logo.setBackground(c1);
		logo.setBorder(null);
		logo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(logo);
		
		donatepic=new JLabel(new ImageIcon("images/donatepic.png"));
		donatepic.setBounds(407,22,16,16);
	    frame.add(donatepic);
		
		donate=new JButton("Synapse Donate");
		donate.setBounds(425,20,150,25);
		donate.setFont(new Font("Garamond",Font.BOLD,20));
		donate.addMouseListener(this);
		donate.setBackground(c1);
		donate.setBorder(null);
		donate.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(donate);
		
		customercarepic=new JLabel(new ImageIcon("images/ccare.png"));
		customercarepic.setBounds(580,22,16,16);
		frame.add(customercarepic);
		
		customercare=new JButton("Customer Care");
		customercare.setBounds(600,20,135,20);
		customercare.setFont(new Font("Garamond",Font.BOLD,20));
		customercare.setBackground(c1);
		customercare.setBorder(null);
		customercare.addMouseListener(this);
		customercare.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(customercare);
		
		languagepic=new JLabel(new ImageIcon("images/lpic.png"));
		languagepic.setBounds(740,22,16,16);
		frame.add(languagepic);
		
		languages=new JButton("Languages");
		languages.setBounds(765,20,100,25);
		languages.setFont(new Font("Garamond",Font.BOLD,20));
		languages.setBackground(c1);
		languages.setBorder(null);
		languages.setCursor(new Cursor(Cursor.HAND_CURSOR));
		languages.addMouseListener(this);
		frame.add(languages);
		
		facebook=new JButton(new ImageIcon("images/facebook.png"));
		facebook.setBounds(400,60,42,42);
		facebook.setBackground(c1);
		facebook.setBorder(null);
		facebook.addMouseListener(this);
		facebook.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(facebook);
		
		insta=new JButton(new ImageIcon("images/insta.png"));
		insta.setBounds(450,60,42,42);
		insta.setBackground(c1);
		insta.setBorder(null);
		insta.addMouseListener(this);
		insta.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(insta);
		
		twiter=new JButton(new ImageIcon("images/twitter.png"));
		twiter.setBounds(496,60,42,42);
		twiter.setBackground(c1);
		twiter.setBorder(null);
		twiter.setCursor(new Cursor(Cursor.HAND_CURSOR));
		twiter.addMouseListener(this);
	    frame.add(twiter);
		
		title = new JLabel("POLO SHIRT");
		title.setBounds(40,10,500,40);
		title.setFont(new Font("Garamond",Font.PLAIN+Font.BOLD,50));
		//title.setForeground(new Color(60,80,110));
		title.setOpaque(false);
		frame.add(title);
		
		subtitle=new JLabel("S E C T I O N");
		subtitle.setBounds(25,55,500,45);
		subtitle.setFont(new Font("Garamond",Font.PLAIN+Font.BOLD,55));
		subtitle.setForeground(new Color(50,80,110));
		subtitle.setOpaque(false);
		frame.add(subtitle);
		
		line1=new JLabel("_______________________________________________");
		line1.setBounds(4,65,1200,50);
		line1.setForeground(new Color(60,80,110));
		line1.setFont(new Font("Garamond",Font.BOLD,50));
		frame.add(line1);
		
		searchbar=new JLabel(new ImageIcon("images/search.png"));
		searchbar.setBounds(630,65,30,30);
		frame.add(searchbar);
		
		searchT=new JTextField();
		searchT.setBounds(660,65,400,30);
		searchT.setBackground(c1);
		searchT.setBorder(b1);
		frame.add(searchT);
		
		image1 =new JButton(new ImageIcon("image/poloshirt1.png"));
		image1.setBounds(10,125,385,400);
		image1.setBackground(c1);
		image1.setOpaque(true);
		image1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		image1.setBorder(null);
		frame.add(image1);
		
		JLabel details1=new JLabel("Brand: LACOSTE");
		details1.setBounds(134,530,300,25);
		details1.setFont(new Font("Garamond",Font.BOLD,20));
		frame.add(details1);
		
		
		JLabel details2=new JLabel("Fabric: 100% cotton");
		details2.setBounds(130,557,300,25);
		details2.setFont(new Font("Garamond",Font.BOLD,20));
		frame.add(details2);
		
		JLabel details3=new JLabel("Design: Exclusive with Unique Design");
		details3.setBounds(60,580,400,25);
		details3.setFont(new Font("Garamond",Font.BOLD,20));
		frame.add(details3);
		
		
		name=new JLabel("Lauren Slim Fit Mesh Polo Shirt");
		name.setBounds(450,130,450,35);
		//name.setForeground(c2);
		name.setOpaque(false);
		name.setFont(new Font("Garamond",Font.PLAIN+Font.BOLD,30));
		name.setBorder(null);
		frame.add(name);
		
		
		name1=new JLabel("Men Casual Poloshirt");
		name1.setBounds(450,165,450,25);
		//name.setForeground(c2);
		name1.setOpaque(false);
		name1.setFont(new Font("Garamond",Font.BOLD,20));
		name1.setBorder(null);
		frame.add(name1);
		
		JLabel speacial=new JLabel("Speacial Price");
		speacial.setBounds(450,200,450,25);
		speacial.setForeground(c3);
		speacial.setOpaque(false);
		speacial.setFont(new Font("Garamond",Font.BOLD,20));
		speacial.setBorder(null);
		frame.add(speacial);
		
		
		JLabel price=new JLabel("$"+proPrice);
		price.setBounds(450,220,150,50);
		price.setFont(new Font("Garamond",Font.BOLD,40));
		price.setOpaque(false);
		price.setBorder(null);
		frame.add(price);
		
		
		JLabel rating=new JLabel(new ImageIcon("images/rating.png"));
		rating.setBounds(675,180,128,128);
		frame.add(rating);
		
		JLabel extra1=new JLabel("4.2(469)");
		extra1.setBounds(815,230,120,30);
		extra1.setFont(new Font("Garamond",Font.BOLD,25));
		frame.add(extra1);
		
		JTextArea terms=new JTextArea("Free delivery within 5 days over £50 and free returns");
		terms.setBounds(450,280,420,25);
		terms.setOpaque(false);
		terms.setLineWrap(true);
		terms.setWrapStyleWord(true);
		terms.setEditable(false);
		terms.setBorder(null);
		terms.setFont(new Font("Garamond",Font.BOLD,18));
		frame.add(terms);
		
		JTextArea terms2=new JTextArea("Free Click & Collect over £30 and free returns");
		terms2.setBounds(450,310,380,30);
		terms2.setOpaque(false);
		terms2.setLineWrap(true);
		terms2.setWrapStyleWord(true);
		terms2.setEditable(false);
		terms2.setFont(new Font("Garamond",Font.BOLD,18));
		frame.add(terms2);
		
		
		JLabel d_colour=new JLabel("COLOUR: ");
		d_colour.setBounds(450,380,100,25);
		//name.setForeground(c2);
		d_colour.setOpaque(false);
		d_colour.setFont(new Font("Garamond",Font.BOLD,20));
		d_colour.setBorder(null);
		frame.add(d_colour);
		
		p11=new JButton(new ImageIcon("image/poloshirt11.png"));
		p11.setBounds(550,350,70,70);
		p11.setBorder(null);
		p11.setOpaque(false);
		p11.setBackground(c1);
		p11.addMouseListener(this);
		p11.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p11.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==p11)
				{
					image1.setIcon(new ImageIcon("image/poloshirt1.png"));
					image1.setBounds(10,125,385,400);
				}
						
			}
		});
		frame.add(p11);
		
		p22=new JButton(new ImageIcon("image/poloshirt22.png"));
		p22.setBounds(630,350,70,70);
		p22.setBorder(null);
		p22.setOpaque(false);
		p22.setBackground(c1);
		p22.addMouseListener(this);
		p22.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p22.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==p22)
				{
					image1.setIcon(new ImageIcon("image/poloshirt2.png"));
					image1.setBounds(10,120,385,400);
				}
						
			}
		});
		frame.add(p22);
		
		
		p33=new JButton(new ImageIcon("image/poloshirt33.png"));
		p33.setBounds(710,350,70,70);
		p33.setBorder(null);
		p33.setOpaque(false);
		p33.setBackground(c1);
		p33.addMouseListener(this);
		p33.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p33.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==p33)
				{
					image1.setIcon(new ImageIcon("image/poloshirt3.png"));
					image1.setBounds(20,120,385,400);
				}
						
			}
		});
		frame.add(p33);
		
		JLabel size=new JLabel("SIZES:");
		size.setBounds(450,430,70,30);
		size.setFont(new Font("Garamond",Font.BOLD,20));
		frame.add(size);
		
		r1=new JRadioButton("M");
		r1.setBounds(530,430,80,30);
		r1.setFont(new Font("Garamond",Font.BOLD,20));
		//r1.setBackground(Color.WHITE);
		r1.setOpaque(false);
		r1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(r1);
		
		r2=new JRadioButton("L");
		r2.setBounds(610,430,80,30);
		r2.setFont(new Font("Garamond",Font.BOLD,20));
		r2.setBackground(Color.WHITE);
		r2.setOpaque(false);
		r2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(r2);
		
		r3=new JRadioButton("XL");
		r3.setBounds(690,430,80,30);
		r3.setFont(new Font("Garamond",Font.BOLD,20));
		r3.setOpaque(false);
		r3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//r3.setBackground(Color.WHITE);
		frame.add(r3);
		
		r4=new JRadioButton("XXL");
		r4.setBounds(770,430,80,30);
		r4.setFont(new Font("Garamond",Font.BOLD,20));
		r4.setBackground(Color.WHITE);
		r4.setOpaque(false);
		r4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(r4);
		
		bg1=new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		bg1.add(r4);
		
		JLabel quantity=new JLabel("QUANTITY:");
		quantity.setBounds(450,480,120,35);
		quantity.setForeground(Color.BLACK);
		quantity.setBackground(c2);
		quantity.setFont(new Font("Garamond",Font.BOLD,20));
		frame.add(quantity);
		
		String s1 = "1";
		JLabel count = new JLabel(s1);
		count.setBounds(610, 475, 50, 50);
		count.setFont(new Font("Garamond", Font.BOLD, 25));
		count.setBorder(b1);
		count.setHorizontalAlignment(JLabel.CENTER);
		frame.add(count);
		int[] clickCount = {0}; // Create an array to hold the click count
		
		JButton plus = new JButton("+");
		plus.setBounds(660, 475, 40, 50);
		plus.setFont(new Font("Garamond", Font.PLAIN, 30));
		plus.setForeground(Color.BLACK);
		plus.setBackground(c1);
		plus.setBorder(null);
		plus.setOpaque(true);
		plus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				if (clickCount[0]<10) 
				{
					clickCount[0]++;
					quantity1=Integer.toString(1 + clickCount[0]);
					count.setText(quantity1);
				}
			}
		});
		frame.add(plus);
		
		JButton minus = new JButton("-");
		minus.setBounds(570, 470, 40, 50);
		minus.setFont(new Font("Garamond", Font.PLAIN, 40));
		minus.setForeground(Color.BLACK);
		minus.setBackground(c1);
		minus.setBorder(null);
		minus.setOpaque(true);
		minus.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				if (clickCount[0]>0)
				{
					clickCount[0]--;
					quantity1=Integer.toString(1 + clickCount[0]);
					count.setText(quantity1);
				}
			}
		});
		frame.add(minus);
		
		line2=new JLabel(new ImageIcon("images/line.png"));
		line2.setBounds(900,115,3,496);
		frame.add(line2);
		
		JLabel mayLike=new JLabel("You may Also Like");
		mayLike.setBounds(940,120,210,40);
		mayLike.setFont(new Font("Garamond",Font.BOLD,25));
		frame.add(mayLike);
		
		JLabel line3=new JLabel(new ImageIcon("images/lineh.png"));
		line3.setBounds(930,160,220,3);
		frame.add(line3);
		
		
		
		purchasep=new JButton("PROCEED TO PURCHASE");
		purchasep.setBounds(0,615,1200,50);
		purchasep.setHorizontalAlignment(JButton.CENTER);
		purchasep.setBackground(c2);
		purchasep.setForeground(Color.WHITE);
		purchasep.setFont(new Font("Garamond",Font.BOLD,28));
		purchasep.setBorder(b1);
		purchasep.addMouseListener(this);
		purchasep.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(purchasep);
		
		JButton grafictee = new JButton(new ImageIcon("image/grafictee.png"));
		grafictee.setBounds(935, 170, 192, 200);
		grafictee.setBackground(c1);
		// grafictee.addMouseListener(this);
		grafictee.setBorder(null);
		grafictee.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(grafictee);

		JLabel graficteel = new JLabel("G R F I C  T E E");
		graficteel.setBounds(970, 365, 180, 30);
		graficteel.setForeground(new Color(60, 80, 110));
		graficteel.setFont(new Font("Garamond", Font.PLAIN, 20));
		graficteel.setOpaque(false);
		frame.add(graficteel);
		
		JButton shirtc = new JButton(new ImageIcon("image/shirtc.png"));
		shirtc.setBounds(935, 390, 200, 200);
		shirtc.setBackground(c1);
		shirtc.setBorder(null);
		shirtc.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(shirtc);
		
		JLabel shirtcl = new JLabel("S H I R T");
		shirtcl.setBounds(995, 585, 200, 30);
		shirtcl.setFont(new Font("Garamond", Font.PLAIN, 20));
		shirtcl.setOpaque(false);
		frame.add(shirtcl);
		
		frame.add(panel);
		
		frame.setLocationRelativeTo(null);
        //frame.setLayout(null);
        //frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
		
		back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == back){
                    new gentsCasual();
                    frame.setVisible(false);
                }
            }
        });
		
		
		grafictee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == grafictee) {
					new grafictee();
					frame.setVisible(false);
				}
			}
		});
		
		
		shirtc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == shirtc) {
					new shirtc();
					frame.setVisible(false);
				}
			}
		});
		
		purchasep.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==purchasep)
				{
					purchasep q=new purchasep(product_poloshirt, proPrice , quantity1);
					frame.setVisible(false);
					q.setVisible(true);
				}
			}
		});
		
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == logo) {
					Interface i=new Interface();
					frame.setVisible(false);
					i.setVisible(true);
				}
			}
		});
		
	}
	
	public void mouseClicked(MouseEvent me)
	{
		
	}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==donate)
		{
			donate.setFont(new Font("Garamond",Font.BOLD,21));
		}
		else if(me.getSource()==languages)
		{
			languages.setFont(new Font("Garamond",Font.BOLD,21));
		}
		else if(me.getSource()==customercare)
		{
			customercare.setFont(new Font("Garamond",Font.BOLD,21));
		}
		else if(me.getSource()==insta)
		{
			insta.setBorder(b1);
		}
		else if(me.getSource()==twiter)
		{
			twiter.setBorder(b1);
		}
		else if(me.getSource()==facebook)
		{
			facebook.setBorder(b1);
		}
		else if(me.getSource()==p11)
		{
			p11.setBorder(b1);
		}
		else if(me.getSource()==p22)
		{
			p22.setBorder(b1);
		}
		else if(me.getSource()==p33)
		{
			p33.setBorder(b1);
		}
		else if(me.getSource()==purchasep)
		{
			purchasep.setBackground(new Color(153, 255, 51));
			purchasep.setForeground(Color.BLACK);
		}
		
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==donate)
		{
			donate.setFont(new Font("Garamond",Font.BOLD,20));
		}
		else if(me.getSource()==languages)
		{
			languages.setFont(new Font("Garamond",Font.BOLD,20));
		}
		else if(me.getSource()==customercare)
		{
			customercare.setFont(new Font("Garamond",Font.BOLD,20));
		}
		else if(me.getSource()==insta)
		{
			insta.setBorder(null);
		}
		else if(me.getSource()==twiter)
		{
			twiter.setBorder(null);
		}
		else if(me.getSource()==facebook)
		{
			facebook.setBorder(null);
		}
		else if(me.getSource()==p11)
		{
			p11.setBorder(null);
		}
		else if(me.getSource()==p22)
		{
			p22.setBorder(null);
		}
		else if(me.getSource()==p33)
		{
			p33.setBorder(null);
		}
		else if(me.getSource()==purchasep)
		{
			purchasep.setBackground(c2);
			purchasep.setForeground(Color.WHITE);
		}
	}
	
	
	
	public static void main(String args[])
	{
		new poloshirt();
		
	}
	
}