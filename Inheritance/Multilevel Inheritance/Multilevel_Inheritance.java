class StaffMember {
    private String fullName;
    private int employeeCode;
    private double monthlyPay;

    StaffMember(String fullName, int employeeCode, double monthlyPay) {
        this.fullName = fullName;
        this.employeeCode = employeeCode;
        this.monthlyPay = monthlyPay;
    }

    void showInfo() {
        System.out.println("Name          : " + fullName);
        System.out.println("Employee ID   : " + employeeCode);
        System.out.println("Base Salary   : " + monthlyPay);
    }
}

class TeamSupervisor extends StaffMember {
    private int groupMembers;
    private double performanceBonus;

    TeamSupervisor(String fullName, int employeeCode, double monthlyPay,
                   int groupMembers, double performanceBonus) {
        super(fullName, employeeCode, monthlyPay);
        this.groupMembers = groupMembers;
        this.performanceBonus = performanceBonus;
    }

    void showSupervisorDetails() {
        showInfo();
        System.out.println("Team Size     : " + groupMembers);
        System.out.println("Bonus Amount  : " + performanceBonus);
    }
}

class ProjectCoordinator extends TeamSupervisor {
    private String projectName;
    private double allocatedFunds;

    ProjectCoordinator(String fullName, int employeeCode, double monthlyPay,
                       int groupMembers, double performanceBonus,
                       String projectName, double allocatedFunds) {
        super(fullName, employeeCode, monthlyPay, groupMembers, performanceBonus);
        this.projectName = projectName;
        this.allocatedFunds = allocatedFunds;
    }

    void showFullProfile() {
        showSupervisorDetails();
        System.out.println("Project Name  : " + projectName);
        System.out.println("Project Budget: " + allocatedFunds);
        System.out.println("==================================");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {

        ProjectCoordinator lead = new ProjectCoordinator(
                "Priya Sharma", 
                105, 
                125000.0,
                12, 
                25000.0,
                "E-Commerce Platform", 
                1200000.0
        );

        System.out.println("Project Manager Profile:");
        lead.showFullProfile();
    }
}