package com.xworkz.hostel;
import com.xworkz.hostel.office.Office;
import com.xworkz.hostel.office.StudentDetails;
import com.xworkz.hostel.office.mess.Manager;
import com.xworkz.hostel.office.mess.MessDetails;

public class Hostel {
	
    String name; 

	public static void main(String[] args) {

	Office office=new Office();
	
	System.out.println("Two String : "+office);
	office.setCloseTime(8.35f);
	office.setOpenTime(10.30f);
	office.setLunchBrake(60);
	office.setPrinter("HP printer");
	office.setSystemUsedInCompany("Windows PC with 4GB of RAM");
	
	System.out.println("Office Opens at : "+office.getOpenTime());
	System.out.println("Office Close at : "+office.getCloseTime());
	System.out.println("Office Lunch Brake"+office.getLunchBrake());
	System.out.println("System used for accounting in Office"+office.getSystemUsedInCompany());
	System.out.println("Printer Company"+office.getPrinter());
	
	
	StudentDetails studentDetails=new StudentDetails();
	
	studentDetails.setHostelFloreNo(3);
	studentDetails.setName("Gomtesh");
	studentDetails.setNativePlace("Belagavi");
	studentDetails.setRoomNo(121);
	studentDetails.setYear(4);
	String name=studentDetails.getName();
	System.out.println("Student Name : "+name);
	System.out.println("Native Place : "+studentDetails.getNativePlace());
	System.out.println("Year he is Studing : "+studentDetails.getYear()+"th Year");
	System.out.println("Flore No. : "+studentDetails.getHostelFloreNo()+"rd flore");
	System.out.println("Room No. : "+studentDetails.getRoomNo());
	System.out.println("Total Hostel Fees For 1 Year : "+
	studentDetails.getHostelFees());
	
	PlayGround playGround=new PlayGround();
	
	System.out.println(playGround.sport);
	System.out.println(playGround.noOfPlayers);
	
	MessDetails messDetails=new MessDetails();
	
	messDetails.day="Sunday";
	messDetails.menu="breakfast-Dosa, lunch-Bisibele Bhat,dnr-Fried Rice";
	messDetails.setMessClose(8.35f);
	messDetails.setMessOpen(7);
	System.out.println("Day : "+messDetails.day);
	System.out.println("Tadays Menu : "+messDetails.menu);
	System.out.println("Mess opens At : "+messDetails.getMessOpen()+"AM");
	System.out.println("Mess Close At : "+messDetails.getMessClose()+"PM");
	
	Manager manager=new Manager();
	
	manager.setCurrentBill(12430.40f);
	manager.setMessExpences(40890);
	manager.setName("Rahul Sadalagi");
	manager.setQuartersRent(7400);
	System.out.println("Manager Name : "+manager.getName());
	System.out.println("Manager Quarters Rent : "+manager.getQuartersRent());
	System.out.println("Hostel Current Bill For 1 Months : "+manager.getCurrentBill());
	System.out.println("Total Expancese For Mess in one Month : "+manager.getMessExpences());
	
	StudentDetails studentDetails2=new StudentDetails("adarsh", 4);
	
	System.out.println(studentDetails2.name1);
	System.out.println(studentDetails2.year1);
	
	
	
	}

}
