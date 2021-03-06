package Part_4;

import java.nio.file.Paths;
import java.util.Scanner;

public class Sport_Statistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String filename = sc.nextLine();

        int counter = 0;
        int lossCounter = 0;
        int winCounter = 0;

        System.out.println("Enter team: ");
        String teamName = sc.nextLine();

        try (Scanner file = new Scanner(Paths.get(filename))) {

            while(file.hasNextLine()) {

                String lines = file.nextLine();

                String[] pieces = lines.split(",");

                if(pieces[0].contains(teamName)) {

                    counter++;

                    if(Integer.valueOf(pieces[2]) > Integer.valueOf(pieces[3])) {

                        winCounter++;

                    } else {

                        lossCounter++;

                    }

                }

                if(pieces[1].contains(teamName)) {

                    counter++;

                    if(Integer.valueOf(pieces[3]) > Integer.valueOf(pieces[2])) {

                        winCounter++;

                    } else {

                        lossCounter++;

                    }

                }

            }

            System.out.println("Games: " + counter);
            System.out.println("Wins: " + winCounter);
            System.out.println("Losses: " + lossCounter);

        } catch (Exception e) {

            System.out.println("The file " + filename + " could not be found.");

        }


    }

}
