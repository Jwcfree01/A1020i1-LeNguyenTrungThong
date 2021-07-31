package model;

import model.bean.Candidate;
import model.bean.CandidateExperience;
import model.bean.CandidateFresher;
import model.bean.CandidateIntern;

import java.sql.SQLException;
import java.util.List;

public interface CRUD_Interface {
    List<CandidateFresher> findCandidateFresher();
    List<CandidateIntern> findCandidateIntern();
    List<CandidateExperience> findCandidateExperience();
    boolean addCandidateFresher(CandidateFresher candidateFresher);
    boolean addCandidateIntern(CandidateIntern candidateIntern );
    boolean addCandidateExperience(CandidateExperience candidateExperience);
    void editCandidate(int id) throws SQLException;
    void deleteCandidate(int id);
    Candidate findIdFresher(int id);
    Candidate search(String search);
}
