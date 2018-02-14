package cs2340.gatech.edu.lab3.model;

import java.io.Serializable;

/**
 * Created by sophiamarcus on 2/7/18.
 *
 * Represents the various class standings
 */

public enum ClassStanding implements Serializable{
    FRESHMAN("FR"),
    SOPHOMORE("SO"),
    JUNIOR("JR"),
    SENIOR("SR");

    private final String classStanding;

    ClassStanding(String pclassStanding) {
        classStanding = pclassStanding;
    }

    public String getClassStanding() {
        return classStanding;
    }

    public String toString() {
        return classStanding;
    }
}
