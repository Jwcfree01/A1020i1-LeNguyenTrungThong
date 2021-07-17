package controller;

import common.Validate.CheckRegex;
import model.bean.CandidateExperience;
import model.bean.CandidateFresher;
import model.bean.CandidateIntern;
import model.service.CandidateService;
import model.service.CandidateServiceImpl;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static int count = 0;
    Scanner scanner = new Scanner(System.in);
    CandidateService candidateService = new CandidateServiceImpl();

    public void displayMainMenu() {
        System.out.println("Please choose you want:\n" +
                "1. Add New Candidate\n" +
                "2. Show Information Candidate\n" +
                "3. Exit");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                typeCandidate();
                break;
            case "2":
                showInfomationCandidate();
                break;
            case "3":
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

    public void typeCandidate() {
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

    public void showInfomationCandidate() {
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

    private void showInformationCandidateFresher() {
        String a = "";
        List<CandidateFresher> candidateFreshers = this.candidateService.findCandidateFresher();
        Collections.sort();
        for (CandidateFresher candidateFresher : this.candidateService.findCandidateFresher()) {
//            candidateFresher.showInfor();

            System.out.println(candidateFresher.getCandidateID());
            if (candidateFresher.getFullName() == a){
                continue;
            }
            a = candidateFresher.getFullName();

            System.out.println(candidateFresher.getFullName());
            System.out.println(candidateFresher.getBirthDay());
            System.out.println(candidateFresher.getPhone());
            System.out.println(candidateFresher.getEmail());
            System.out.println(candidateFresher.getCandidateType());
            System.out.println(candidateFresher.getCandidateCount());
            System.out.println(candidateFresher.getCertificated());
            System.out.println(candidateFresher.getGraduationDate());
            System.out.println(candidateFresher.getGraduationRank());
            System.out.println(candidateFresher.getEducation());
            System.out.println("----------------");

//            "candidateID=" + candidateFresher.getCandidateID() +
//                    ", fullName='" + candidateFresher.getFullName() + '\'' +
//                    ", birthDay='" + candidateFresher.getBirthDay() + '\'' +
//                    ", phone='" + candidateFresher.getPhone() + '\'' +
//                    ", email='" + candidateFresher.getEmail() + '\'' +
//                    ", candidateType='" + candidateFresher.getCandidateType() + '\'' +
//                    ", candidateCount='" + candidateFresher.getCandidateCount() + '\'' +
//                    ", certificated=" + candidateFresher.getCertificated() +
//                    "graduationDate='" + candidateFresher.getGraduationDate() + '\'' +
//                    ", graduationRank='" + candidateFresher.getGraduationRank() + '\'' +
//                    ", education='" + candidateFresher.getEducation()
//        }
        }
        displayMainMenu();
    }

    public void addNewCandidateFresher() {
        Scanner scanner = new Scanner(System.in);
        CandidateFresher caE = new CandidateFresher();

        System.out.println("input id");
        caE.setCandidateID(scanner.nextInt());
        scanner.nextLine();
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
        System.out.println("input count");
        caE.setCandidateCount(scanner.nextInt());
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
        displayMainMenu();
    }

    private void addNewCandidateIntern() {
        Scanner scanner = new Scanner(System.in);
        CandidateIntern caE = new CandidateIntern();

        System.out.println("input id");
        caE.setCandidateID(scanner.nextInt());
        scanner.nextLine();
        System.out.println("input name");
        caE.setFullName(scanner.nextLine());
        System.out.println("input birthday");
        caE.setBirthDay(scanner.nextLine());
        System.out.println("input phone");
        caE.setPhone(scanner.nextLine());
        System.out.println("input email");
        caE.setEmail(scanner.nextLine());
        caE.setCandidateType(1);
        System.out.println("input count");
        caE.setCandidateCount(scanner.nextInt());
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

    private void addNewCandidateExperience() {
        Scanner scanner = new Scanner(System.in);
        CandidateExperience caE = new CandidateExperience();

        System.out.println("input id");
        caE.setCandidateID(scanner.nextInt());
        scanner.nextLine();
        System.out.println("input name");
        caE.setFullName(scanner.nextLine());
        System.out.println("input birthday");
        caE.setBirthDay(scanner.nextLine());
        System.out.println("input phone");
        caE.setPhone(scanner.nextLine());
        System.out.println("input email");
        caE.setEmail(scanner.nextLine());
        caE.setCandidateType(0);
        System.out.println("input count");
        caE.setCandidateCount(scanner.nextInt());
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

}
