package model;

import model.bean.Candidate;
import model.bean.CandidateExperience;
import model.bean.CandidateFresher;
import model.bean.CandidateIntern;

import java.util.List;

public interface CRUD_Interface {
    List<CandidateFresher> findCandidateFresher();
    List<CandidateIntern> findCandidateIntern();
    List<CandidateExperience> findCandidateExperience();
    boolean addCandidateFresher(CandidateFresher candidateFresher);
    boolean addCandidateIntern(CandidateIntern candidateIntern );
    boolean addCandidateExperience(CandidateExperience candidateExperience);
    void editCandidate(Candidate candidate);
    void deleteCandidate(int id);
    Candidate findId(int id);
    Candidate search(String search);
}
