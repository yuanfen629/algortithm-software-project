package utils;

import java.awt.Color;
import java.awt.Graphics;  
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;  
  
import javax.swing.JFrame;  
  
public class Chart extends JFrame{  
	

  
    //��������ͳ��ͼ  
	ArrayList<Integer> ran=new  ArrayList<Integer>();
    public Chart(ArrayList<Integer> scores)
    {  
        super();  
        getContentPane().setForeground(Color.CYAN);
        setForeground(Color.CYAN);
        setBackground(Color.CYAN);
        for(int i=0;i<scores.size();i++)
        {
        	ran.add(scores.get(i));
        	System.out.println(scores.get(i));
        }
          
        setTitle("��������ͼ");  
        setBounds(100, 100,800,860);  
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }  
    @Override  
    public void paint(Graphics g)
    {  
        int Width = getWidth();  
        int Height = getHeight();  
        int leftMargin = 20;//����ͼ��߽�  
        int topMargin = 80;//����ͼ�ϱ߽�  
        Graphics2D g2 = (Graphics2D) g;  
        int ruler = Height-topMargin;  
        int rulerStep = ruler/40;//����ǰ�ĸ߶�����Ϊ20����λ  
        g2.setColor(Color.WHITE);//���ư�ɫ����  
        g2.fillRect(0, 0, Width, Height);//���ƾ���ͼ  
        g2.setColor(Color.LIGHT_GRAY);  
        for(int i=0;i<=20;i++){//���ƻ�ɫ���ߺͰٷֱ�  
            g2.drawString(100-(5*i)+"", 15, topMargin+rulerStep*i*2);//д�°ٷֱ�  
            g2.drawLine(15, topMargin+rulerStep*i*2+7, Width, topMargin+rulerStep*i*2+7);//���ƻ�ɫ����  
        }  
        g2.setColor(Color.PINK);  
        for(int i=0;i<ran.size();i++){//��������ͼ  
        	

            int step = (i+1)*40;//����ÿ������ͼ��ˮƽ���Ϊ40  
            //���ƾ���  
            g2.fillRoundRect(leftMargin+step*2, Height-ran.get(i)*9+100, 40, ran.get(i)*9, 40, 10);  
            //�г���Ʒ�ı��  
            g2.drawString("��"+(i+1)+"��"+ran.get(i)+"��", leftMargin+step*2, Height-ran.get(i)*10);  
        }  
    }
    
}  
