public class SalaryWorker extends Worker{

    double annualSalary;


    public SalaryWorker(String fName, String lName, String title, int YOB, double annualSalary ) {
        super(fName, lName, title, YOB, annualSalary);
        this.annualSalary = annualSalary;
    }


     public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay() {
        this.payTotal = (annualSalary/52);
        return payTotal;
    }
    public String displayWeeklyPay(){
        String output = new String ("This is your weekly pay (it is 1/52 of your annual salary): " + payTotal);
        return output;
    }
}

