public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carsPerHour = 221;
        if (speed <= 4){
            return speed * carsPerHour;
        } else if (speed <= 8){
            return speed * (carsPerHour * 0.9);
        } else if (speed == 9){
            return speed * (carsPerHour * 0.8);
        } else if (speed == 10){
            double speed10 =  speed * (carsPerHour * 0.77);
            speed10 = Math.round(speed10*100)/100.0d;
            return speed10;
        } return 0;
    }

    public int workingItemsPerMinute(int speed) {
        int carsPerHour = 221;
        if (speed<=4) {
            int rate = (int) Math.floor((carsPerHour * speed)/60);
            return rate;
        } else if (speed >= 5 && speed <=8) {
            int rate = (int) Math.floor((carsPerHour*speed*0.9)/60);
            return rate;
        } else if (speed == 9) {
            int rate = (int) Math.floor((carsPerHour*speed*0.8)/60);
            return rate;
        }else if (speed == 10) {
            int rate = (int) Math.floor((carsPerHour*speed*0.77)/60);
            return rate;
        }
        return 1;
        }
    }

