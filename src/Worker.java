public class Worker extends Person{
    double hourlyPayRate; //pay
    double normalPay;
    double payTotal;
    double overTimePay;



    public Worker(String fName, String lName, String title, int YOB, double hourlyPayRate) {
        super(fName, lName, title, YOB);/// maybe don't need this??
        hourlyPayRate = 0;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }



    public double calculateWeeklyPay(double hoursWorked){

            if(hoursWorked > 40){ // ((hoursWorked - 40) * (1.5 * hourlyPayRate)) + (40 * hourlyPayRate)
                //pay = 15?

                this.overTimePay = ((hoursWorked - 40) * (1.5 * hourlyPayRate));
                this.normalPay = (40 * hourlyPayRate);
                this.payTotal = overTimePay + normalPay;
                return payTotal;
            }

            else/*(hoursWorked <= 40)*/{ //(hoursWorked * hourlyPayRate)
                this.payTotal = (hoursWorked * hourlyPayRate);
                return payTotal;
            }

        }
        public String displayWeeklyPay(double hoursWorked){
            if(hoursWorked > 40){
            System.out.println("Pay for first 40 hours worked, " + this.normalPay
                    + ". Overtime hours worked, " + (hoursWorked - 40)
                    + ", Pay for overtime hours worked, " + overTimePay
                            + ". Total hours worked, " + hoursWorked
                            + ", Total pay for the week, " + this.payTotal );
            }

            else{
                System.out.println("Total hours worked, " + hoursWorked + ". Total pay for the week, " + this.payTotal);
            }

            return ;

        }
}
