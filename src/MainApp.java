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

        area.setArea(0,0);
        area.setArea(1,1);
        area.setArea(2,2);
        area.setArea(3,3);
        area.setArea(4,4);
        area.setArea(5,5);
        area.setArea(6,4);
        area.setArea(7,3);
        area.setArea(8,2);
        area.setArea(9,1);
        area.setArea(10,0);
        area.setArea(11,1);
        area.setArea(12,2);
        area.setArea(13,3);
        area.setArea(14,4);
        area.setArea(15,5);
        area.setArea(16,4);
        area.setArea(17,3);
        area.setArea(18,2);

        area.printArea();

    }
}
