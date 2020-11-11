/*package week02;

import references.references.socialnetwork.Member;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        List<String> nameList = new ArrayList<>();
        for (MeetingRoom name : meetingRooms) {
            nameList.add(name.getName());
        }
        System.out.println(nameList);
    }

    public void printNamesReverse() {
        List<String> nameList = new ArrayList<>();
        List<String> nameListRevers = new ArrayList<>();
        for (MeetingRoom name : meetingRooms) {
            nameList.add(name.getName());

            Collections.sort(nameList, Collections.reverseOrder());
        }
        System.out.println(nameList);
    }

    public void printEvenNames() {
        List<String> nameList = new ArrayList<>();
        List<String> nameListEven = new ArrayList<>();
        for (MeetingRoom name : meetingRooms) {
            nameList.add(name.getName());
        }
        for (int i = 0; i < nameList.size(); i += 2) {
            nameListEven.add(nameList.get(i));
        }

        System.out.println(nameListEven);
    }

    public void printAreas() {
        List<String> areaList = new ArrayList<>();
        for (MeetingRoom name : meetingRooms) {
            areaList.add("\nTárgyaló neve: " + name.getName() + "; Tárgyaló szélessége: " + name.getWidth() + "; Tárgyaló hosszúsága: " + name.getLenght() + "; Tárgyaló területe: " + name.getArea());
        }
        System.out.println(areaList);
    }

    public void printMeetingRoomsWithName(String name) {
        List<String> printMeetingRoomsWithNameList = new ArrayList<>();
        for (MeetingRoom name1 : meetingRooms) {
            if (name1.getName().equals(name)) {
                printMeetingRoomsWithNameList.add("Tárgyaló neve: " + name1.getName() + "; Tárgyaló szélessége: " + name1.getWidth() + "; Tárgyaló hosszúsága: " + name1.getLenght() + "; Tárgyaló területe: " + name1.getArea());
            }}
            System.out.println(printMeetingRoomsWithNameList);
        }

    public void printMeetingRoomsContains(String part) {
        List<String> printMeetingRoomsWithNameList = new ArrayList<>();
        for (MeetingRoom name1 : meetingRooms) {

            if (toUpperCase(name1.getName()).indexOf(toUpperCase(part)) != -1) {
                printMeetingRoomsWithNameList.add("Tárgyaló neve: " + name1.getName() + "; Tárgyaló szélessége: " + name1.getWidth() + "; Tárgyaló hosszúsága: " + name1.getLenght() + "; Tárgyaló területe: " + name1.getArea());
            }}
        System.out.println(printMeetingRoomsWithNameList);
    }

    public void printAreaLargerThan(int area) {
        List<String> printMeetingRoomsWithNameList = new ArrayList<>();
        for (MeetingRoom name1 : meetingRooms) {

            if (name1.getArea()> area){
                printMeetingRoomsWithNameList.add("Tárgyaló neve: " + name1.getName() + "; Tárgyaló szélessége: " + name1.getWidth() + "; Tárgyaló hosszúsága: " + name1.getLenght() + "; Tárgyaló területe: " + name1.getArea());
            }}
        System.out.println(printMeetingRoomsWithNameList);
    }



    }

*/
