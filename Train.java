class Train {
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    void build(int seats, int firstClass, int secondClass) {
        this.nTotSeats = seats;
        this.nFirstClassSeats = firstClass;
        this.nSecondClassSeats = secondClass;
    }

    void reserveFirstClassSeats(int seats) {
        this.nFirstClassReservedSeats += seats;
    }

    void reserveSecondClassSeats(int seats) {
        this.nSecondClassReservedSeats += seats;
    }

    double getTotOccupancyRatio() {
        double ratio = (this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) * 100.0 / this.nTotSeats;
        return ratio;
    }

    double getFirstClassOccupancyRatio() {
        double ratio = this.nFirstClassReservedSeats * 100.0 / this.nFirstClassSeats;
        return ratio;
    }

    double getSecondClassOccupancyRatio() {
        double ratio = this.nSecondClassReservedSeats * 100.0 / this.nSecondClassSeats;
        return ratio;
    }

    void deleteAllReservations() {
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
}