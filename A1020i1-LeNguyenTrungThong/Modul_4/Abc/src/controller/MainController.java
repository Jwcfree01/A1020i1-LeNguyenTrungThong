package controller;

import common.Exception.MyException;
import common.Validate.CheckRegex;
import model.bean.CandidateExperience;
import model.bean.CandidateFresher;
import model.bean.CandidateIntern;
import model.service.CandidateService;
import model.service.CandidateServiceImpl;

import java.sql.SQLException;
import java.util.*;

public class MainController {
    static int count = 0;
    Scanner scanner = new Scanner(System.in);
    CandidateService candidateService = new CandidateServiceImpl();

    public void displayMainMenu() throws MyException, SQLException {
        System.out.println("Please choose you want:\n" +
                "1. Add New Candidate\n" +
                "2. Show Information Candidate\n" +
                "3. Update Candidate\n" +
                "4. Exit");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                typeCandidate();
                break;
            case "2":
                showInfomationCandidate();
                displayMainMenu();
                break;
            case "3":
                updateCandidate();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.err.println("False, please choose again, enter to continue...");
                scanner.nextLine();
                displayMainMenu();
                break;
        }
        System.out.println("-----------------------");
        System.out.println("Please choose want to action: ");
    }

    //menu add candidate
    public void typeCandidate() throws MyException, SQLException {
        System.out.println("Please choose you want:\n" +
                "1. Add New Candidate Fresher\n" +
                "2. Add New Candidate Intern\n" +
                "3. Add New Candidate Experience\n" +
                "4. Exit");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                addNewCandidateFresher();
                break;
            case "2":
                addNewCandidateIntern();
                break;
            case "3":
                addNewCandidateExperience();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.err.println("False, please choose again, enter to continue...");
                scanner.nextLine();
                displayMainMenu();
                break;
        }
        System.out.println("-----------------------");
        System.out.println("Please choose want to action: ");
    }

    //menu show information candidate
    public void showInfomationCandidate() throws MyException, SQLException {
        System.out.println("Please choose you want:\n" +
                "1. Show Information Candidate Fresher\n" +
                "2. Show Information Candidate Intern\n" +
                "3. Show Information Candidate Experience\n" +
                "4. Exit");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                showInformationCandidateFresher();
                break;
            case "2":
                showInformationCandidateIntern();
                break;
            case "3":
                showInformationCandidateExperience();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.err.println("False, please choose again, enter to continue...");
                scanner.nextLine();
                displayMainMenu();
                break;
        }
        System.out.println("-----------------------");
        System.out.println("Please choose want to action: ");
    }

    //show menu update candidate
    public void updateCandidate() throws MyException, SQLException {
        System.out.println("Please choose you want:\n" +
                "1. Update Candidate Fresher\n" +
                "2. Update Candidate Intern\n" +
                "3. Update Candidate Experience\n" +
                "4. Exit");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                updateCandidateFresher();
                break;
            case "2":
//                addNewCandidateIntern();
                break;
            case "3":
//                addNewCandidateExperience();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.err.println("False, please choose again, enter to continue...");
                scanner.nextLine();
                displayMainMenu();
                break;
        }
        System.out.println("-----------------------");
        System.out.println("Please choose want to action: ");
    }


    //add new candidate fresher
    public void addNewCandidateFresher() throws MyException, SQLException {
        try {
            Scanner scanner = new Scanner(System.in);
            CandidateFresher caE = new CandidateFresher();

            System.out.println("input name");
            caE.setFullName(scanner.nextLine());
            System.out.println("input birthday");
            boolean flag = true;
            String birthday = scanner.nextLine();
            while (flag) {
                if (CheckRegex.checkBirthday(birthday)) {
                    caE.setBirthDay(birthday);
                    flag = false;
                } else {
                    System.out.println("error birthday, please input birthday again");
                    birthday = scanner.nextLine();
                }
            }
            System.out.println("input phone");
            caE.setPhone(scanner.nextLine());
            System.out.println("input email");
            scanner.nextLine();
            boolean flagEmail = false;
            do {
                String email = scanner.nextLine();
                if (CheckRegex.checkEmail(email)) {
                    flagEmail = true;
                    caE.setEmail(email);
                } else {
                    flagEmail = false;
                    System.out.println("error email, please input email again");
                }
            } while (!flagEmail);
            caE.setCandidateType(2);
            scanner.nextLine();
            System.out.println("input certificated");
            caE.setCertificated(scanner.nextLine());
            System.out.println("input graduationDate");
            caE.setGraduationDate(scanner.nextLine());
            System.out.println("input graduationRank");
            caE.setGraduationRank(scanner.nextLine());
            System.out.println("input education");
            caE.setEducation(scanner.nextLine());
            System.out.println(caE.showInfor());

            if (candidateService.addCandidateFresher(caE) == true) {
                count++;
                System.out.println("----------------");
                System.out.println("Da co " + count + " ung vien");
                System.out.println("----------------");
            }
        }catch (Exception e){
            System.out.println("The system has encountered an unexpected problem, sincerely sorry !!!");
        }
        displayMainMenu();
    }

    //add candidate intern
    private void addNewCandidateIntern() throws MyException, SQLException {
        Scanner scanner = new Scanner(System.in);
        CandidateIntern caE = new CandidateIntern();

        System.out.println("input name");
        caE.setFullName(scanner.nextLine());
        System.out.println("input birthday");
        caE.setBirthDay(scanner.nextLine());
        System.out.println("input phone");
        caE.setPhone(scanner.nextLine());
        System.out.println("input email");
        caE.setEmail(scanner.nextLine());
        caE.setCandidateType(1);
        scanner.nextLine();
        System.out.println("input certificated");
        caE.setCertificated(scanner.nextLine());
        System.out.println("input majors");
        caE.setMajors(scanner.nextLine());
        System.out.println("input semester");
        caE.setSemester(scanner.nextLine());
        System.out.println("input universityName");
        caE.setUniversityName(scanner.nextLine());

        System.out.println(caE.showInfor());
        if (candidateService.addCandidateIntern(caE) == true) {
            count++;
            System.out.println("----------------");
            System.out.println("Da co " + count + " ung vien");
            System.out.println("----------------");
        }
        displayMainMenu();
    }

    //add candidate experience
    private void addNewCandidateExperience() throws MyException, SQLException {
        Scanner scanner = new Scanner(System.in);
        CandidateExperience caE = new CandidateExperience();

        System.out.println("input name");
        caE.setFullName(scanner.nextLine());
        System.out.println("input birthday");
        caE.setBirthDay(scanner.nextLine());
        System.out.println("input phone");
        caE.setPhone(scanner.nextLine());
        System.out.println("input email");
        caE.setEmail(scanner.nextLine());
        caE.setCandidateType(0);
        scanner.nextLine();
        System.out.println("input certificated");
        caE.setCertificated(scanner.nextLine());
        System.out.println("input exp in year");
        caE.setExpInYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println("input pro skill");
        caE.setProSkill(scanner.nextLine());
        System.out.println(caE.showInfor());
        if (candidateService.addCandidateExperience(caE) == true) {
            count++;
            System.out.println("----------------");
            System.out.println("Da co " + count + " ung vien");
            System.out.println("----------------");
        }
        displayMainMenu();
    }

    //show information candidate fresher
    private void showInformationCandidateFresher() throws SQLException {
        Set<CandidateFresher> fresherSet = new HashSet<>(this.candidateService.findCandidateFresher());
        for (CandidateFresher candidateFresher : fresherSet) {
            System.out.println(candidateFresher.showInfor());
        }
    }

    //show information candidate intern
    private void showInformationCandidateIntern(){
        Set<CandidateIntern> candidateInterns = new HashSet<>(this.candidateService.findCandidateIntern());
        for (CandidateIntern can1 : candidateInterns) {
            System.out.println(can1.showInfor());
        }
    }

    //show information candidate experience
    private void showInformationCandidateExperience(){
        Set<CandidateExperience> candidateExperiences = new HashSet<>(this.candidateService.findCandidateExperience());
        for (CandidateExperience can1 : candidateExperiences) {
            System.out.println(can1.showInfor());
        }
    }

    //update candidate fresher
    private void updateCandidateFresher() throws SQLException {
        this.candidateService.editCandidate(1);
    }



































    //update
