package Choo;
import java.util.Scanner;

class STU{
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private int rank;
  
  public String getName() { return name; }
  public int getKor() { return kor; }
  public int getEng() { return eng; }
  public int getMath() { return math; }
  public int getSum() { return sum; }
  public int getRank() { return rank; }
  public void setName(String name) { this.name = name; }
  public void setKor(int kor) { this.kor = kor; }
  public void setEng(int eng) { this.eng = eng; }
  public void setMath(int math) { this.math = math; }
  public void setSum(int sum) { this.sum = sum; }
  public void setRank(int rank) { this.rank = rank; }
  
  public  STU(String name, int kor, int eng, int math){      
     this.name = name;
     this.kor = kor;
     this.eng = eng;
     this.math = math;
     sum = kor+eng+math;
  }
  
  public void printf() {
        System.out.println("이름: "+name+" "+"국어: "+kor+" "+"영어: "+eng+" "+"수학: "+math+" "+"총점: "+sum+" "+"순위: "+rank);
     } 
}
public class week4 {
   public static void main(String[] args) {
        
         Scanner arr = new Scanner(System.in);
         STU[] stu = new STU[5];
         
         
         for(int i = 0; i < stu.length; i++) {
            System.out.printf("%d번째 학생 이름과 국어, 영어, 수학 성적을 입력하시오 (이름과 성적은 빈칸으로 구분): ", (i+1));       
          
            String name = arr.next();
            int kor = arr.nextInt();
            int eng = arr.nextInt();
            int math = arr.nextInt();
            stu[i] = new STU(name, kor, eng, math); 
         }
         for (int i = 0; i < stu.length; i++) {
 			stu[i].setRank(i+1);
 		}
         for(int i =0; i <stu.length; i++) {
            stu[i].printf();
            System.out.println("------------------------------------------");
         }
         
         STU max = stu[0];
         STU maxKor = stu[0];
         STU maxEng = stu[0];
         STU maxMath = stu[0];
         for(int i = 0; i < stu.length; i++) {
            if (max.getSum()<stu[i].getSum()) max = stu[i]; 
            if (maxKor.getKor()<stu[i].getKor()) maxKor = stu[i];
            if (maxEng.getEng()<stu[i].getEng()) maxEng = stu[i];
            if (maxMath.getMath()<stu[i].getMath()) maxMath = stu[i];
         }
         
         System.out.print("국어 과목에서 최고점수를 얻은 학생  ");
         maxKor.printf();
         System.out.print("영어 과목에서 최고점수를 얻은 학생  ");
         maxEng.printf();
         System.out.print("수학 과목에서 최고점수를 얻은 학생  ");
         maxMath.printf();
         System.out.print("과목점수합계에서 최고점수를 얻은 학생  ");
         max.printf();
         
     }
}