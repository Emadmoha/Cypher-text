/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import com.sun.java.swing.plaf.windows.WindowsScrollPaneUI;
import java.awt.Point;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author EmadMohamed
 */
public class payfir extends javax.swing.JPanel {

  private int length = 0;
  
  // table for Playfair cipher
  private String [][] table;
  
    public payfir() {
        initComponents();
        jScrollPane1.setUI(new WindowsScrollPaneUI());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jkey = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Key");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jButton1.setText("encrypted");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("decrypted");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jkey))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jkey, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        
   
       // prompts user for the keyword to use for encoding & creates tables
  
    String keyword = jkey.getText();
 
    table = this.cipherTable(keyword);
    
    // prompts user for message to be encoded
 
    String input = jTextArea1.getText();
    
   
    
    // encodes and then decodes the encoded message
    String output = cipher(input);
   
    
    // output the results to user

    this.printResults(output);
    jTextArea1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   // prompts user for the keyword to use for encoding & creates tables
  
    String keyword = jkey.getText();
 
    table = this.cipherTable(keyword);
    
    // prompts user for message to be encoded
 
    String input = jLabel2.getText();
    
   
    
    // encodes and then decodes the encoded message
    
    String decodedOutput = decode(input);
    
    // output the results to user

    this.printResultss(decodedOutput);
    jLabel2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jkey;
    // End of variables declaration//GEN-END:variables
 public void Playfair(){
  
    // prompts user for the keyword to use for encoding & creates tables
   
    
    // output the results to user

  }
  
  // parses any input string to remove numbers, punctuation,
  // replaces any J's with I's, and makes string all caps
  private String parseString(Scanner s){
     
    String parse = s.toString();
    parse = parse.toUpperCase();
    parse = parse.replaceAll("[^A-Z]", "");
    parse = parse.replace("J", "I");
    return parse;
  }
  
  // creates the cipher table based on some input string (already parsed)
  private String[][] cipherTable(String key){
    String[][] playfairTable = new String[5][5];
    String keyString = key + "ABCDEFGHIKLMNOPQRSTUVWXYZ";
    
    // fill string array with empty string
    for(int i = 0; i < 5; i++)
      for(int j = 0; j < 5; j++)
        playfairTable[i][j] = "";
    
    for(int k = 0; k < keyString.length(); k++){
      boolean repeat = false;
      boolean used = false;
      for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
          if(playfairTable[i][j].equals("" + keyString.charAt(k))){
            repeat = true;
          }else if(playfairTable[i][j].equals("") && !repeat && !used){
            playfairTable[i][j] = "" + keyString.charAt(k);
            used = true;
          }
        }
      }
    }
    return playfairTable;
  }
  
  // cipher: takes input (all upper-case), encodes it, and returns output
  private String cipher(String in){
    length = (int) in.length() / 2 + in.length() % 2;
    
    // insert x between double-letter digraphs & redefines "length"
    for(int i = 0; i < (length - 1); i++){
      if(in.charAt(2 * i) == in.charAt(2 * i + 1)){
        in = new StringBuffer(in).insert(2 * i + 1, 'X').toString();
        length = (int) in.length() / 2 + in.length() % 2;
      }
    }
    
    // adds an x to the last digraph, if necessary
    String[] digraph = new String[length];
    for(int j = 0; j < length ; j++){
      if(j == (length - 1) && in.length() / 2 == (length - 1))
        in = in + "X";
      digraph[j] = in.charAt(2 * j) +""+ in.charAt(2 * j + 1);
    }
    
    // encodes the digraphs and returns the output
    String out = "";
    String[] encDigraphs = new String[length];
    encDigraphs = encodeDigraph(digraph);
    for(int k = 0; k < length; k++)
      out = out + encDigraphs[k];
    return out;
  }
  
  // encodes the digraph input with the cipher's specifications
  public String[] encodeDigraph(String di[]){
    String[] enc = new String[length];
    for(int i = 0; i < length; i++){
      char a = di[i].charAt(0);
      char b = di[i].charAt(1);
      int r1 = (int) getPoint(a).getX();
      int r2 = (int) getPoint(b).getX();
      int c1 = (int) getPoint(a).getY();
      int c2 = (int) getPoint(b).getY();
      
      // case 1: letters in digraph are of same row, shift columns to right
      if(r1 == r2){
        c1 = (c1 + 1) % 5;
        c2 = (c2 + 1) % 5;
        
      // case 2: letters in digraph are of same column, shift rows down
      }else if(c1 == c2){
        r1 = (r1 + 1) % 5;
        r2 = (r2 + 1) % 5;
      
      // case 3: letters in digraph form rectangle, swap first column # with second column #
      }else{
        int temp = c1;
        c1 = c2;
        c2 = temp;
      }
      
      //performs the table look-up and puts those values into the encoded array
      enc[i] = table[r1][c1] + "" + table[r2][c2];
    }
    return enc;
  }
  
  // decodes the output given from the cipher and decode methods (opp. of encoding process)
  private String decode(String out){
    String decoded = "";
    for(int i = 0; i < out.length() / 2; i++){
      char a = out.charAt(2*i);
      char b = out.charAt(2*i+1);
      int r1 = (int) getPoint(a).getX();
      int r2 = (int) getPoint(b).getX();
      int c1 = (int) getPoint(a).getY();
      int c2 = (int) getPoint(b).getY();
      if(r1 == r2){
        c1 = (c1 + 4) % 5;
        c2 = (c2 + 4) % 5;
      }else if(c1 == c2){
        r1 = (r1 + 4) % 5;
        r2 = (r2 + 4) % 5;
      }else{
        int temp = c1;
        c1 = c2;
        c2 = temp;
      }
      decoded = decoded + table[r1][c1] + table[r2][c2];
    }
    return decoded;
  }
  
  // returns a point containing the row and column of the letter
  private Point getPoint(char c){
    Point pt = new Point(0,0);
    for(int i = 0; i < 5; i++)
      for(int j = 0; j < 5; j++)
        if(c == table[i][j].charAt(0))
          pt = new Point(i,j);
    return pt;
  }
  
  // prints the cipher table out for the user
  private void printTable(String[][] printedTable){
    System.out.println("This is the cipher table from the given keyword.");
    System.out.println();
    
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        System.out.print(printedTable[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println();
  }
  
  // prints results (encoded and decoded)
  private void printResults(String enc){
   
   jLabel2.setText(enc);
   
  }
   private void printResultss(String dec){
   
   jTextArea1.setText(dec);
   
  }
}


