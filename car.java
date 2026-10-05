public class car{
    //    CarRentalSystem
    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;
    public static String companyName = "JUST Rentals";
    public static int totalCars = 0;

    public car() {
        this.plateNumber = "Unknown";
        this.carModel = "Unknown";
        this.dailyRate = 0.0;
        this.rent = false;
        totalCars++;
    }

    public car(String plateNumber, String carModel, double dailyRate) {
        this.plateNumber = plateNumber;
        this.carModel = carModel;
        setDailyRate(dailyRate);
        this.rent = false;
        totalCars++;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return rent;
    }

    public void setDailyRate(double dailyRate) {
        if (dailyRate >= 0) {
            this.dailyRate = dailyRate;
        } else {
            System.out.println("Error: Kirada maalintii ma noqon karto mid eber ka hooseysa!");
        }
    }

    public void rent() {
        if (rent) {
            System.out.println("Cilad: Gaariga " + carModel + " (Taarikada: " + plateNumber + ") horay ayuu u kireysnaa!");
        } else {
            rent = true;
            System.out.println("Guul: Gaariga " + carModel + " waa la kireeyay.");
        }
    }

    public void returnCar() {
        if (!rent) {
            System.out.println("Gaariga " + carModel + " horay looma kireysneyn, markaas lama soo celin karo.");
        } else {
            rent = false;
            System.out.println("Guul: Gaariga " + carModel + " waa la soo celiyay waana diyaar haatan.");
        }
    }

    public void displayInfo() {
        System.out.println("--- Xogta Gaariga ---");
        System.out.println("Taarikada: " + plateNumber);
        System.out.println("Nooca Gaariga: " + carModel);
        System.out.println("Kirada Maalintii: $" + dailyRate);
        System.out.println("Xaaladda Kirada: " + (rent ? "Waa la kireeyay" : "Waa diyaar"));
        System.out.println("---------------------");
    }

    public static void displayCompanyName() {
        System.out.println("Magaca Shirkadda: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("Wadarta Guud ee Gawaarida la abuuray: " + totalCars);
    }

    public static void main(String[] args) {
        displayCompanyName();
        displayTotalCars();
        System.out.println();

        System.out.println("--- 1. Abuurista Gawaarida ---");
        car car1 = new car("MOG-123", "Lamborghini Huracan", 300.0);
        car car2 = new car("MOG-456", "Toyota Corolla", 60.0);
        System.out.println();

        displayTotalCars();
        System.out.println();

        System.out.println("--- 2. Soo Bandhigida Xogta Gawaarida ---");
        car1.displayInfo();
        car2.displayInfo();
        System.out.println();
        System.out.println("--- 3. Kiraynta Gaari ---");
        car1.rent();
        System.out.println();

        System.out.println("--- 4. Isku dayga in mar labaad la kireeyo gaari horay u kiraysnaa ---");
        car1.rent();
        System.out.println();
        System.out.println("--- 5. Soo Celinta Gaariga ---");
        car1.returnCar();

        System.out.println();
        System.out.println("--- 6. Bedelka Kirada Maalintii & Hubinta Validation-ka ---");
        System.out.println("Kiradii hore ee car2: $" + car2.getDailyRate());

        car2.setDailyRate(75.0);
        System.out.println("Kirada cusub ee car2: $" + car2.getDailyRate());
        car2.setDailyRate(-50.0);
        System.out.println();
        System.out.println("--- 7. Xogta Ugu Dambeysa ee Gawaarida ---");
        car1.displayInfo();
        car2.displayInfo();
    }
}