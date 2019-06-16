package io.zipcoder;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.abs;

public class Music {

    private String[] playlist;
    private Integer result;

    public Music(String[] playlist) {
        this.playlist = playlist;
    }


    public Integer selection(String [] playlist, Integer startIndex, String selection){
        ArrayList<String> newPLayList = new ArrayList<>(Arrays.asList(playlist));
        Integer forward = 0;
        Integer backward = 0;
        ArrayList<Integer> selectionIndices = new ArrayList<>();
        Integer result;
        for ( int i = (startIndex + 1) ; i <= newPLayList.indexOf(selection) ; i++) {
            forward++;
            if (i >= newPLayList.size() - 1) {
                i = 0;
            }
        }
        for (int j = (startIndex-1); j >= 0 ; j--) {
            backward++;
            if (j <= 0){
                j = newPLayList.size() - 1;
            }
        }   if (backward <= forward){
            return backward;
        }

        return forward;
        }



    public String[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }
}
