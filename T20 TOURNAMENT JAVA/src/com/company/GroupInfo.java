package com.company;

public class GroupInfo {
    private String[] groupInfo;

    public GroupInfo(String[] groupInfo){
        this.groupInfo = groupInfo;}

    public String[] getGroupInfo(){
        return groupInfo;}

    public void setGroupInfo(String[] groupInfo) {
        this.groupInfo = groupInfo;
    }

    public void ViewingGroupDetails(){
        for(int i=0; i< groupInfo.length;i++){
            //System.out.println("---Please select the respective Number of the Group to choose---");
            System.out.print(i+1 + "-");
            System.out.print(groupInfo[i]);
            System.out.println();
        }
    }
}
