import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do want to add cells and latitudes?... Type 'Yes' for to add... Type 'No' for continue:");
        String answer = scanner.next();

        //This is a list of cells to be used for frequency...
        String [] cellsList = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S"};
        //This is a list of latitude locations for cells...
        int [] latitudeList = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 4, 3, 2};

        //This are the new list of latitude to be used if cells are being added...
        List<Integer> newLatitude = new ArrayList<>();
        //This are the new list of cells to be used if cells are being added...
        List<String> newCells = new ArrayList<>();

        //The following is the lengths of latitudes and cells lists...
        int latitudeLength = latitudeList.length;
        int cellsLength = cellsList.length;

        //A flag to check if there is new cells added or not...
        boolean isAdded = false;

        if (answer.equalsIgnoreCase("Yes")){
            isAdded = true;
            System.out.print("Enter a number of a cells to be added: ");
            int number = scanner.nextInt();

            //
            for (int j=0; j < latitudeLength; j++){
                newLatitude.add(latitudeList[j]);
                newCells.add(cellsList[j]);
            }

            for (int i=latitudeLength; i<(latitudeLength+number); i++){
                System.out.print("Enter a name of a cell to be added: ");
                String name = scanner.next();
                System.out.print("Enter a latitude location of a cell to be added: ");
                int latitude = scanner.nextInt();
                newCells.add(name);
                newLatitude.add(latitude);
            }

            //The following is the lengths of new latitudes and cells lists...
            latitudeLength = newLatitude.size();
            cellsLength = newCells.size();
        }

        //latitudeList and cellsList must be always equal in lengths...
        if (cellsLength == latitudeLength){

            //This is a longitude size for an area...
            int longitude = latitudeLength;

            Area area = new Area(longitude,latitudeLength, cellsLength);

            //This statement generate 6 unique frequencies...
            area.frequency.generateFrequencies();

            //This For-Loop in these statement add list of cells names to another list...
            if (isAdded){
                for (String newCell : newCells) {
                    area.frequency.addCell(newCell);
                }

            }else{
                for (String cell : cellsList) {
                    area.frequency.addCell(cell);
                }
            }
            //This statement locate frequencies to cells...
            area.frequency.locateFrequency();

            //This For-Loop in these statement sets the area by placing cells on their relevant locations...
            if (isAdded){
                for (int i=0; i<newLatitude.size(); i++){
                    area.setArea(i,newLatitude.get(i));
                }

            }else{
                for (int j=0; j<latitudeList.length; j++){
                    area.setArea(j,latitudeList[j]);
                }
            }
            System.out.println();
            System.out.println("---GRAPH---");

            //This statement prints the graph for an area with cells frequencies, with results...
            area.printArea();
        }
        else if (cellsLength > latitudeLength){
            System.out.print("---ERROR!... There is shortage number of latitude locations for the cells, add another location for an extra cell !!!---");
        }
        else {
            System.out.print("---ERROR!... There is shortage number of cells for latitude locations, add another cell for an extra location !!!---");
        }
    }
}
