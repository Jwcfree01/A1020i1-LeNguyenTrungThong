package model.repository;

import model.bean.Candidate;
import model.bean.CandidateExperience;
import model.bean.CandidateFresher;
import model.bean.CandidateIntern;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateRepositoryImpl implements CandidateRepository {

    private BaseRepository baseRepository = new BaseRepository();

    //add candidate fresher
    @Override
    public boolean addCandidateFresher(CandidateFresher candidateFresher ) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into candidate_all (name, birthday, phone, email, candidate_type, " +
                            "certificated, graduation_date, graduation_rank, education)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, candidateFresher.getFullName());
            preparedStatement.setString(2,candidateFresher.getBirthDay());
            preparedStatement.setString(3, candidateFresher.getPhone());
            preparedStatement.setString(4, candidateFresher.getEmail());
            preparedStatement.setInt(5, candidateFresher.getCandidateType());
            preparedStatement.setString(6, candidateFresher.getCertificated());
            preparedStatement.setString(7, candidateFresher.getGraduationDate());
            preparedStatement.setString(8, candidateFresher.getGraduationRank());
            preparedStatement.setString(9, candidateFresher.getEducation());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row>0;
    }

    //add candidate intern
    @Override
    public boolean addCandidateIntern(CandidateIntern candidateIntern) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into candidate_all (name, birthday, phone, email, candidate_type, " +
                            "certificated, majors, semester, university)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, candidateIntern.getFullName());
            preparedStatement.setString(2,candidateIntern.getBirthDay());
            preparedStatement.setString(3, candidateIntern.getPhone());
            preparedStatement.setString(4, candidateIntern.getEmail());
            preparedStatement.setInt(5, candidateIntern.getCandidateType());
            preparedStatement.setString(6, candidateIntern.getCertificated());
            preparedStatement.setString(7, candidateIntern.getMajors());
            preparedStatement.setString(8, candidateIntern.getSemester());
            preparedStatement.setString(9, candidateIntern.getUniversityName());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row>0;
    }

    //add candidate experience
    @Override
    public boolean addCandidateExperience(CandidateExperience candidateExperience) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into candidate_all (name, birthday, phone, email, candidate_type, " +
                            "certificated, expInYear, pro_skill)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, candidateExperience.getFullName());
            preparedStatement.setString(2,candidateExperience.getBirthDay());
            preparedStatement.setString(3, candidateExperience.getPhone());
            preparedStatement.setString(4, candidateExperience.getEmail());
            preparedStatement.setInt(5, candidateExperience.getCandidateType());
            preparedStatement.setString(6, candidateExperience.getCertificated());
            preparedStatement.setInt(7, candidateExperience.getExpInYear());
            preparedStatement.setString(8, candidateExperience.getProSkill());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row>0;
    }

    //show information candidate fresher
    @Override
    public List<CandidateFresher> findCandidateFresher() {
        List<CandidateFresher> candidateFreshersList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from candidate_all where candidate_type = 2");
            ResultSet resultSet = preparedStatement.executeQuery();
            CandidateFresher candidate = null;
            while (resultSet.next()){
                candidate = new CandidateFresher();
                candidate.setCandidateID(resultSet.getInt("id"));
                candidate.setFullName(resultSet.getString("name"));
                candidate.setBirthDay(resultSet.getString("birthday"));
                candidate.setPhone(resultSet.getString("phone"));
                candidate.setEmail(resultSet.getString("email"));
                candidate.setCandidateType(resultSet.getInt("candidate_type"));
                candidate.setCertificated(resultSet.getString("certificated"));
                candidate.setGraduationDate(resultSet.getString("graduation_date"));
                candidate.setGraduationRank(resultSet.getString("graduation_rank"));
                candidate.setEducation(resultSet.getString("education"));
                candidateFreshersList.add(candidate);
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return candidateFreshersList;
    }

    //show information candidate intern
    @Override
    public List<CandidateIntern> findCandidateIntern() {
        List<CandidateIntern> candidateInternsList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from candidate_all where candidate_type = 1");
            ResultSet resultSet = preparedStatement.executeQuery();
            CandidateIntern candidateIntern = null;
            while (resultSet.next()){
                candidateIntern = new CandidateIntern();
                candidateIntern.setCandidateID(resultSet.getInt("id"));
                candidateIntern.setFullName(resultSet.getString("name"));
                candidateIntern.setBirthDay(resultSet.getString("birthday"));
                candidateIntern.setPhone(resultSet.getString("phone"));
                candidateIntern.setEmail(resultSet.getString("email"));
                candidateIntern.setCandidateType(resultSet.getInt("candidate_type"));
                candidateIntern.setCertificated(resultSet.getString("certificated"));
                candidateIntern.setMajors(resultSet.getString("majors"));
                candidateIntern.setSemester(resultSet.getString("semester"));
                candidateIntern.setUniversityName(resultSet.getString("university"));
                candidateInternsList.add(candidateIntern);
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return candidateInternsList;
    }

    //show information candidate experience
    @Override
    public List<CandidateExperience> findCandidateExperience() {
        List<CandidateExperience> candidateExperienceList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from candidate_all where candidate_type = 0");
            ResultSet resultSet = preparedStatement.executeQuery();
            CandidateExperience candidateExperience = null;
            while (resultSet.next()){
                candidateExperience = new CandidateExperience();
                candidateExperience.setCandidateID(resultSet.getInt("id"));
                candidateExperience.setFullName(resultSet.getString("name"));
                candidateExperience.setBirthDay(resultSet.getString("birthday"));
                candidateExperience.setPhone(resultSet.getString("phone"));
                candidateExperience.setEmail(resultSet.getString("email"));
                candidateExperience.setCandidateType(resultSet.getInt("candidate_type"));
                candidateExperience.setCertificated(resultSet.getString("certificated"));
                candidateExperience.setExpInYear(resultSet.getInt("expInYear"));
                candidateExperience.setProSkill(resultSet.getString("pro_skill"));
                candidateExperienceList.add(candidateExperience);
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return candidateExperienceList;
    }

    //update candidate fresher
    @Override
    public void editCandidate(int id) throws SQLException {
        Statement st = this.baseRepository.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = st.executeQuery("select * from candidate_all where id = 1");
//        rs.absolute(id);
        rs.beforeFirst();
        while (rs.next()){
//            rs.updateString(2, "thong");
            rs.updateString("name", "thong");
            rs.updateRow();
        }
        findCandidateFresher();
//        rs.first();
//        while (rs.next()){
//            String name = rs.getString("name");
//            Timestamp hireDate = rs.getTimestamp(5);
//            System.out.println("Name: " + name + " Hire Date: " + hireDate);
//        }

    }


















    @Override
    public void deleteCandidate(int id) {

    }

    @Override
    public Candidate findIdFresher(int id) {
        CandidateFresher candidateFresher = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from candidate_fresher\n" +
                    "                    where id = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String birthday = resultSet.getString("birthday");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                int type = resultSet.getInt("candidate_type");
                String certificated = resultSet.getString("certificated");
                String graduationDate = resultSet.getString("graduationDate");
                String graduationRank = resultSet.getString("graduationRank");
                String education = resultSet.getString("education");
                candidateFresher = new CandidateFresher(id1, name, birthday, phone, email, type, certificated, graduationDate, graduationRank, education);
            }
        } catch (SQLException e){
            System.out.println(e);
        }
        return candidateFresher;
    }

    @Override
    public Candidate search(String search) {
        return null;
    }
//    @Override
//    public List<User> findAll() {
//        List<User> userList = new ArrayList<>();
//        try {
//            Statement statement = this.baseRepository.getConnection().createStatement();
//            ResultSet resultSet = statement.executeQuery("select id, `name`, email, country\n" +
//                    "from user order by `name`");
//            User user = null;
//            while (resultSet.next()){
//                user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setEmail(resultSet.getString("email"));
//                user.setCountry(resultSet.getString("country"));
//                userList.add(user);
//            }
//        }catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return userList;
//    }
//
//    @Override
//    public boolean addUser(User user) {
//        int row = 0;
//        try {
//            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
//                    ("insert into user (`name`, email, country)\n" +
//                            "values (?, ?, ?)");
//            preparedStatement.setString(1, user.getName());
//            preparedStatement.setString(2,user.getEmail());
//            preparedStatement.setString(3, user.getCountry());
//            row = preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return row>0;
//    }
//
//    @Override
//    public void editUser(User user) {
//        int row = 0;
//        try {
//            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
//                    ("update user\n" +
//                            "set name = ?, email = ?, country = ?\n" +
//                            "where id = ?");
//            preparedStatement.setString(1, user.getName());
//            preparedStatement.setString(2, user.getEmail());
//            preparedStatement.setString(3, user.getCountry());
//            preparedStatement.setString(4, user.getId()+"");
//            row = preparedStatement.executeUpdate();
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//
//    @Override
//    public void deleteUser(int id) {
//        try {
//            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
//                    ("delete from user\n" +
//                    "where id = ?");
//            preparedStatement.setInt(1,id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
////        userMap.remove(id);
//    }
//
//    @Override
//    public User findId(int id) {
//        User user = null;
//        try {
//            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
//                    ("select * from user\n" +
//                    "                    where id = ?");
//            preparedStatement.setInt(1,id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                String name = resultSet.getString("name");
//                String email = resultSet.getString("email");
//                String country = resultSet.getString("country");
//                user = new User( name, email, country);
//            }
//        } catch (SQLException e){
//            System.out.println(e);
//        }
//        return user;
//    }
//
//    @Override
//    public User search(String search) {
//        List<String> stringList = new ArrayList<>();
//        try {
//            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
//                    ("select * from user\n" +
//                            "        where `name` Like concat ('%',?,'%')");
//            preparedStatement.setString(1,search);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()){
//                String abc = resultSet.getString("name");
//                stringList.add(abc);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return (User) stringList;
//
//    }
}
