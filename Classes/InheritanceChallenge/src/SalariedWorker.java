public class SalariedWorker extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalariedWorker(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double paycheck = annualSalary /26;
        double adjustPaycheck = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int) adjustPaycheck;
    }

    public void retire(){
        terminate( "12/12/2025");
        isRetired=true;
    }
}
