public class MainApp {

    public static void main (String [] args){

        int longitude = 19;
        int latitude = 19;
        int cells = 19;

        Area area = new Area(longitude,latitude, cells);

        area.frequency.generateFrequencies();

        area.frequency.addCell("A");
        area.frequency.addCell("B");
        area.frequency.addCell("C");
        area.frequency.addCell("D");
        area.frequency.addCell("E");
        area.frequency.addCell("F");
        area.frequency.addCell("G");
        area.frequency.addCell("H");
        area.frequency.addCell("I");
        area.frequency.addCell("J");
        area.frequency.addCell("K");
        area.frequency.addCell("L");
        area.frequency.addCell("M");
        area.frequency.addCell("N");
        area.frequency.addCell("O");
        area.frequency.addCell("P");
        area.frequency.addCell("Q");
        area.frequency.addCell("R");
        area.frequency.addCell("S");

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
