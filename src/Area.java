
public class Area {

    Frequency frequency ;
    int [][] locations ;
    int count;

    public Area(int longitude, int latitude, int cells){
        locations = new int [longitude][latitude];
        frequency = new Frequency(cells);
    }

    public void setArea(int longitude, int latitude){

        locations[longitude][latitude] = frequency.cells[count].getFrequency();
        count++;
    }

    public void printArea(){
        System.out.println();

        for (int k=0; k<frequency.cells.length; k++){
            if (k == 0){
                System.out.print("    "+frequency.cells[k].getName()+"    ");
                continue;
            }
            System.out.print(frequency.cells[k].getName()+"    ");
        }

        System.out.println();

        for (int i=0; i<locations.length; i++){
            System.out.print("-  ");

            for (int j=0; j<locations[i].length; j++){

                if (locations[j][i] < 10){
                    System.out.print(" ");
                }
                if (locations[j][i] == 0){
                    System.out.print("    ");
                    continue;
                }
                System.out.print(locations[j][i] + "  ");
            }
            System.out.println();
        }
    }
}
