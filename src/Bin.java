/**
 * Created by softish on 2016-08-09.
 *
 * Modelling an unsigned dynamic data type. -> bigintiger ...?
 */
public class Bin {

    private boolean[] number;

    public Bin(int bitWidth) {
        number = new boolean[bitWidth];
    }

    public void setNumber(String number) {
        this.number[2] = true;

    }

    protected void inputDecoder(String input) {
        boolean[] num;
        if(!isInputBinary()) {
            String binaryRepresentation = toBin(input);
            num = new boolean[binaryRepresentation.length()];
        }
        num = new boolean[input.length()];




        for (int i = 0; i < num.length; i++) {
            boolean b = num[i];

        }
    }

    protected String toBin(String input) {
        return "";
    }

    protected boolean isInputBinary() {
        return false;
    }


    public String getInternal() {
        int num = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]) {
                num += (int) Math.pow(2, i);
            }

        }
        return Integer.toString(num);
    }



}
