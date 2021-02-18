//��Ŭ���� �ֿܼ��� ����� �� �ִ� �Խ����� ����ÿ�.
//��� : ���, ����, �б�, ����, ����, ����
// > �Է� �޴� ��� , : ��� ���
package TeamProject1;

//Scanner ��ü ����ϱ� ���� import
import java.util.Scanner;

public class BoardTeam {

   public static void main(String[] args) {
      // �۵� flag�� run���� ����. 
      boolean run = true;
      // string ��ü ����
      String[][] myBoard;
      //�Խ��� ��ϼ� : 100�� �Խ��� �׸�� : 5��
      // {index, title, contents, writer, hit}
      myBoard = new String[100][5];
      Scanner scanner = new Scanner(System.in);
      //�Խù� �ε��� ���� 1���� ����
      int count = 1;
      int list = 0;
      
      /**
       *  trueȯ�濡�� ��� �۵��ϸ鼭 �޴� ȭ�� ���, false ȯ�濡�� �۵� ����
       */  
      while(run) {
   
    	 //��� �޴� ȭ��
         System.out.println("----------------------------------------------");
         System.out.println("1.��� | 2.���� | 3.�б� | 4.���� | 5.���� | 6. ����");
         System.out.println("----------------------------------------------");
         System.out.print("�޴� ����> ");
         
         //�޴� ���� ��ȣ
         int selectNo = Integer.parseInt(scanner.nextLine());
         /*
          * 1. ��� ��� ���.
          */
         if(selectNo == 1) {
            System.out.println("----------------------------------------------");
            System.out.println(" ��ȣ |   ����   |      ����      |  �۾���  | ��ȸ��");
            System.out.println("----------------------------------------------");
            
            // index sorting
            if((myBoard == null && myBoard.length > 0) || count == 1) {
                   System.out.println("                 �� ����                   ");
            }
            // 
            else {
            	/*
               for(int index=count-1; index>0; index--) {
                  for(int i=0;i<myBoard.length;i++) {
                     if(myBoard[i][0].equals(""+index)) {
                        System.out.println(myBoard[i][0] + " |   " + myBoard[i][1] 
                                  + "   |      " + myBoard[i][2]+ "       |  " + myBoard[i][3]
                                  + " | " + myBoard[i][4] );
                        break;
                     }
                  }
               }
               */
               
               for(int i=myBoard.length-1;i>=0;i--) {
                   if(myBoard[i][0]!=null) {
                      System.out.println(myBoard[i][0] + " | " + myBoard[i][1] 
                               + " | " + myBoard[i][2]+ " | " + myBoard[i][3]
                               + " | " + myBoard[i][4] );
                      }
                   else {
                      continue;
                   }
                }
                   
            }
         }
         /*
          * 2. ���� ��� 
          */
         else if(selectNo == 2) {
        	
       	   /**
       	   * 100ĭ �� á�� ���
       	   */
        	if(list == myBoard.length) {
        		System.out.println("�Խñ��� �� á���ϴ�.");
        		continue;
        	}
            // �ӽ� ����� ����
            String tempTitle, tempContent, tempWriter;
            // �ӽ�����ҿ� ����
            System.out.print("����> ");
            tempTitle = scanner.nextLine();
            System.out.print("����> ");
            tempContent= scanner.nextLine();
            System.out.print("�۾���> ");
            tempWriter= scanner.nextLine();
            
            for(int i=0;i<myBoard.length;i++) {
               if(myBoard[i][0] != null) {
                  continue;
               }
               else {
                  // index ���� (�Խù� ��ȣ)
                  myBoard[i][0] = ""+count;
                  myBoard[i][1] = tempTitle;
                  myBoard[i][2] = tempContent;
                  myBoard[i][3] = tempWriter;
                  myBoard[i][4] = "0";  // ó�� ��ȸ�� 0  
                  count++;
                  break;
               }
            }
            /*
            int i = 0;
            // index 0���� ��ü ��ȯ 
            while(i<myBoard.length) { 
               
               if(myBoard[i][0] != null) {
                  i++;
                  if(i==myBoard.length) { 
                     i=0;
                  }
                  continue;
               }
               else {
                  count++; // index ���� (�Խù� ��ȣ)
                  myBoard[i][0] = ""+count;
                  myBoard[i][1] = tempTitle;
                  myBoard[i][2] = tempContent;
                  myBoard[i][3] = tempWriter;
                  myBoard[i][4] = "0";  // ó�� ��ȸ�� 0  
                  break;
               }
                                    
            }
            
            */
            /**
             * �����κ� �߰��Һκ�
             */

         }
         /**
          * 3. �б� ��� 
          */
         else if(selectNo == 3) {
            System.out.print("��ȣ> ");
            //��ȣ index 
            String temp = scanner.nextLine();
            //int temp1 = Integer.parseInt(temp);
            int selectIndex = 0;
            while(selectIndex<myBoard.length){
            	if(myBoard[selectIndex][0].equals(temp)) {
            		break;
            	}
            	selectIndex++;
            }
            //int selectIndex = Integer.parseInt(temp) - 1; 
            
 
            
            if(myBoard[selectIndex][0] != null) {
               int tempHit; // �ӽ� ��ȸ�������
               tempHit = Integer.parseInt(myBoard[selectIndex][4])+1; // ��ȸ�� 1 ����
               myBoard[selectIndex][4] = "" + tempHit;              // ��Ʈ�� ��ȯ
               System.out.println("����: "+ myBoard[selectIndex][1]);
               System.out.println("����: "+ myBoard[selectIndex][2]);
               System.out.println("�۾���: "+ myBoard[selectIndex][3]);
               System.out.println("��ȸ��: " + myBoard[selectIndex][4]);
            }
            else {
               System.out.println("ã�� ��ȣ�� �Խù��� �����ϴ�.");
            }

            
         }
         /**
          * 4. ���� ���
          */
         else if(selectNo == 4) {
            System.out.print("��ȣ> ");
            //��ȣ index 
            String temp = scanner.nextLine();
            String tempTitle;
            String tempContent;
            //int selectIndex = Integer.parseInt(temp) - 1;
            
            int selectIndex = 0;
            while(selectIndex<myBoard.length){
            	if(myBoard[selectIndex][0].equals(temp)) {
            		break;
            	}
            	selectIndex++;
            }
            
            if(myBoard[selectIndex][0].equals(temp)) {
               System.out.println("���� ����: "+ myBoard[selectIndex][1]); // ���� ����
               System.out.print("���� ����> ");
               tempTitle = scanner.nextLine(); // ������ ���� �Է¹���
               
               System.out.println("���� ����: "+ myBoard[selectIndex][2]); // ���� ����
               System.out.print("���� ����> ");
               tempContent = scanner.nextLine(); // ������ ���� �Է¹���
               // �ƹ��͵� �Է� ���Ҷ� 
               if(tempTitle.equals("")) {
                  //break;  // ����
               }
               else {
                  myBoard[selectIndex][1] = tempTitle;  // ����
               }

               if(tempContent.equals("")) {
                  //break;  // ����
               }
               else {
                  myBoard[selectIndex][2] = tempContent;  // ����
               }
            }
            else {
               System.out.println("ã�� ��ȣ�� �Խù��� �����ϴ�.");
            }
            /**
             * �����κ� �߰��Һκ�
             */
            
         }
         /**
          * 5. ���� ���
          */
         else if(selectNo == 5) {
            System.out.print("��ȣ> ");
            //��ȣ index 
            String temp = scanner.nextLine();
            //int selectIndex = Integer.parseInt(temp) - 1; // �ε������� -1 ����
            //System.out.println(selectIndex);
            
            int selectIndex = 0;
            while(selectIndex<myBoard.length){
            	if(myBoard[selectIndex][0].equals(temp)) {
            		break;
            	}
            	selectIndex++;
            }
            
            if(myBoard[selectIndex][0] != null) {
               // ��� �׸� null�� �� ä���.
               for(int i=0;i<5;i++) { //5�׸�
                  myBoard[selectIndex][i] = null;
               }
            }
            else {
               System.out.println("ã�� ��ȣ�� �Խù��� �����ϴ�.");
            }
            /**
             * �����κ� �߰��Һκ�
             */
         }
         /**
          * 6. ���� ��� run = true ���� -> false�� �ٲٱ� 
          */
         else if(selectNo == 6) {
            run = false;
         }
         /**
          * �߰� ���: 1-6�̿��� �� �Էµ������
          */
         else {
        	 System.out.println("�߸��� �Է¹���Դϴ�.");
         }
      }
      
      System.out.println("���α׷� ����");

   }

}