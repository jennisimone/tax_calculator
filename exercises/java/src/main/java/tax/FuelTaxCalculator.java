package tax;

import java.time.LocalDate;
import java.time.Period;

class FuelTaxCalculator extends TaxCalculator {

    private boolean secondTaxPayment = false;

    FuelTaxCalculator() {
    }

    FuelTaxCalculator(boolean secondTaxPayment) {
        this.secondTaxPayment = secondTaxPayment;
    }

    @Override
    int calculateTax(Vehicle vehicle) {

        Period year = Period.ofYears(1);

        if (vehicle.getDateOfFirstRegistration().isBefore(LocalDate.now().minus(year)) && secondTaxPayment) {
            if (vehicle.getListPrice() >= 40000) {
                if (vehicle.getFuelType() == FuelType.ELECTRIC) {
                    return 310;
                } else if (vehicle.getFuelType() == FuelType.ALTERNATIVE_FUEL) {
                    return 440;
                } else {
                    return 450;
                }
            } else {
                if (vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                    return 130;
                } else if (vehicle.getFuelType().equals(FuelType.ELECTRIC)) {
                    return 0;
                } else if (vehicle.getFuelType().equals(FuelType.PETROL) || vehicle.getFuelType().equals(FuelType.DIESEL)) {
                    return 140;
                }
            }

        }

        if (vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
            if (vehicle.getCo2Emissions() == 0) return 0;
            else if (vehicle.getCo2Emissions() <= 50) return 0;
            else if (vehicle.getCo2Emissions() <= 75) return 15;
            else if (vehicle.getCo2Emissions() <= 90) return 95;
            else if (vehicle.getCo2Emissions() <= 100) return 115;
            else if (vehicle.getCo2Emissions() <= 110) return 135;
            else if (vehicle.getCo2Emissions() <= 130) return 155;
            else if (vehicle.getCo2Emissions() <= 150) return 195;
            else if (vehicle.getCo2Emissions() <= 170) return 505;
            else if (vehicle.getCo2Emissions() <= 190) return 820;
            else if (vehicle.getCo2Emissions() <= 225) return 1230;
            else if (vehicle.getCo2Emissions() <= 255) return 1750;
            return 2060;
        }

        if (vehicle.getFuelType().equals(FuelType.DIESEL)) {
            if (vehicle.getCo2Emissions() == 0) return 0;
            else if (vehicle.getCo2Emissions() <= 50) return 25;
            else if (vehicle.getCo2Emissions() <= 75) return 105;
            else if (vehicle.getCo2Emissions() <= 90) return 125;
            else if (vehicle.getCo2Emissions() <= 100) return 145;
            else if (vehicle.getCo2Emissions() <= 110) return 165;
            else if (vehicle.getCo2Emissions() <= 130) return 205;
            else if (vehicle.getCo2Emissions() <= 150) return 515;
            else if (vehicle.getCo2Emissions() <= 170) return 830;
            else if (vehicle.getCo2Emissions() <= 190) return 1240;
            else if (vehicle.getCo2Emissions() <= 225) return 1760;
            else if (vehicle.getCo2Emissions() <= 255) return 2070;
            return 2070;
        }

        if (vehicle.getFuelType().equals(FuelType.PETROL)) {
            if (vehicle.getCo2Emissions() == 0) return 0;
            else if (vehicle.getCo2Emissions() <= 50) return 10;
            else if (vehicle.getCo2Emissions() <= 75) return 25;
            else if (vehicle.getCo2Emissions() <= 90) return 105;
            else if (vehicle.getCo2Emissions() <= 100) return 125;
            else if (vehicle.getCo2Emissions() <= 110) return 145;
            else if (vehicle.getCo2Emissions() <= 130) return 165;
            else if (vehicle.getCo2Emissions() <= 150) return 205;
            else if (vehicle.getCo2Emissions() <= 170) return 515;
            else if (vehicle.getCo2Emissions() <= 190) return 830;
            else if (vehicle.getCo2Emissions() <= 225) return 1240;
            else if (vehicle.getCo2Emissions() <= 255) return 1760;
            return 2070;
        }
        return 0;
    }
}
