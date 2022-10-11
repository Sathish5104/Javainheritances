package org.inheritances;

public class College extends student {
  
	private void collegeName() {
System.out.println("collegeName :ARUNAI ENGINNERING COLLEGE ");
	}
private void CollegeCode() {
System.out.println("Collegecode:5104");
}
private void CollegeRank() {
System.out.println("CollegeRank :top 10 in affilated by ANNA UNIVERSITY ");
} 
 public static void main(String [] args) {
	  College q=new College();
	  
	  q.collegeName();
	  q.CollegeCode();
	  q.CollegeRank();
      q.StudentName();
      q.STUDENTID();
      q.Studentdept();
      q.HOSTEL();
      q.ROOMNO();
      q.placementScore();
      q.placemenntCTC();
 } 
}

