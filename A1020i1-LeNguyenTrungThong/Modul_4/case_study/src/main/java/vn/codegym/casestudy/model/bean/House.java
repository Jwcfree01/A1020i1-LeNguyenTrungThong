//package vn.codegym.casestudy.model.bean;
//
//public class House extends Service {
//    private String standardRoom;
//    private String descriptionOther;
//    private String numberOfFloor;
//
//    public House() {
//    }
//
//    public House(String standardRoom, String descriptionOther, String numberOfFloor) {
//        this.standardRoom = standardRoom;
//        this.descriptionOther = descriptionOther;
//        this.numberOfFloor = numberOfFloor;
//    }
//
//    public House(String nameService, double areaService, double costService, int maxPeople, String rentTypeId, String standardRoom, String descriptionOther, String numberOfFloor) {
//        super(nameService, areaService, costService, maxPeople, rentTypeId);
//        this.standardRoom = standardRoom;
//        this.descriptionOther = descriptionOther;
//        this.numberOfFloor = numberOfFloor;
//    }
//
//    public String getStandardRoom() {
//        return standardRoom;
//    }
//
//    public void setStandardRoom(String standardRoom) {
//        this.standardRoom = standardRoom;
//    }
//
//    public String getDescriptionOther() {
//        return descriptionOther;
//    }
//
//    public void setDescriptionOther(String descriptionOther) {
//        this.descriptionOther = descriptionOther;
//    }
//
//    public String getNumberOfFloor() {
//        return numberOfFloor;
//    }
//
//    public void setNumberOfFloor(String numberOfFloor) {
//        this.numberOfFloor = numberOfFloor;
//    }
//
//    @Override
//    public String showInfor() {
//        return super.toString() +
//                "standardRoom" + getStandardRoom() + '\n' +
//                "descriptionOther" + getDescriptionOther() + '\n'+
//                "numberOfFloor" + getNumberOfFloor();
//    }
//}
