
import db.data;
import java.awt.Color;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My
 */
 /* class Node
 {
      String word;
      String meaning;
      Node link;
     public Node()
     {
         word=null;
         meaning=null;
         link=null;
     }
     public Node(String wd,String m,Node l)
     {
          word= wd;
          meaning=m;
          link=l;
     }
     public void setLink(Node n)
     {
         link=n;
     }
    
      public void setWord(String w1)
     {
         word=w1;
     }
       public void setMeaning(String w2)
     {
         meaning=w2;
     }
       public String getWord()
     {
         return word;
     } 
        public String getMeaning()
     {
         return meaning;
     }
         public Node getLink()
     {
         return link;
     } 
     
 }
class Linked_List
 {
    private int size;
    private Node start;
    public Linked_List()
    {
        size=0;
        start=null;
    }
    public boolean isEmpty()
    {
        if(start==null)
            return(true);
        else
            return(false);
    }
    public int getListsize()
    {
        return(size);
    }
    public void viewList()
    {
        Node t;
        if(isEmpty())
            System.out.println("list is empty");
        else
        {
            t=start;
             System.out.println("Size is :" +size);
            for(int j=1;j<=size;j++)
            {
             System.out.println("jgh" +j);
                System.out.println(t.getWord());
               System.out.println(t.getMeaning());
                t=t.getLink();
            }
        }  
    }    
    void insert_word(String word,String meaning)
    {
        Node n,t;
        n=new Node();
        n.setWord(word);
        n.setMeaning(meaning);
       
        t=start;
        
        if(t==null)
            start=n;
            
        else
        {
            while(t.getLink()!=null)
            {
                t=t.getLink();
                t.setLink(n);
            }
        }
       System.out.println(word);
       System.out.println(meaning);
       size++;
       
       System.out.println(size);
       
    }
        
}  */
/* class Node
{
    String word;
    String meaning;
    Node next;
}
class linked_list
{
    Node head;
    public void insert(String w,String m)
    {
        Node node=new Node();
        node.word=w;
        node.meaning=m;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show()
    {
        Node node = head;
        while(node.next!=null)
        {
            System.out.println(node.word);
            System.out.println(node.meaning); 
            node = node.next;
        }
        System.out.println(node.word);
        System.out.println(node.meaning); 

        
    }
    public String value(String in)
    {
        Node t= head;
       
            while(t!=null)
            {
                if((t.word).compareTo(in)==0)
                {
                    String m1 = t.meaning;
                    System.out.println(m1);
                    return m1;
                }
                  
                 t=t.next;
            }
            return null;
        
    }
    public String get()
    {
        Node t=head;
        while(t!=null)
        {
          String m1=t.word;
          return m1;
        }
       return null; 
    }
  }
      */
            
public class search_word extends javax.swing.JFrame {
    
  //vvvvvvvvvvvvvv  DefaultListModel defaultListModel=new DefaultListModel();
   
    
   /* String wo[]=new String[30];
    String mea[]=new String[150];
    int row;
    int i;
    int mean;
    int a; */

