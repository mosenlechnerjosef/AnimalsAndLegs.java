public class CodingHours {
    public static void main(String[] args) {
        
        int averageDailyCodingHours = 6; 
        int workdaysPerWeek = 5; 
        int numberOfWeeksInSemester = 17; 
        int averageWorkHoursWeekly = 52;

       
        int totalCodingHours = averageDailyCodingHours * workdaysPerWeek * numberOfWeeksInSemester;

       
        double percentageOfCodingHours = ((double) totalCodingHours / (averageWorkHoursWeekly * numberOfWeeksInSemester)) * 100;

       
        System.out.println("Total coding hours in the semester: " + totalCodingHours + " hours");
        System.out.println("Percentage of coding hours relative to average work hours: " + percentageOfCodingHours + "%");
    }
}
