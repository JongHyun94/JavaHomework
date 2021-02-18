//이클립스 콘솔에서 사용할 수 있는 게시판을 만드시오.
//기능 : 목록, 생성, 읽기, 수정, 삭제, 종료
// > 입력 받는 모양 , : 출력 모양
package TeamProject1;

//Scanner 객체 사용하기 위한 import
import java.util.Scanner;

public class BoardTeam {

   public static void main(String[] args) {
      // 작동 flag를 run으로 선언. 
      boolean run = true;
      // string 객체 선언
      String[][] myBoard;
      //게시판 목록수 : 100개 게시판 항목수 : 5개
      // {index, title, contents, writer, hit}
      myBoard = new String[100][5];
      Scanner scanner = new Scanner(System.in);
      //게시물 인덱스 순서 1부터 시작
      int count = 1;
      int list = 0;
      
      /**
       *  true환경에선 계속 작동하면서 메뉴 화면 출력, false 환경에선 작동 종료
       */  
      while(run) {
   
    	 //출력 메뉴 화면
         System.out.println("----------------------------------------------");
         System.out.println("1.목록 | 2.생성 | 3.읽기 | 4.수정 | 5.삭제 | 6. 종료");
         System.out.println("----------------------------------------------");
         System.out.print("메뉴 선택> ");
         
         //메뉴 선택 번호
         int selectNo = Integer.parseInt(scanner.nextLine());
         /*
          * 1. 목록 출력 기능.
          */
         if(selectNo == 1) {
            System.out.println("----------------------------------------------");
            System.out.println(" 번호 |   제목   |      내용      |  글쓴이  | 조회수");
            System.out.println("----------------------------------------------");
            
            // index sorting
            if((myBoard == null && myBoard.length > 0) || count == 1) {
                   System.out.println("                 빈 내용                   ");
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
          * 2. 생성 기능 
          */
         else if(selectNo == 2) {
        	
       	   /**
       	   * 100칸 다 찼을 경우
       	   */
        	if(list == myBoard.length) {
        		System.out.println("게시글이 꽉 찼습니다.");
        		continue;
        	}
            // 임시 저장소 선언
            String tempTitle, tempContent, tempWriter;
            // 임시저장소에 저장
            System.out.print("제목> ");
            tempTitle = scanner.nextLine();
            System.out.print("내용> ");
            tempContent= scanner.nextLine();
            System.out.print("글쓴이> ");
            tempWriter= scanner.nextLine();
            
            for(int i=0;i<myBoard.length;i++) {
               if(myBoard[i][0] != null) {
                  continue;
               }
               else {
                  // index 증가 (게시물 번호)
                  myBoard[i][0] = ""+count;
                  myBoard[i][1] = tempTitle;
                  myBoard[i][2] = tempContent;
                  myBoard[i][3] = tempWriter;
                  myBoard[i][4] = "0";  // 처음 조회수 0  
                  count++;
                  break;
               }
            }
            /*
            int i = 0;
            // index 0부터 전체 순환 
            while(i<myBoard.length) { 
               
               if(myBoard[i][0] != null) {
                  i++;
                  if(i==myBoard.length) { 
                     i=0;
                  }
                  continue;
               }
               else {
                  count++; // index 증가 (게시물 번호)
                  myBoard[i][0] = ""+count;
                  myBoard[i][1] = tempTitle;
                  myBoard[i][2] = tempContent;
                  myBoard[i][3] = tempWriter;
                  myBoard[i][4] = "0";  // 처음 조회수 0  
                  break;
               }
                                    
            }
            
            */
            /**
             * 생성부분 추가할부분
             */

         }
         /**
          * 3. 읽기 기능 
          */
         else if(selectNo == 3) {
            System.out.print("번호> ");
            //번호 index 
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
               int tempHit; // 임시 조회수저장소
               tempHit = Integer.parseInt(myBoard[selectIndex][4])+1; // 조회수 1 증가
               myBoard[selectIndex][4] = "" + tempHit;              // 스트링 변환
               System.out.println("제목: "+ myBoard[selectIndex][1]);
               System.out.println("내용: "+ myBoard[selectIndex][2]);
               System.out.println("글쓴이: "+ myBoard[selectIndex][3]);
               System.out.println("조회수: " + myBoard[selectIndex][4]);
            }
            else {
               System.out.println("찾는 번호의 게시물이 없습니다.");
            }

            
         }
         /**
          * 4. 수정 기능
          */
         else if(selectNo == 4) {
            System.out.print("번호> ");
            //번호 index 
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
               System.out.println("기존 제목: "+ myBoard[selectIndex][1]); // 기존 제목
               System.out.print("수정 제목> ");
               tempTitle = scanner.nextLine(); // 수정된 제목 입력받음
               
               System.out.println("기존 내용: "+ myBoard[selectIndex][2]); // 기존 내용
               System.out.print("수정 내용> ");
               tempContent = scanner.nextLine(); // 수정된 제목 입력받음
               // 아무것도 입력 안할때 
               if(tempTitle.equals("")) {
                  //break;  // 무시
               }
               else {
                  myBoard[selectIndex][1] = tempTitle;  // 수정
               }

               if(tempContent.equals("")) {
                  //break;  // 무시
               }
               else {
                  myBoard[selectIndex][2] = tempContent;  // 수정
               }
            }
            else {
               System.out.println("찾는 번호의 게시물이 없습니다.");
            }
            /**
             * 생성부분 추가할부분
             */
            
         }
         /**
          * 5. 삭제 기능
          */
         else if(selectNo == 5) {
            System.out.print("번호> ");
            //번호 index 
            String temp = scanner.nextLine();
            //int selectIndex = Integer.parseInt(temp) - 1; // 인덱스값은 -1 차이
            //System.out.println(selectIndex);
            
            int selectIndex = 0;
            while(selectIndex<myBoard.length){
            	if(myBoard[selectIndex][0].equals(temp)) {
            		break;
            	}
            	selectIndex++;
            }
            
            if(myBoard[selectIndex][0] != null) {
               // 모든 항목 null로 다 채우기.
               for(int i=0;i<5;i++) { //5항목
                  myBoard[selectIndex][i] = null;
               }
            }
            else {
               System.out.println("찾는 번호의 게시물이 없습니다.");
            }
            /**
             * 생성부분 추가할부분
             */
         }
         /**
          * 6. 종료 기능 run = true 에서 -> false로 바꾸기 
          */
         else if(selectNo == 6) {
            run = false;
         }
         /**
          * 추가 기능: 1-6이외의 값 입력됐을경우
          */
         else {
        	 System.out.println("잘못된 입력방식입니다.");
         }
      }
      
      System.out.println("프로그램 종료");

   }

}