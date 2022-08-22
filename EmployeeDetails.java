class EmployeeDetails {
    private int performancePoint;
    private double appraisal;

    public void setPoint(int performancePoint) {
        this.performancePoint = performancePoint;
    }

    public void setAppraisal(double appraisal) {
        this.appraisal = appraisal;
    }

    public int getPoint() {
        return performancePoint;
    }

    public double getAppraisal() {
        return appraisal;
    }

    public static void main(String args[]) {
        EmployeeDetails en = new EmployeeDetails();
        en.setPoint(4);
        en.setAppraisal(1000.0);
        System.out.println(en.getPoint());
        System.out.println(en.getAppraisal());
    }
}