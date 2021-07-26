package hw.zoo;

import hw.zoo.model.Species;

import java.util.Date;

public class InhibitionLog {
    private Date checkInDate;
    private Date checkOutDate;
    private Species animalSpecies;
    private String animalName;
    private int cageID;

    public InhibitionLog(final Date checkInDate,
                         final Date checkOutDate,
                         final Species animalSpecies,
                         final String animalName,
                         final int cageID) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.animalSpecies = animalSpecies;
        this.animalName = animalName;
        this.cageID = cageID;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date date) {
        this.checkOutDate = date;
    }

    public Species getAnimalSpecies() {
        return animalSpecies;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getCageNumber() {
        return cageID;
    }

    @Override
    public String toString() {
        return "InhibitionLog{" +
                "checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", cageID=" + cageID +
                ", animalSpecies=" + animalSpecies +
                ", animalName='" + animalName + '\'' +
                '}';
    }
}
