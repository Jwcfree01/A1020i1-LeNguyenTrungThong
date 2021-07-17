package model.repository;

import model.bean.Candidate;
import model.bean.CandidateExperience;
import model.bean.CandidateFresher;
import model.bean.CandidateIntern;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CandidateRepositoryImpl implements CandidateRepository {

    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<CandidateFresher> findCandidateFresher() {
        List<CandidateFresher> candidateFreshersList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Candidate_Fresher");
            CandidateFresher candidate = null;
            while (resultSet.next()){
                candidate = new CandidateFresher();
                candidate.setCandidateID(resultSet.getInt("id"));
                candidate.setFullName(resultSet.getString("name"));
                candidate.setBirthDay(resultSet.getString("birthday"));
                candidate.setPhone(resultSet.getString("phone"));
                candidate.setEmail(resultSet.getString("email"));
                candidate.setCandidateType(resultSet.getInt("candidate_type"));
                candidate.setCandidateCount(resultSet.getInt("candidate_count"));
                candidate.setCertificated(resultSet.getString("certificated"));
                candidate.setGraduationDate(resultSet.getString("graduationDate"));
                candidate.setGraduationRank(resultSet.getString("graduationRank"));
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

    @Override
    public List<CandidateIntern> findCandidateIntern() {
        return null;
    }

    @Override
    public List<CandidateExperience> findCandidateExperience() {
        return null;
    }

    @Override
    public boolean addCandidateFresher(CandidateFresher candidateFresher ) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into candidate_fresher (id, name, birthday, phone, email, candidate_type, " +
                            "candidate_count, certificated, graduationDate, graduationRank, education)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, candidateFresher.getCandidateID());
            preparedStatement.setString(2, candidateFresher.getFullName());
            preparedStatement.setString(3,candidateFresher.getBirthDay());
            preparedStatement.setString(4, candidateFresher.getPhone());
            preparedStatement.setString(5, candidateFresher.getEmail());
            preparedStatement.setInt(6, candidateFresher.getCandidateType());
            preparedStatement.setInt(7, candidateFresher.getCandidateCount());
            preparedStatement.setString(8, candidateFresher.getCertificated());
            preparedStatement.setString(9, candidateFresher.getGraduationDate());
            preparedStatement.setString(10, candidateFresher.getGraduationRank());
            preparedStatement.setString(11, candidateFresher.getEducation());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row>0;
    }

    @Override
    public boolean addCandidateIntern(CandidateIntern candidateIntern) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into candidate_intern (id, name, birthday, phone, email, candidate_type, " +
                            "candidate_count, certificated, majors, semester, universityName)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, candidateIntern.getCandidateID());
            preparedStatement.setString(2, candidateIntern.getFullName());
            preparedStatement.setString(3,candidateIntern.getBirthDay());
            preparedStatement.setString(4, candidateIntern.getPhone());
            preparedStatement.setString(5, candidateIntern.getEmail());
            preparedStatement.setInt(6, candidateIntern.getCandidateType());
            preparedStatement.setInt(7, candidateIntern.getCandidateCount());
            preparedStatement.setString(8, candidateIntern.getCertificated());
            preparedStatement.setString(9, candidateIntern.getMajors());
            preparedStatement.setString(10, candidateIntern.getSemester());
            preparedStatement.setString(11, candidateIntern.getUniversityName());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row>0;
    }

    @Override
    public boolean addCandidateExperience(CandidateExperience candidateExperience) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into candidate_experience (id, name, birthday, phone, email, candidate_type, " +
                            "candidate_count, certificated, expInYear, proSkill)" +
                            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, candidateExperience.getCandidateID());
            preparedStatement.setString(2, candidateExperience.getFullName());
            preparedStatement.setString(3,candidateExperience.getBirthDay());
            preparedStatement.setString(4, candidateExperience.getPhone());
            preparedStatement.setString(5, candidateExperience.getEmail());
            preparedStatement.setInt(6, candidateExperience.getCandidateType());
            preparedStatement.setInt(7, candidateExperience.getCandidateCount());
            preparedStatement.setString(8, candidateExperience.getCertificated());
            preparedStatement.setInt(9, candidateExperience.getExpInYear());
            preparedStatement.setString(10, candidateExperience.getProSkill());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row>0;
    }

    @Override
    public void editCandidate(Candidate candidate) {

    }

    @Override
    public void deleteCandidate(int id) {

    }

    @Override
    public Candidate findId(int id) {
        return null;
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
