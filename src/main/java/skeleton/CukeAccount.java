package skeleton;

public class CukeAccount {

    private int cukeCount;
    private String cukeColour;
    private String cukeName;

    public void openAccount(int count, String cukeColour, String cukeName) {
        cukeCount = count;
        this.cukeColour = cukeColour;
        this.cukeName = cukeName;


    }

    public int howMany() {
        return cukeCount;
    }

    public int defecit(int minCukes) {

        int defecitResponse = 0;

        if( cukeCount < minCukes ) {
            defecitResponse = minCukes - cukeCount;

        }
        return defecitResponse;

    }

    public String lookAt() {
        return this.cukeName;
    }

    public String getColour() {
        return this.cukeColour;
    }


}
