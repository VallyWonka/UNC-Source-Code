package hw.zoo.logging;

import hw.zoo.model.Species;

import java.util.Date;

public class InhibitionLog {
    private Date checkInDate;
    private Date checkOutDate;
    private Species animalSpecies;
    private String animalName;
    private int cageNumber;

    public InhibitionLog(final Date checkInDate,
                         final Date checkOutDate,
                         final Species animalSpecies,
                         final String animalName,
                         final int cageNumber) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.animalSpecies = animalSpecies;
        this.animalName = animalName;
        this.cageNumber = cageNumber;
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
        return cageNumber;
    }

    @Override
    public String toString() {
        return "InhibitionLog{" +
                "checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", cageNumber=" + cageNumber +
                ", animalSpecies=" + animalSpecies +
                ", animalName='" + animalName + '\'' +
                '}';
    }
}
