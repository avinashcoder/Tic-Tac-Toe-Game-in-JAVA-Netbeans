/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hacker
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }
    private String playerone="Player one";
    private String playertwo="Player two";
    int count1=0;
    int count2=0;
    int count3=0;
    int player=0;
    int doubleplayer=0;
    int singleplayer=0;
    int drawby=0;
    int symbolx=0;
    int symboly=0;
    String value;
    int symbol=1;
    int computer=0;
    int a=1,b=1,c=1,d=1,e=1,f=1,g=1,h=1,i=1;
    int computerwin=0;
    int win=1;
    private void computerMove(){
        
        if(five.getText().equals(""))
        {
             if(value=="X")  
                five.setForeground(Color.red);
            else
                five.setForeground(Color.blue);
            five.setText(value);
            e=0;
            change();
        }
        else if(one.getText().equals(""))
        {
             if(value=="X")  
                one.setForeground(Color.red);
            else
                one.setForeground(Color.blue);
            one.setText(value);
            a=0;
            change();
        }
        else if(three.getText().equals(five.getText())&&seven.getText().equals(""))
        {
             if(value=="X")  
                seven.setForeground(Color.red);
            else
                seven.setForeground(Color.blue);
            seven.setText(value);
            g=0;
            change();
        }
        else if(one.getText().equals(five.getText())&&nine.getText().equals(""))
        {
             if(value=="X")  
                nine.setForeground(Color.red);
            else
                nine.setForeground(Color.blue);
            nine.setText(value);
            i=0;
            change();
        }
        else if(three.getText().equals(""))
        {
             if(value=="X")  
                three.setForeground(Color.red);
            else
                three.setForeground(Color.blue);
            three.setText(value);
            c=0;
            change();
        }
        else if(five.getText().equals(six.getText())&&four.getText().equals(""))
        {
             if(value=="X")  
                seven.setForeground(Color.red);
            else
                seven.setForeground(Color.blue);
            seven.setText(value);
            g=0;
            change();
        }
        else if(four.getText().equals(five.getText())&&six.getText().equals(""))
        {
             if(value=="X")  
                six.setForeground(Color.red);
            else
                six.setForeground(Color.blue);
            six.setText(value);
            f=0;
            change();
        }
        else if(one.getText().equals(three.getText())&&two.getText().equals(""))
        {
             if(value=="X")  
                two.setForeground(Color.red);
            else
                two.setForeground(Color.blue);
            two.setText(value);
            b=0;
            change();
        }
        else if(one.getText().equals(two.getText())&&three.getText().equals(""))
        {
             if(value=="X")  
                three.setForeground(Color.red);
            else
                three.setForeground(Color.blue);
            three.setText(value);
            c=0;
            change();
        }
        else if(one.getText().equals(four.getText())&&seven.getText().equals(""))
        {
             if(value=="X")  
                seven.setForeground(Color.red);
            else
                seven.setForeground(Color.blue);
            seven.setText(value);
            g=0;
            change();
        }
        else if(three.getText().equals(six.getText())&&nine.getText().equals(""))
        {
             if(value=="X")  
                nine.setForeground(Color.red);
            else
                nine.setForeground(Color.blue);
            nine.setText(value);
            i=0;
            change();
        }
        else if(three.getText().equals(nine.getText())&&six.getText().equals(""))
        {
             if(value=="X")  
                seven.setForeground(Color.red);
            else
                seven.setForeground(Color.blue);
            seven.setText(value);
            g=0;
            change();
        }
        else if(three.getText().equals(nine.getText())&&nine.getText().equals(""))
        {
             if(value=="X")  
                nine.setForeground(Color.red);
            else
                nine.setForeground(Color.blue);
            nine.setText(value);
            i=0;
            change();
        }
        else if(eight.getText().equals(nine.getText())&&seven.getText().equals(""))
        {
             if(value=="X")  
                seven.setForeground(Color.red);
            else
                seven.setForeground(Color.blue);
            seven.setText(value);
            g=0;
            change();
        }
        else if(seven.getText().equals(eight.getText())&&nine.getText().equals(""))
        {
             if(value=="X")  
                nine.setForeground(Color.red);
            else
                nine.setForeground(Color.blue);
            nine.setText(value);
            i=0;
            change();
        }
        else if(seven.getText().equals(nine.getText())&&eight.getText().equals(""))
        {
             if(value=="X")  
                eight.setForeground(Color.red);
            else
                eight.setForeground(Color.blue);
            eight.setText(value);
            h=0;
            change();
        }
        else if(two.getText().equals(five.getText())&&eight.getText().equals(""))
        {
             if(value=="X")  
                eight.setForeground(Color.red);
            else
                eight.setForeground(Color.blue);
            eight.setText(value);
            h=0;
            change();
        }
        else if(two.getText().equals(eight.getText())&&five.getText().equals(""))
        {
             if(value=="X")  
                five.setForeground(Color.red);
            else
                five.setForeground(Color.blue);
            five.setText(value);
            e=0;
            change();
        }
        else if(three.getText().equals(""))
        {
           if(value=="X")  
                three.setForeground(Color.red);
            else
                three.setForeground(Color.blue);
            three.setText(value);
            c=0;
            change();  
        }
        else if(nine.getText().equals(""))
        {
           if(value=="X")  
                nine.setForeground(Color.red);
            else
                nine.setForeground(Color.blue);
            nine.setText(value);
            i=0;
            change();  
        }
        else if(seven.getText().equals(""))
        {
           if(value=="X")  
                seven.setForeground(Color.red);
            else
                seven.setForeground(Color.blue);
            seven.setText(value);
            g=0;
            change();  
        }
        else if(four.getText().equals(""))
        {
           if(value=="X")  
                four.setForeground(Color.red);
            else
                four.setForeground(Color.blue);
            four.setText(value);
            d=0;
            change();  
        }
        else if(two.getText().equals(""))
        {
           if(value=="X")  
                two.setForeground(Color.red);
            else
                two.setForeground(Color.blue);
            two.setText(value);
            b=0;
            change();  
        }
        else if(six.getText().equals(""))
        {
           if(value=="X")  
                six.setForeground(Color.red);
            else
                six.setForeground(Color.blue);
            six.setText(value);
            f=0;
            change();  
        }
       
    }
    private void playerName(){
        try
        {
        if(computer==1)
        {
           playerone=JOptionPane.showInputDialog(this,"Enter your name  :-","player Name",JOptionPane.INFORMATION_MESSAGE).toUpperCase(); 
           playertwo="Computer";
        }
        else
        {
        playerone=JOptionPane.showInputDialog(this,"Enter the name of First Player :-","player Name",JOptionPane.INFORMATION_MESSAGE).toUpperCase();
        playertwo=JOptionPane.showInputDialog(this,"Enter the name of Second Player :-","player Name",JOptionPane.INFORMATION_MESSAGE).toUpperCase();
        }
        if(playerone.equals(""))
        {
            playerone="Player one";
        }
        if(playertwo.equals(""))
        {
            playertwo="Player two";
        }
        playernameone.setText(String.valueOf(playerone)+"'s Point :- ");
        playernametwo.setText(String.valueOf(playertwo)+"'s Point :- ");
        }
        catch(Exception e)
        {}
        
    }
    private void resetBackgound(){
        jPanel2.setBackground(Color.WHITE);
        jPanel3.setBackground(Color.WHITE);
        jPanel4.setBackground(Color.WHITE);
        jPanel5.setBackground(Color.WHITE);
        jPanel6.setBackground(Color.WHITE);
        jPanel7.setBackground(Color.WHITE);
        jPanel8.setBackground(Color.WHITE);
        jPanel9.setBackground(Color.WHITE);
        jPanel10.setBackground(Color.WHITE);
    }
    private void resetGame(){
       one.setText("");
        two.setText("");
        three.setText("");
        four.setText("");
        five.setText("");
        six.setText("");
        seven.setText("");
        eight.setText("");
        nine.setText("");
        a=1;
        b=1;
        c=1;
        d=1;e=1;f=1;g=1;h=1;i=1;
        
        change();
        
    }
    private void xWin()
    {
       turn.setText("");
       JOptionPane.showMessageDialog(null, String.valueOf(playerone)+" wins the Match");
       JOptionPane.showMessageDialog(null, String.valueOf(playerone)+" start the Game");
       count1++;
       point1.setText(String.valueOf(count1));
       resetGame();
       resetBackgound();
       win=0;
    }
    private void yWin()
    {
       turn.setText("");
       JOptionPane.showMessageDialog(null, String.valueOf(playertwo)+" wins the Match");
       JOptionPane.showMessageDialog(null, String.valueOf(playertwo)+" start the Game");
       count2++;
       point2.setText(String.valueOf(count2));
       resetGame();
       resetBackgound();
       win=0;
       if(singleplayer==1)
       {
           computerMove();
       }
    }
    private void whowin(){
       String label1=one.getText();
       String label2=two.getText();
       String label3=three.getText();
       String label4=four.getText();
       String label5=five.getText();
       String label6=six.getText();
       String label7=seven.getText();
       String label8=eight.getText();
       String label9=nine.getText();
       
       if(label1=="X" &&label2=="X" &&label3=="X")
       {
           jPanel2.setBackground(Color.YELLOW);
           jPanel3.setBackground(Color.YELLOW);
           jPanel4.setBackground(Color.YELLOW);
           if(drawby==1)
              xWin();
           else
              yWin();
       }
       else if(label4=="X" &&label5=="X" &&label6=="X")
       {
           jPanel5.setBackground(Color.YELLOW);
           jPanel7.setBackground(Color.YELLOW);
           jPanel8.setBackground(Color.YELLOW);
           if(drawby==1)
              xWin();
           else
              yWin();
       }
       else if(label7=="X" &&label8=="X" &&label9=="X")
       {
           jPanel6.setBackground(Color.YELLOW);
           jPanel9.setBackground(Color.YELLOW);
           jPanel10.setBackground(Color.YELLOW);
           if(drawby==1)
              xWin();
           else
              yWin();
       }
       else if(label1=="X" &&label4=="X" &&label7=="X")
       {
           jPanel2.setBackground(Color.YELLOW);
           jPanel5.setBackground(Color.YELLOW);
           jPanel6.setBackground(Color.YELLOW);
           if(drawby==1)
              xWin();
           else
              yWin();
       }
       else if(label2=="X" &&label5=="X" &&label8=="X")
       {
           jPanel3.setBackground(Color.YELLOW);
           jPanel7.setBackground(Color.YELLOW);
           jPanel9.setBackground(Color.YELLOW);
           if(drawby==1)
              xWin();
           else
              yWin();
       }
       else if(label3=="X" &&label6=="X" &&label9=="X")
       {
           jPanel4.setBackground(Color.YELLOW);
           jPanel8.setBackground(Color.YELLOW);
           jPanel10.setBackground(Color.YELLOW);
           if(drawby==1)
              xWin();
           else
              yWin();
       }
       else if(label1=="X" &&label5=="X" &&label9=="X")
       {
           jPanel2.setBackground(Color.YELLOW);
           jPanel7.setBackground(Color.YELLOW);
           jPanel10.setBackground(Color.YELLOW);
           if(drawby==1)
              xWin();
           else
              yWin();
       }
       else if(label3=="X" &&label5=="X" &&label7=="X")
       {
           jPanel4.setBackground(Color.YELLOW);
           jPanel6.setBackground(Color.YELLOW);
           jPanel7.setBackground(Color.YELLOW);
           if(drawby==1)
              xWin();
           else
              yWin();
       }
       
       
       else if(label1=="O" &&label2=="O" &&label3=="O")
       {
           jPanel2.setBackground(Color.YELLOW);
           jPanel3.setBackground(Color.YELLOW);
           jPanel4.setBackground(Color.YELLOW);
           if(drawby==0)
              xWin();
           else
              yWin();
       }
       else if(label4=="O" &&label5=="O" &&label6=="O")
       {
           jPanel5.setBackground(Color.YELLOW);
           jPanel7.setBackground(Color.YELLOW);
           jPanel8.setBackground(Color.YELLOW);
           if(drawby==0)
              xWin();
           else
              yWin();
       }
       else if(label7=="O" &&label8=="O" &&label9=="O")
       {
           jPanel6.setBackground(Color.YELLOW);
           jPanel9.setBackground(Color.YELLOW);
           jPanel10.setBackground(Color.YELLOW);
           if(drawby==0)
              xWin();
           else
              yWin();
       }
       else if(label1=="O" &&label4=="O" &&label7=="O")
       {
           jPanel2.setBackground(Color.YELLOW);
           jPanel5.setBackground(Color.YELLOW);
           jPanel6.setBackground(Color.YELLOW);
           if(drawby==0)
              xWin();
           else
              yWin();
       }
       else if(label2=="O" &&label5=="O" &&label8=="O")
       {
           jPanel3.setBackground(Color.YELLOW);
           jPanel7.setBackground(Color.YELLOW);
           jPanel9.setBackground(Color.YELLOW);
           if(drawby==0)
              xWin();
           else
              yWin();
       }
       else if(label3=="O" &&label6=="O" &&label9=="O")
       {
           jPanel4.setBackground(Color.YELLOW);
           jPanel8.setBackground(Color.YELLOW);
           jPanel10.setBackground(Color.YELLOW);
           if(drawby==0)
              xWin();
           else
              yWin();
       }
       else if(label1=="O" &&label5=="O" &&label9=="O")
       {
           jPanel2.setBackground(Color.YELLOW);
           jPanel7.setBackground(Color.YELLOW);
           jPanel10.setBackground(Color.YELLOW);
           if(drawby==0)
              xWin();
           else
              yWin();
       }
       else if(label3=="O" &&label5=="O" &&label7=="O")
       {
           jPanel4.setBackground(Color.YELLOW);
           jPanel6.setBackground(Color.YELLOW);
           jPanel7.setBackground(Color.YELLOW);
           if(drawby==0)
              xWin();
           else
              yWin();
       }
       else if(!(one.getText()=="" || two.getText()=="" || three.getText()=="" || four.getText()=="" || five.getText()=="" || six.getText()=="" || seven.getText()=="" || eight.getText()=="" || nine.getText()==""))
       {
        JOptionPane.showMessageDialog(null, "Match is Draw");
        win=0;
        turn.setText("");
        if(drawby==1)
        {
           if(value=="X")
           {
              JOptionPane.showMessageDialog(null,String.valueOf(playertwo)+" will start the game");
              resetGame();
              if(singleplayer==1)
              {
                  computerMove();
              }
           }
           else
           {
              JOptionPane.showMessageDialog(null,String.valueOf(playerone)+" will start the game");
              resetGame();
           }
        }
        else
        {
           if(value=="O")
           {
              JOptionPane.showMessageDialog(null,String.valueOf(playertwo)+" will start the game");
              resetGame();
              if(singleplayer==1)
              {
                  computerMove();
              }
           }
           else
           {
              JOptionPane.showMessageDialog(null,String.valueOf(playerone)+" will start the game"); 
              resetGame();
           }
        }
           count3++;
           draw.setText(String.valueOf(count3));
       }
    }
    
    
    private void change(){
        if(doubleplayer==1)
        {
            if(drawby==1)
            {
                if(value=="X")
                {
                    turn.setForeground(Color.blue);
                    turn.setText(playertwo+"'s TURN");
                }
                else
                {
                    turn.setForeground(Color.red);
                    turn.setText(playerone+"'s TURN");
                }  
            }
            else
            {
                if(value=="O")
                {
                    turn.setForeground(Color.red);
                    turn.setText(playertwo+"'s TURN");
                }
                else
                {
                    turn.setForeground(Color.blue);
                    turn.setText(playerone+"'s TURN");
                }
            }
        }
            if(value.equals("X"))
            {
                value="O";
               
            }   
            else
            {
                value="X";
                
            }
          
    }
    private void checksymbol(){
       JOptionPane.showMessageDialog(null, String.valueOf(playerone)+" Select Symbol First");
    }
    private void checkplayer(){
       JOptionPane.showMessageDialog(null, "First Select Single Player or Double Player");
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reset = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        playernameone = new javax.swing.JLabel();
        playernametwo = new javax.swing.JLabel();
        point1 = new javax.swing.JLabel();
        point2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        draw = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        one = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        two = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        three = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        four = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        seven = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        five = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        six = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        eight = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        nine = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        single = new javax.swing.JRadioButton();
        doublep = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        x = new javax.swing.JRadioButton();
        o = new javax.swing.JRadioButton();
        develperisAvinash = new javax.swing.JLabel();
        turn = new javax.swing.JLabel();
        showsymbolo = new javax.swing.JLabel();
        showsymbolx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic-Tac-Toe");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        reset.setBackground(new java.awt.Color(0, 204, 0));
        reset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        restart.setBackground(new java.awt.Color(0, 0, 153));
        restart.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        restart.setForeground(new java.awt.Color(255, 255, 255));
        restart.setText("RE-START");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("QUIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(51, 0, 204));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));

        playernameone.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        playernameone.setForeground(new java.awt.Color(255, 255, 255));
        playernameone.setText("Player One's Point :-");

        playernametwo.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        playernametwo.setForeground(new java.awt.Color(255, 255, 255));
        playernametwo.setText("Player two's Point:-");

        point1.setBackground(new java.awt.Color(255, 255, 255));
        point1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        point1.setForeground(new java.awt.Color(255, 255, 255));
        point1.setText("0");

        point2.setBackground(new java.awt.Color(255, 255, 255));
        point2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        point2.setForeground(new java.awt.Color(255, 255, 255));
        point2.setText("0");

        jLabel6.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SCORE BOARD");

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Match Draw :-");

        draw.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        draw.setForeground(new java.awt.Color(255, 255, 255));
        draw.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("V/S");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(playernametwo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(point2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(draw))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(playernameone, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(point1)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playernameone)
                    .addComponent(point1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playernametwo)
                    .addComponent(point2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(draw))
                .addGap(31, 31, 31))
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        one.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        one.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        two.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        three.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        four.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        four.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        seven.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        seven.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        five.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        five.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        six.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        six.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        eight.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        eight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        nine.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        nine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nine, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nine, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Players");

        single.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        single.setForeground(new java.awt.Color(255, 255, 255));
        single.setText("Single Player");
        single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleActionPerformed(evt);
            }
        });

        doublep.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        doublep.setForeground(new java.awt.Color(255, 255, 255));
        doublep.setText("Double Players");
        doublep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doublepActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(51, 0, 204));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Symbol");

        x.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        x.setForeground(new java.awt.Color(255, 255, 255));
        x.setText("    X");
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });

        o.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        o.setForeground(new java.awt.Color(255, 255, 255));
        o.setText("    O");
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(x)
                .addGap(18, 18, 18)
                .addComponent(o)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(doublep))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(single))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(single)
                .addGap(18, 18, 18)
                .addComponent(doublep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        develperisAvinash.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        develperisAvinash.setForeground(new java.awt.Color(0, 153, 0));
        develperisAvinash.setText("Developed by AVINASH KUMAR SINGH (3rd year CSE)");

        turn.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        turn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        showsymbolo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        showsymbolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        showsymbolx.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        showsymbolx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addComponent(reset)
                                        .addGap(178, 178, 178))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(179, 179, 179)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(showsymbolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(showsymbolx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(59, 59, 59))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(exit)
                                .addGap(105, 105, 105))
                            .addComponent(develperisAvinash, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(restart)
                                .addGap(67, 67, 67)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showsymbolx, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showsymbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(restart)
                        .addGap(33, 33, 33)
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(develperisAvinash, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(reset))
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
        // TODO add your handling code here:
        if(symbol==1)
        {
           value="O";
           symbol=0;
           drawby=0;
           o.setSelected(true);
           x.setSelected(false);
           JOptionPane.showMessageDialog(null,playerone+" selected Symbol 'O' and "+playertwo+" selected symbol 'X'\n     You can start the Game Now");
           turn.setForeground(Color.blue);
           turn.setText(String.valueOf(playerone+" Turn"));
           showsymbolx.setForeground(Color.blue);
           showsymbolx.setText(playerone+" = 'O'");
           showsymbolo.setForeground(Color.red);
           showsymbolo.setText(playertwo+" = 'X'");
           
        }  
        else
        {
          o.setSelected(false);
          JOptionPane.showMessageDialog(null,"Ones Selected Can't change");
        }
        if(doubleplayer==1)
        {
            if(value=="X")
        {
            turn.setForeground(Color.red);
            turn.setText(playerone+"'s TURN");
        }
        else
        {
            turn.setForeground(Color.blue);
            turn.setText(playerone+"'s TURN");
        }
        }
        
    }//GEN-LAST:event_oActionPerformed

    private void singleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleActionPerformed
        // TODO add your handling code here:
        if(doubleplayer==0)
        {
        computer=1;
        player=1;
        singleplayer=1;
        single.setSelected(true);
        doublep.setSelected(false);
        playerName();
        turn.setForeground(Color.blue);
        turn.setText(String.valueOf(playerone)+"!!!!! Plese Select Symbol");
       }
        else
        {
          single.setSelected(false);
          JOptionPane.showMessageDialog(null,"Ones Selected Can't change");  
        }
    }//GEN-LAST:event_singleActionPerformed

    private void doublepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doublepActionPerformed
        // TODO add your handling code here:
        if(singleplayer==0)
        {
        player=1;
        doubleplayer=1;
        playerName();
        doublep.setSelected(true);
        single.setSelected(false);
        turn.setForeground(Color.blue);
        turn.setText(String.valueOf(playerone)+"!!!!! Plese Select Symbol");
        }
        else
        {
          doublep.setSelected(false);
          JOptionPane.showMessageDialog(null,"Ones Selected Can't change");
        }
    }//GEN-LAST:event_doublepActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
       
        if(symbol==1)
        {
           value="X";
           symbol=0;
           drawby=1;
           x.setSelected(true);
           o.setSelected(false);
           JOptionPane.showMessageDialog(null,playerone+" selected Symbol 'X' and "+playertwo+" selected symbol 'O'\n                "+playerone+" !!!!!!!Plese Start the Game Now");
           showsymbolx.setForeground(Color.red);
           showsymbolx.setText(playerone+" = 'X'");
           showsymbolo.setForeground(Color.blue);
           showsymbolo.setText(playertwo+" = 'O'");
           turn.setForeground(Color.red);
           turn.setText(String.valueOf(playerone+" Turn"));
        }
        else
        {
           x.setSelected(false);
           JOptionPane.showMessageDialog(null,"Ones Selected Can't change");
        }
        if(doubleplayer==1)
        {
            if(value=="X")
        {
            turn.setForeground(Color.red);
            turn.setText(playerone+"'s TURN");
        }
        else
        {
            turn.setForeground(Color.blue);
            turn.setText(playerone+"'s TURN");
        }
        }
       
    }//GEN-LAST:event_xActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        one.setText("");
        two.setText("");
        three.setText("");
        four.setText("");
        five.setText("");
        six.setText("");
        seven.setText("");
        eight.setText("");
        nine.setText("");
        change();
        a=1;
        b=1;
        c=1;
        d=1;e=1;f=1;g=1;h=1;i=1;
        if(drawby==1)
        {
          if(value=="X")
              JOptionPane.showMessageDialog(null,String.valueOf(playerone)+" will start the game");  
          else
             JOptionPane.showMessageDialog(null,String.valueOf(playertwo)+" will start the game");
        }
        else
        {
          if(value=="X")
              JOptionPane.showMessageDialog(null,String.valueOf(playertwo)+" will start the game");
           else
              JOptionPane.showMessageDialog(null,String.valueOf(playerone)+" will start the game");
        }
        count3++;
        draw.setText(String.valueOf(count3));
        if(singleplayer==1)
        {
            computerMove();
        }
    }//GEN-LAST:event_resetActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        // TODO add your handling code here
        frame=new JFrame();
        if(JOptionPane.showConfirmDialog(frame,"Are you Sure Want to restart the GAME...? Your Previous Game and Data is Lost","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
        one.setText("");
        two.setText("");
        three.setText("");
        four.setText("");
        five.setText("");
        six.setText("");
        seven.setText("");
        eight.setText("");
        nine.setText("");
        a=1;
        b=1;
        c=1;
        d=1;e=1;f=1;g=1;h=1;i=1;
        count1=0;count2=0;count3=0;
        point1.setText("0");point2.setText("0");draw.setText("0");
        value="";
        player=0;
        doubleplayer=0;
        singleplayer=0;
        drawby=0;
        symbol=1;
        resetBackgound();
        o.setSelected(false);
        x.setSelected(false);
        single.setSelected(false);
        doublep.setSelected(false);
        playernameone.setText("Player one's Point");
        playernametwo.setText("Player two's Point");
        computer=0;
        win=1;
        turn.setText("");
        showsymbolx.setText("");
        showsymbolo.setText("");
        playerone="Player One";
        playertwo="Player Two";
        }
    }//GEN-LAST:event_restartActionPerformed

    private void oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseClicked
        // TODO add your handling code here:
        if(player==1)
        {
          if(symbol==0) 
          {
          if(a==1)
          { 
            if(value=="X")  
                one.setForeground(Color.red);
            else
                one.setForeground(Color.blue);
            one.setText(value);
            a=0;
            win=1;
            change();
            whowin();
            if(singleplayer==1&&win==1)
                computerMove();
          }
          }
          else
              checksymbol();
        }
        else
            checkplayer();
        whowin();
    }//GEN-LAST:event_oneMouseClicked

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
        // TODO add your handling code here:
        if(player==1)
        {
          if(symbol==0)
          {    
          if(b==1)
          {
            if(value=="X")  
                two.setForeground(Color.red);
            else
                two.setForeground(Color.blue);  
            two.setText(value);
            b=0;
            win=1;
            change(); 
            whowin();
            if(singleplayer==1&&win==1)
                computerMove();
          }
          }
          else
              checksymbol();
        }
        else
            checkplayer();
         whowin();
    }//GEN-LAST:event_twoMouseClicked

    private void threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseClicked
        // TODO add your handling code here:
         if(player==1)
        {
          if(symbol==0)
          {
          if(c==1)
          {
            if(value=="X")  
                three.setForeground(Color.red);
            else
                three.setForeground(Color.blue);
            three.setText(value);
            c=0;
            win=1;
            change();
            whowin();
            if(singleplayer==1&&win==1)
                computerMove();
          }
          }
          else
              checksymbol();
        }
        else
            checkplayer();
         whowin();
    }//GEN-LAST:event_threeMouseClicked

    private void fourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseClicked
        // TODO add your handling code here:
         if(player==1)
        {
          if(symbol==0)
            {
          if(d==1)
          {
            if(value=="X")  
                four.setForeground(Color.red);
            else
                four.setForeground(Color.blue);
            four.setText(value);
            d=0;
            win=1;
            change();
            whowin();
            if(singleplayer==1&&win==1)
                computerMove();
          }
          }
          else
              checksymbol();
        }
        else
            checkplayer();
         whowin();
    }//GEN-LAST:event_fourMouseClicked

    private void fiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseClicked
        // TODO add your handling code here:
         if(player==1)
        {
          if(symbol==0)
          {
          if(e==1)
          {
            if(value=="X")  
                five.setForeground(Color.red);
            else
                five.setForeground(Color.blue);
            five.setText(value);
            e=0;
            win=1;
            change();
            whowin();
            if(singleplayer==1&&win==1)
                computerMove();
          }
          }
          else
              checksymbol();
        }
        else
            checkplayer();
         whowin();
    }//GEN-LAST:event_fiveMouseClicked

    private void sixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseClicked
        // TODO add your handling code here:
         if(player==1)
        {
          if(symbol==0)
          {
          if(f==1)
          {
            if(value=="X")  
                six.setForeground(Color.red);
            else
                six.setForeground(Color.blue);
            six.setText(value);
            f=0;
            win=1;
            change();
            whowin();
            if(singleplayer==1&&win==1)
                computerMove();
          }
          }
          else
              checksymbol();
        }
        else
            checkplayer();
         whowin();
    }//GEN-LAST:event_sixMouseClicked

    private void sevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseClicked
        // TODO add your handling code here:
         if(player==1)
        {
          if(symbol==0)
          {
          if(g==1)
          {
            if(value=="X")  
                seven.setForeground(Color.red);
            else
                seven.setForeground(Color.blue);
            seven.setText(value);
            g=0;
            win=1;
            change();
            whowin();
            if(singleplayer==1&&win==1)
                computerMove();
          }
          }
          else
              checksymbol();
        }
        else
            checkplayer();
         whowin();
    }//GEN-LAST:event_sevenMouseClicked

    private void eightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseClicked
        // TODO add your handling code here:
         if(player==1)
        {
          if(symbol==0)
          {
          if(h==1)
          {
            if(value=="X")  
                eight.setForeground(Color.red);
            else
                eight.setForeground(Color.blue);
            eight.setText(value);
            h=0;
            win=1;
            change();
            whowin();
            if(singleplayer==1&&win==1)
                computerMove();
          }
          }
          else
              checksymbol();
        }
        else
            checkplayer();
         whowin();
    }//GEN-LAST:event_eightMouseClicked

    private void nineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseClicked
        // TODO add your handling code here:
        if(player==1)
        {
          if(symbol==0)
          {
          if(i==1)
          {
            if(value=="X")  
                nine.setForeground(Color.red);
            else
                nine.setForeground(Color.blue);
            nine.setText(value);
            i=0;
            win=1;
            change();
            whowin();
            if(singleplayer==1&&win==1)
                computerMove();
          }
          }
          else
              checksymbol();
        }
        else
            checkplayer();
         whowin();
    }//GEN-LAST:event_nineMouseClicked

    private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Are you sure want to Exit"," Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel develperisAvinash;
    private javax.swing.JRadioButton doublep;
    private javax.swing.JLabel draw;
    private javax.swing.JLabel eight;
    private javax.swing.JButton exit;
    private javax.swing.JLabel five;
    private javax.swing.JLabel four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel nine;
    private javax.swing.JRadioButton o;
    private javax.swing.JLabel one;
    private javax.swing.JLabel playernameone;
    private javax.swing.JLabel playernametwo;
    private javax.swing.JLabel point1;
    private javax.swing.JLabel point2;
    private javax.swing.JButton reset;
    private javax.swing.JButton restart;
    private javax.swing.JLabel seven;
    private javax.swing.JLabel showsymbolo;
    private javax.swing.JLabel showsymbolx;
    private javax.swing.JRadioButton single;
    private javax.swing.JLabel six;
    private javax.swing.JLabel three;
    private javax.swing.JLabel turn;
    private javax.swing.JLabel two;
    private javax.swing.JRadioButton x;
    // End of variables declaration//GEN-END:variables
}
