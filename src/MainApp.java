public class MainApp {

    public static void main (String [] args){

        int longitude = 19;
        int latitude = 19;
        String [] cells = {"A", "B", "C", "D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S" };

        Area area = new Area(longitude,latitude, cells.length);
        area.frequency.generateFrequencies();

        for (String cell : cells) {
            area.frequency.addCell(cell);
        }

        area.frequency.locateFrequency();

        int [] latList = {0,1,2,3,4,5,4,3,2,1,0,1,2,3,4,5,4,3,2};

        for (int j=0; j<longitude; j++){
            area.setArea(j,latList[j]);
        }

        area.printArea();

    }
}