//    private void updateCandidateFresher() throws MyException {
//        showInformationCandidateFresher();
//        System.out.println("Please choose id you want to update");
//        int choose = scanner.nextInt();
//        System.out.println(this.candidateService.findIdFresher(choose));
//
//        try {
//            Scanner scanner = new Scanner(System.in);
//            CandidateFresher caE = new CandidateFresher();
//
//            System.out.println("input id");
//            caE.setCandidateID(scanner.nextInt());
//            scanner.nextLine();
//            System.out.println("input name");
//            caE.setFullName(scanner.nextLine());
//            System.out.println("input birthday");
//
//            boolean flag = true;
//            String birthday = scanner.nextLine();
//            while (flag) {
//                if (CheckRegex.checkBirthday(birthday)) {
//                    caE.setBirthDay(birthday);
//                    flag = false;
//                } else {
//                    System.out.println("error birthday, please input birthday again");
//                    birthday = scanner.nextLine();
//                }
//            }
//
//            System.out.println("input phone");
//            caE.setPhone(scanner.nextLine());
//
//
//            System.out.println("input email");
//            scanner.nextLine();
//            boolean flagEmail = false;
//            do {
//                String email = scanner.nextLine();
//                scanner.nextLine();
//                if (CheckRegex.checkEmail(email)) {
//                    flagEmail = true;
//                    caE.setEmail(email);
//                } else {
//                    System.out.println("error email, please input email again");
//                }
//            } while (!flagEmail);
//
//
//            caE.setCandidateType(2);
//            scanner.nextLine();
//            System.out.println("input certificated");
//            caE.setCertificated(scanner.nextLine());
//            System.out.println("input graduationDate");
//            caE.setGraduationDate(scanner.nextLine());
//            System.out.println("input graduationRank");
//            caE.setGraduationRank(scanner.nextLine());
//            System.out.println("input education");
//            caE.setEducation(scanner.nextLine());
//
//            this.candidateService.updateCandidateFresher(caE);
//        } catch (Exception e){
//            System.out.println("The system has encountered an unexpected problem, sincerely sorry !!!");
//        }
//    }






















}