    /**
     * Creates new form search_word
     */
    public search_word() throws SQLException {
        this.setUndecorated(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        double width = toolkit.getScreenSize().getWidth();
        
        double height = toolkit.getScreenSize().getHeight();
        
        this.setSize((int)width, (int)height);
        initComponents();
     // vvvvvvvvvvvvvvvvvvvvv   this.bindData();
    }
     
   /* vvvvvvvvvvvv  private ArrayList getWords() throws SQLException 
    {
        ArrayList word1s=new ArrayList();
         data d1=new data();
        int row1=d1.row();
        linked_list l1=new linked_list();
       for(int z=1;z<=row1;z++)
       {
           
          word1s.add(l1.get()); 
       }
        return word1s; 
    }
    private void bindData() throws SQLException
    {
        getWords().stream().forEach((word1) -> {
            defaultListModel.addElement(word1);
            });
        word_list.setModel(defaultListModel);
        word_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    private void searchFilter(String searchTerm ) throws SQLException
    {
        DefaultListModel filteredItems=new  DefaultListModel();
        ArrayList word3s=getWords();
        
          word3s.stream().forEach((word3) -> {
           String wordName=word3.toString().toLowerCase();
           if(wordName.contains(searchTerm.toLowerCase()))
                {
                    filteredItems.addElement(word3);
                }
        }); 
        defaultListModel=filteredItems;
        word_list.setModel(defaultListModel);
    }   */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        meaning1 = new javax.swing.JTextField();
        word = new javax.swing.JTextField();
        b_search = new javax.swing.JButton();
        phone_bg = new javax.swing.JLabel();
        frame = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\My\\Downloads\\dict_logo1.jpg")); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(420, 75, 620, 200);

        meaning1.setEditable(false);
        meaning1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        meaning1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meaning1ActionPerformed(evt);
            }
        });
        jPanel1.add(meaning1);
        meaning1.setBounds(440, 560, 580, 60);

        word.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        word.setForeground(new java.awt.Color(204, 204, 204));
        word.setText("Enter Word Here");
        word.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                wordCaretUpdate(evt);
            }
        });
        word.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                wordFocusGained(evt);
            }
        });
        word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordActionPerformed(evt);
            }
        });
        word.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wordKeyReleased(evt);
            }
        });
        jPanel1.add(word);
        word.setBounds(460, 280, 310, 60);

        b_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_search.setText("SEARCH");
        b_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchActionPerformed(evt);
            }
        });
        b_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_searchKeyTyped(evt);
            }
        });
        jPanel1.add(b_search);
        b_search.setBounds(890, 290, 120, 40);

        phone_bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\My\\Documents\\NetBeansProjects\\OOPM\\AtmSimulator\\src\\w1.jpg")); // NOI18N
        jPanel1.add(phone_bg);
        phone_bg.setBounds(420, 75, 620, 630);

        frame.setIcon(new javax.swing.ImageIcon("C:\\Users\\My\\Downloads\\frame.jpg")); // NOI18N
        jPanel1.add(frame);
        frame.setBounds(370, 0, 720, 780);

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\My\\Downloads\\bg.jpg")); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1370, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_wordActionPerformed

    private void wordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordKeyPressed
        // TODO add your handling code here:
        if(word.getForeground()!=Color.BLACK)
        {
            if(word.getText().equals("Enter Word Here"))
            {
                word.setText("");
            }
            word.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_wordKeyPressed

    private void wordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_wordCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_wordCaretUpdate

    private void wordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wordFocusGained
        // TODO add your handling code here:
        word.setCaretPosition(0);
    }//GEN-LAST:event_wordFocusGained

    private void wordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordKeyReleased
        // TODO add your handling code here:
        if(word.getText().isEmpty()==true)
        {
            word.setText("Enter Word Here");
            word.setCaretPosition(0);
            word.setForeground(new java.awt.Color(204, 204, 204));
        }
      /*v vvvvvvvvvvvv try {
            searchFilter(word.getText());
        } catch (SQLException ex) {
            Logger.getLogger(search_word.class.getName()).log(Level.SEVERE, null, ex);
        } */
    }//GEN-LAST:event_wordKeyReleased

    private void b_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchActionPerformed
        // TODO add your handling code here:
      /*   data d1=new data();
        try {
            wo=d1.db_word();
            wo[0]=null;
            mea=d1.db_meaning();
            mea[0]=null;
         //   System.out.println(mea[0]); 
           row=d1.row();
       /*     for(i=1;i<=row;i++)
            {
            System.out.println(wo[i]+" : "+ mea[i]);
            
            } 
       linked_list l1=new linked_list();
       for(int k=1;k<=row;k++)
       {
           l1.insert(wo[k],mea[k]);
           
       } 
       
       l1.show();
       
       String in=word.getText();
      // System.out.println(in);
     /*  for(int a=1;a<=row;a++)
       {
           
           if((w1.compareTo(in))==0) //string w1 = word from linked list
           {
               meaning.setText(m1); //string m1 = meaning from linked list
           }
      }
       
       
       linked_list l=new linked_list();
       String m2 =l1.value(in);
       System.out.println(m2);
       if(m2!=null)
       {
           meaning1.setText(m2);
       }
       } catch (SQLException ex) {
            Logger.getLogger(options.class.getName()).log(Level.SEVERE, null, ex);
        }  */
             
    }//GEN-LAST:event_b_searchActionPerformed

    private void b_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_searchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_searchKeyTyped

    private void meaning1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meaning1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meaning1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(search_word.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_word.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_word.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_word.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new search_word().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(search_word.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_search;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel frame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField meaning1;
    private javax.swing.JLabel phone_bg;
    private javax.swing.JTextField word;
    // End of variables declaration//GEN-END:variables
}
