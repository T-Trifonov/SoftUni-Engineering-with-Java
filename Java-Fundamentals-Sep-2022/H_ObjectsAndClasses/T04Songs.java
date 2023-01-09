package H_ObjectsAndClasses;

import java.util.*;

public class T04Songs {

    static class Song {
        private String listType;
        private String nameSong;
        private String timeSong;

        public Song (String listType, String nameSong, String timeSong){
            this.listType = listType;
            this.nameSong = nameSong;
            this.timeSong = timeSong;
        }

        public String getListType() {
            return listType;
        }

        public String getNameSong() {
            return nameSong;
        }

        public String getTimeSong() {
            return timeSong;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<Song> listSongs = new ArrayList<>();

        for (int i = 0; i < num; i++) {

            String[] song = scanner.nextLine().split("_");

            String typeSong = song[0];
            String nameSong = song[1];
            String timeSong = song[2];

            Song tune = new Song(typeSong, nameSong, timeSong);

           listSongs.add(tune);

        }

        String command = scanner.nextLine();

        if (command.equals("all")){
            for (Song item: listSongs) {
                System.out.println(item.getNameSong());
            }
        } else {
            for (Song item: listSongs) {
                if (item.getListType().equals(command)){
                    System.out.println(item.getNameSong());
                }
            }
        }


    }


}
