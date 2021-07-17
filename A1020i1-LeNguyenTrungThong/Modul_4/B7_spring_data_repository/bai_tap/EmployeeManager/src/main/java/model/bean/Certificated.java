package model.bean;

import java.util.Date;

public class Certificated {
    private int CertificatedId;
    private String CertificatedName;
    private String CertificatedRank;
    private Date CertificatedDate;

    public Certificated() {
    }

    public Certificated(int certificatedId, String certificatedName, String certificatedRank, Date certificatedDate) {
        CertificatedId = certificatedId;
        CertificatedName = certificatedName;
        CertificatedRank = certificatedRank;
        CertificatedDate = certificatedDate;
    }

    public int getCertificatedId() {
        return CertificatedId;
    }

    public void setCertificatedId(int certificatedId) {
        CertificatedId = certificatedId;
    }

    public String getCertificatedName() {
        return CertificatedName;
    }

    public void setCertificatedName(String certificatedName) {
        CertificatedName = certificatedName;
    }

    public String getCertificatedRank() {
        return CertificatedRank;
    }

    public void setCertificatedRank(String certificatedRank) {
        CertificatedRank = certificatedRank;
    }

    public Date getCertificatedDate() {
        return CertificatedDate;
    }

    public void setCertificatedDate(Date certificatedDate) {
        CertificatedDate = certificatedDate;
    }


}
