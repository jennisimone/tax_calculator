package tax;

class PetrolTaxCalculator extends TaxCalculator {

    @Override
    int calculateTax(Vehicle vehicle) {
        if (vehicle.getCo2Emissions() > 0 && vehicle.getCo2Emissions() <= 50){
            return 10;
        } else if (vehicle.getCo2Emissions() > 51 && vehicle.getCo2Emissions() <= 75){
            return 25;
        } else if (vehicle.getCo2Emissions() >= 76 && vehicle.getCo2Emissions() <= 90){
            return 105;
        } else if (vehicle.getCo2Emissions() >= 91 && vehicle.getCo2Emissions() <= 100){
            return 125;
        } else if (vehicle.getCo2Emissions() >= 101 && vehicle.getCo2Emissions() <= 110){
            return 145;
        } else if (vehicle.getCo2Emissions() >= 111 && vehicle.getCo2Emissions() <= 130){
            return 165;
        } else if (vehicle.getCo2Emissions() >= 131 && vehicle.getCo2Emissions() <= 150){
            return 205;
        } else if (vehicle.getCo2Emissions() >= 151 && vehicle.getCo2Emissions() <= 170){
            return 515;
        } else if (vehicle.getCo2Emissions() >= 171 && vehicle.getCo2Emissions() <= 190){
            return 830;
        } else if (vehicle.getCo2Emissions() >= 191 && vehicle.getCo2Emissions() <= 225){
            return 1240;
        } else if (vehicle.getCo2Emissions() >= 226 && vehicle.getCo2Emissions() <= 255){
            return 1760;
        } else if (vehicle.getCo2Emissions() > 255){
            return 2070;
        } else {
            return 0;
        }
    }
}
