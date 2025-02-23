public class War {
    public static String battle(String goodAmounts, String evilAmounts) {
        int goodCount = 0;
        int ecilCOunt = 0;
        String[] goodArr = goodAmounts.split(" ");
        String[] evilArr = evilAmounts.split(" ");
        for (int i = 0; i < goodArr.length; i++) {
            switch (i) {
                case 0:
                    goodCount += Integer.parseInt(goodArr[i]);
                    continue;
                case 1:
                    goodCount += 2 * Integer.parseInt(goodArr[i]);
                    continue;
                case 2:
                case 3:
                    goodCount += 3 * Integer.parseInt(goodArr[i]);
                    continue;
                case 4:
                    goodCount += 4 * Integer.parseInt(goodArr[i]);
                    continue;
                case 5:
                    goodCount += 10 * Integer.parseInt(goodArr[i]);
                    break;
                default:
                    break;
            }

        }
        for (int i = 0; i < evilArr.length; i++) {
            switch (i) {
                case 0:
                    ecilCOunt += Integer.parseInt(evilArr[i]);
                    continue;
                case 1:
                case 2:
                case 3:
                    ecilCOunt += 2 * Integer.parseInt(evilArr[i]);
                    continue;
                case 4:
                    ecilCOunt += 3 * Integer.parseInt(evilArr[i]);
                    continue;
                case 5:
                    ecilCOunt += 5 * Integer.parseInt(evilArr[i]);
                    continue;
                case 6:
                    ecilCOunt += 10 * Integer.parseInt(evilArr[i]);
                    continue;
                default:
                    break;
            }

        }
        if(goodCount > ecilCOunt){
            return "Battle Result: Good triumphs over Evil";
        } else if(goodCount < ecilCOunt) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }

    public static void main(String[] args) {
        System.out.println(battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }
}

