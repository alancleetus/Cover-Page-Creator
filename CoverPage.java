import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class CoverPage
{
   private String out="\n\n\n\n";
   private JFrame frame;
   private JPanel mainPanel;
   public JTextField profFirstName;
   public JTextField profLastName;
   public JList date;
   public JList year;
   public JList month;
   public JTextField schoolName;
   public JTextField className;
   public JTextField firstName;
   public JTextField lastName;
   public JTextField title;
   public JTextArea result;
   public JTextArea runninghead;
   public CoverPage()
   {
      Font font = new Font("Century Gothic", Font.ITALIC, 13);
      frame = new JFrame();
      //Frame Edit
      {
         frame.setLocation( 500, 200 );   //location on monitor
         frame.setTitle( "Cover Page Creator" );             //title of frame
         frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); //what happens when the box is closed
         frame.setSize( new Dimension( 800, 500 ) );
         //frame.setResizable( false );
      }
      mainPanel = new JPanel(new GridLayout(10,1));
      mainPanel.setSize( new Dimension( 390, 500 ) );
      //mainPanel.setBackground( new java.awt.Color( 22,183,179 ) );
      
      //title
      JPanel titlePanel= new JPanel(new FlowLayout(FlowLayout.LEFT));
      title = new JTextField(20);
      titlePanel.add(new JLabel("Title:                         "));
      titlePanel.add(title);
      mainPanel.add(titlePanel);
      
      //Name
      JPanel namePanel= new JPanel(new FlowLayout(FlowLayout.LEFT));
      
      firstName = new JTextField(20);
      namePanel.add(new JLabel("First Name:              "));
      namePanel.add(firstName);
      
      mainPanel.add(namePanel);
      JPanel namePanel2= new JPanel(new FlowLayout(FlowLayout.LEFT));
      lastName = new JTextField(20);
      namePanel2.add(new JLabel("Last Name:              "));
      namePanel2.add(lastName);
      mainPanel.add(namePanel2);
      
      //Class
      JPanel classPanel= new JPanel(new FlowLayout(FlowLayout.LEFT));
      className = new JTextField(20);
      classPanel.add(new JLabel("Course:                    "));
      classPanel.add(className);
      mainPanel.add(classPanel);
      
      //School Name
      JPanel schoolPanel= new JPanel(new FlowLayout(FlowLayout.LEFT));
      schoolName = new JTextField(20);
      schoolPanel.add(new JLabel("School:                     " ));
      schoolPanel.add(schoolName);
      mainPanel.add(schoolPanel);
      
      //date
      JPanel datePanel= new JPanel(new GridLayout());
      String [] dates = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", 
                        "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", 
                        "24", "25", "26", "27", "28", "29", "30", "31"};
      String [] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                           "September", "October", "November", "December"};
      String [] years = {"2015","2016","2017","2018"};
      date = new JList(dates);
      date.setVisibleRowCount(3);
      year = new JList(years);
      year.setVisibleRowCount(3);
      month = new JList(months);
      month.setVisibleRowCount(3);
      JScrollPane dateScrollPane = new JScrollPane();
      JScrollPane monthScrollPane = new JScrollPane();
      JScrollPane yearScrollPane = new JScrollPane();
      dateScrollPane.setViewportView(date);
      monthScrollPane.setViewportView(month);
      yearScrollPane.setViewportView(year);
      mainPanel.add(new JLabel(" Date:  "));
      datePanel.add(dateScrollPane);
      datePanel.add(monthScrollPane);
      datePanel.add(yearScrollPane);
      mainPanel.add(datePanel);
      
      //String selected = jList1.getSelectedItem().toString(); 
      //Prof
      JPanel profNamePanel= new JPanel(new FlowLayout(FlowLayout.LEFT));
      
      profFirstName = new JTextField(20);
      profNamePanel.add(new JLabel("Professors' First Name: "));
      profNamePanel.add(profFirstName);
      mainPanel.add(profNamePanel);
      
      JPanel profNamePanel2= new JPanel(new FlowLayout(FlowLayout.LEFT));
      profLastName = new JTextField(20);
      profNamePanel2.add(new JLabel("Professors' Last Name: " ));
      profNamePanel2.add(profLastName);
      mainPanel.add(profNamePanel2);
      
      //submit
      
      Dimension buttonSize = new Dimension(100,100);
      Color c = new java.awt.Color(28,28,28);
      
      JPanel buttonPanel= new JPanel();
      JButton submitButton = new JButton();
      submitButton.setText("Submit");
      submitButton.setSize(buttonSize);
      submitButton.setForeground(Color.WHITE);
      submitButton.setBackground(c);
      submitButton.setFont(font);
      
      submitButton.addActionListener(
            new ActionListener()
            {
               public void actionPerformed(ActionEvent e)
               {
                  String temp = title.getText();
                  temp = temp.toLowerCase();
                  out +=(""+(temp.charAt(0))).toUpperCase();
                  
                  for(int i = 1; i<=temp.length()-1; i++)
                  {
                     if(temp.charAt(i-1)==' ')
                        out +=(""+(temp.charAt(i))).toUpperCase();
                     else
                        out +=(""+(temp.charAt(i)));
                  }
                  out +="\n\n\n\n\n";
                  
                  
                  temp = firstName.getText();
                  temp = temp.toLowerCase();
                  out +=(""+(temp.charAt(0))).toUpperCase();
                  
                  for(int i = 1; i<=temp.length()-1; i++)
                  {
                     if(temp.charAt(i-1)==' ')
                        out +=(""+(temp.charAt(i))).toUpperCase();
                     else
                        out +=(""+(temp.charAt(i)));
                  }
                  out +=" ";
                  temp = lastName.getText();
                  temp = temp.toLowerCase();
                  out +=(""+(temp.charAt(0))).toUpperCase();
                  
                  for(int i = 1; i<=temp.length()-1; i++)
                  {
                     if(temp.charAt(i-1)==' ')
                        out +=(""+(temp.charAt(i))).toUpperCase();
                     else
                        out +=(""+(temp.charAt(i)));
                  }
                  
                  out +="\n";
                  
                  
                  temp = className.getText();
                  temp = temp.toLowerCase();
                  out +=(""+(temp.charAt(0))).toUpperCase();
                  
                  for(int i = 1; i<=temp.length()-1; i++)
                  {
                     if(temp.charAt(i-1)==' ')
                        out +=(""+(temp.charAt(i))).toUpperCase();
                     else
                        out +=(""+(temp.charAt(i)));
                  }
                  
                  out +="\n";
                  
                  
                                    
                  temp = schoolName.getText();
                  temp = temp.toLowerCase();
                  out +=(""+(temp.charAt(0))).toUpperCase();
                  
                  for(int i = 1; i<=temp.length()-1; i++)
                  {
                     if(temp.charAt(i-1)==' ')
                        out +=(""+(temp.charAt(i))).toUpperCase();
                     else
                        out +=(""+(temp.charAt(i)));
                  }
                  
                  out +="\n";
                  
                  
                  temp = date.getSelectedValue().toString();
                  out+=""+temp;                  
                  out +=" ";
                  temp = month.getSelectedValue().toString();
                  out+=""+temp; 
                  out +=", ";
                  temp = year.getSelectedValue().toString();
                  out+=""+temp; 
                  out +="\n";
                     
                     
                  temp = profFirstName.getText();
                  temp = temp.toLowerCase();
                  out +=(""+(temp.charAt(0))).toUpperCase();
                  
                  for(int i = 1; i<=temp.length()-1; i++)
                  {
                     if(temp.charAt(i-1)==' ')
                        out +=(""+(temp.charAt(i))).toUpperCase();
                     else
                        out +=(""+(temp.charAt(i)));
                  }
                  out +=" ";
                  temp = profLastName.getText();
                  temp = temp.toLowerCase();
                  out +=(""+(temp.charAt(0))).toUpperCase();
                  
                  for(int i = 1; i<=temp.length()-1; i++)
                  {
                     if(temp.charAt(i-1)==' ')
                        out +=(""+(temp.charAt(i))).toUpperCase();
                     else
                        out +=(""+(temp.charAt(i)));
                  }
                  
                  out +="\n\n\n";
                  
                  out +="Running head: "+title.getText().toUpperCase();
                  result.setText(out);
                     
                 // System.out.println(out);
               }
            }
         );
         
      buttonPanel.add(submitButton);
      mainPanel.add(buttonPanel);
      JPanel secondPanel = new JPanel(new GridLayout());
      
      result = new JTextArea();
      
      result.setPreferredSize( new Dimension(380,500 ) );
      result.setEditable( true );
      result.setLineWrap( true );
      secondPanel.add(result);
      
      frame.add( mainPanel, BorderLayout.WEST );
      frame.add( secondPanel, BorderLayout.CENTER );
      
      setFontForAll(frame, font);
      result.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      frame.setVisible( true );
   }
   
   private void setFontForAll(JFrame f, java.awt.Font font) {
      f.setFont(font);
      setFontRecursive(f.getContentPane().getComponents(), font);
   }

   private static void setFontRecursive(Component[] components, java.awt.Font font) {
      for (Component c : components) {
         c.setFont(font);
         if (c instanceof java.awt.Container)
            setFontRecursive(((java.awt.Container)c).getComponents(), font);
      }
   }

   public String getPage()
   {
      return out;
   }
   
   public static void main(String [] args)
   {
      CoverPage c= new CoverPage();
      
   }
}