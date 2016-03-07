import java.util.Scanner;
import java.util.Calendar;
public class DisplayCalendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = 0, month = 0, year,k=1;
		String monthName;
		
		
		System.out.println("Enter the month: ");
		month = sc.nextInt();
		System.out.println("Enter the year: ");
		year = sc.nextInt();
		switch (month) {
		case 1:
			monthName = "January";
			days = 31;
			break;
		case 2:
			monthName = "February";
			if (year % 4 == 0) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 3:
			monthName = "March";
			days = 31;
			break;
		case 4:
			monthName = "April";
			days = 30;
			break;
		case 5:
			monthName = "May";
			days = 31;
			break;
		case 6:
			monthName = "June";
			days = 30;
			break;
		case 7:
			monthName = "July";
			days = 31;
			break;
		case 8:
			monthName = "August";
			days = 31;
			break;
		case 9:
			monthName = "September";
			days = 30;
			break;
		case 10:
			monthName = "October";
			days = 31;
			break;
		case 11:
			monthName = "November";
			days = 30;
			break;
		case 12:
			monthName = "December";
			days = 31;
			break;
		default:
			monthName = "Unknown";
			break;
		}
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);;
		int val = cal.get(Calendar.DAY_OF_WEEK);
	
            System.out.println("          "+monthName+" "+year);
            System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
            String[] week1=new String[7];
            String[] week2=new String[7];
            String[] week3=new String[7];
            //String[] week4=new String[7];
            //String[] week5=new String[7];
            //String[] week6=new String[7];
            
            for(int i=0;i<val;i++){
    			week1[i]="     ";
    		}
            for(int i=val;i<=7;i++){
            	week1[i-1]="  "+k+"  ";
            	k++;
            }
            System.out.println(week1[0]+week1[1]+week1[2]+week1[3]+week1[4]+week1[5]+week1[6]);
            for(int i=0;i<7;i++){
            	if(k<10){
            	week2[i]="  "+k+"  ";}
            	else{
                week2[i]=" "+k+"  ";	
            	}
            	k++;
            }
            System.out.println(week2[0]+week2[1]+week2[2]+week2[3]+week2[4]+week2[5]+week2[6]);
            
            while(k<=(days-7)){
            for(int i=0;i<7;i++){
            	
            	if(k<10){
                	week2[i]="  "+k+"  ";}
                	else{
                    week2[i]=" "+k+"  ";	
                	}
            	k++;
            	
            	}      
            
            System.out.println(week2[0]+week2[1]+week2[2]+week2[3]+week2[4]+week2[5]+week2[6]);
            }
            for(int i=0;i<7;i++){
            	if(k<=days){
            		week2[i]=" "+k+"  ";
            	}else{
            		week2[i]="     ";
            	}
            	k++;
            }
            System.out.println(week2[0]+week2[1]+week2[2]+week2[3]+week2[4]+week2[5]+week2[6]);
            sc.close();
	}

}
