package tools;

class GymMembership {

    String memberName;
    boolean membershipType;
    int membershipDuration;

    public GymMembership(String mn, boolean mt, int md) {
        this.memberName = mn;
        this.membershipType = mt;
        this.membershipDuration = md;
    }
}

class PremiumMembership extends GymMembership {

    boolean personalTrainerAvailability;
    boolean spaAccess;

    public PremiumMembership(String mn, boolean mt, int md, boolean pta, boolean sa) {
        super(mn, mt, md);
        this.personalTrainerAvailability = pta;
        this.spaAccess = sa;
    }
}