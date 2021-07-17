package model.service;

import model.bean.Candidate;
import model.bean.CandidateExperience;
import model.bean.CandidateFresher;
import model.bean.CandidateIntern;
import model.repository.CandidateRepository;
import model.repository.CandidateRepositoryImpl;

import java.util.List;

public class CandidateServiceImpl implements CandidateService {
    CandidateRepository candidateRepository = new CandidateRepositoryImpl();


    @Override
    public List<CandidateFresher> findCandidateFresher() {
        return this.candidateRepository.findCandidateFresher();
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
    public boolean addCandidateFresher(CandidateFresher candidateFresher) {
        return this.candidateRepository.addCandidateFresher(candidateFresher);
    }

    @Override
    public boolean addCandidateIntern(CandidateIntern candidateIntern) {
        return this.candidateRepository.addCandidateIntern(candidateIntern);
    }

    @Override
    public boolean addCandidateExperience(CandidateExperience candidateExperience) {
        return this.candidateRepository.addCandidateExperience(candidateExperience);
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
}
