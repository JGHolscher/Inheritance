public class Worker extends Person{
    double hourlyPayRate;//pay
    double normalPay;
    double payTotal;
    double overTimePay;



    public Worker(String fName, String lName, String title, int YOB, double hourlyPayRate) {
        super(fName, lName, title, YOB);/// maybe don't need this??
        this.hourlyPayRate = hourlyPayRate;
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

                overTimePay = ((hoursWorked - 40) * (1.5 * hourlyPayRate));
                normalPay = (40 * hourlyPayRate);
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
                String output = new String ("Pay for first 40 hours worked, " + normalPay
                        + ". Overtime hours worked, " + (hoursWorked - 40)
                        + ", Pay for overtime hours worked, " + overTimePay
                        + ". Total hours worked, " + hoursWorked
                        + ", Total pay for the week, " + payTotal);
                return output;
            }

            else{
                String output = new String ("Total hours worked, " + hoursWorked + ". Total pay for the week, " + this.payTotal);
                return output;
            }



        }
}
