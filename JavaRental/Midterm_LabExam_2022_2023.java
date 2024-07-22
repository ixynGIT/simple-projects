/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author christian
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author christian
 */
public class Midterm_LabExam_2022_2023{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        try{
            System.out.print("Enter Contract Number: ");  
                int contractNum = input.nextInt();
                if (contractNum<10000 || contractNum>99999){
                System.out.println("Error: Contract Number must be between 10000 and 99999, inclusively");
                System.exit(0);
                }

                    System.out.print("Enter First Name: ");
            String firstName = input.next();
            firstName += input.nextLine();


            System.out.print("Enter Last Name: ");
            String lastName = input.next();
            lastName += input.nextLine();


            System.out.print("Enter Vehicle Identification Number: ");
            //Identification No. of vehicles have alphabets so I used String data type.
            String vehicleNum = input.next();
            vehicleNum += input.nextLine();

            
             System.out.print("Enter Starting Year of Rental Agreement: ");
           int year = input.nextInt();
                if(year<1886){
                System.out.println("Error: Invalid Year");
                System.exit(0);
                }

                
            System.out.print("Enter Rental Month in Numeric (1-12): ");
           int month = input.nextInt();
           int maxDaysInput = 0;
           String monthname = "";
           
                if(month<1 || month>12){
                System.out.println("Error: Invalid Month");
                System.exit(0);
                }
                
                if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                    maxDaysInput = 31;
                }else if(month==4 || month==6 || month==9 || month==11){
                   maxDaysInput = 30;
                }else if(month==2 && year%4==0){
                    maxDaysInput = 29;
                }else if(month==2 && year%4==1){
                   maxDaysInput = 28;
                }
                
                switch (month){
                    case 1 -> monthname = "January";
                    case 2 -> monthname = "February";
                    case 3 -> monthname = "March";
                    case 4 -> monthname = "April";
                    case 5 -> monthname = "May";
                    case 6 -> monthname = "June";
                    case 7 -> monthname = "July";
                    case 8 -> monthname = "August";
                    case 9 -> monthname = "September";
                    case 10 -> monthname = "October";
                    case 11 -> monthname = "November";
                    case 12 -> monthname = "December";
                 }
                
                
           System.out.print("Enter Day " + "(1-" + maxDaysInput +"): ");        
           int day = input.nextInt();
                if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                    if(day<1 || day>31){
                    System.out.println("Error: Invalid day. "+ monthname +" must be between 1 and 31");
                    System.exit(0);
                    }
                }else if(month==4 || month==6 || month==9 || month==11){
                    if(day<1 || day>30){
                    System.out.println("Error: Invalid day. "+ monthname +" must be between 1 and 30");
                    System.exit(0);
                    }
                }else if(month==2 && year%4==0){
                    if(day<1 || day>29){
                    System.out.println("Error: Invalid day. "+ monthname +" must be between 1 and 29");
                    System.exit(0);
                    }
                }else if(month==2 && year%4==1){
                    if(day<1 || day>28){
                    System.out.println("Error: Invalid day. "+ monthname +" must be between 1 and 28");
                    System.exit(0);
                    }
                }else{
                        System.out.println("Invalid please enter valid number");
                    }       

            System.out.print("Enter Agreed Rental length in Days: ");   
            int rentalDays = input.nextInt();
                if(rentalDays<1 || rentalDays>30){
                    System.out.println("Error: Rental length in days must be between 1 and 30, inclusively");
                    System.exit(0);
                }


            System.out.println("Have insurance?  Y/N");
            String insurance = input.next();
            insurance += input.nextLine();

    //----------------------------------------OUTPUT-------------------------------------------------------------------------

            System.out.println("\n\nContract Number: " + contractNum);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Vehicle Identification Number: " + vehicleNum);
            System.out.println("Agreed Rental length: "+ rentalDays); 


                   
                    String endMonthName = "";
                    int sumDays =  day+rentalDays;
                    int endYear = year;
                    int endMonth = month;
                    int endDay = 0;

                if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10){             
                    if(sumDays>31){
                        endDay = sumDays - 31;
                        ++endMonth;
                    }
                }else if(month==4 || month==6 || month==9 || month==11){
                    if(sumDays>30){
                        endDay = sumDays - 30;
                        ++endMonth;
                    }
                }else if(month==2 && year%4==0){
                    if(sumDays>29){
                        endDay = sumDays - 29;
                        ++endMonth;
                    }
                }else if(month==2 && year%4==1){
                    if(sumDays>28){               
                        endDay = sumDays - 28;
                        ++endMonth;
                    }
                }else if(month==12){
                    if(sumDays>31){                    
                        endDay = sumDays - 31;
                        ++endMonth;
                        ++endYear;                    
                    }
                }else{
                    System.out.println("Invalid");
                    System.exit(0);
                }

                    switch (endMonth){
                    case 1 -> endMonthName = "January";
                    case 2 -> endMonthName = "February";
                    case 3 -> endMonthName = "March";
                    case 4 -> endMonthName = "April";
                    case 5 -> endMonthName = "May";
                    case 6 -> endMonthName = "June";
                    case 7 -> endMonthName = "July";
                    case 8 -> endMonthName = "August";
                    case 9 -> endMonthName = "September";
                    case 10 -> endMonthName = "October";
                    case 11 -> endMonthName = "November";
                    case 12 -> endMonthName = "December";
                    case 13 -> endMonthName = "January";
                    }
             System.out.println("Starting Date of Rental: " + monthname + " " + day + ", " + year);
             System.out.println("Ending Date of Rental: " + endMonthName + " " + endDay + ", " + endYear);              


             switch (insurance) {
                case "Y", "y" -> { 
                    if(rentalDays<=10){
                        double rentFee1 = (rentalDays*25) + (rentalDays*2.50);
                        System.out.println("INSURANCE: YES\nTotal Rent Fee is: P" + rentFee1);
                    }else if(rentalDays>10){
                        double rentFee2 = (rentalDays*18) + (rentalDays*2.50);
                        System.out.println("INSURANCE: YES\nTotal Rent Fee is: P" + rentFee2);
                    }
                }
                case "N", "n" -> {
                    if(rentalDays<=10){
                        double rentFee1 = (rentalDays*25);
                        System.out.println("INSURANCE: NO\nTotal Rent Fee is: P" + rentFee1);
                    }else if(rentalDays>10){
                        double rentFee2 = (rentalDays*18);
                        System.out.println("INSURANCE: NO\nTotal Rent Fee is: P" + rentFee2);
                    }
                }


                default -> {
                    System.out.println("INSURANCE Error: Invalid Choice (System Automatically chooses Y)");
                    if(rentalDays<=10){
                        double rentFee1 = (rentalDays*25) + (rentalDays*2.50);
                        System.out.println("\nTotal Rent Fee is: P" + rentFee1);
                    }else if(rentalDays>10){
                        double rentFee2 = (rentalDays*18) + (rentalDays*2.50);
                        System.out.println("\nTotal Rent Fee is: P" + rentFee2);
                    }
                }
                }

        }catch (InputMismatchException e){
            System.out.println("Please input a valid number!");
            System.exit(0);
         }   

    }
}

