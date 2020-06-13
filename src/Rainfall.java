public class Rainfall {

    public static double mean(String town, String strng) {

        String townRecord = new String();
        townRecord = getTownRecord(town, strng, townRecord);
        System.out.printf("Town: %s; town.length:%d; townRecord.length:%d \n", town, town.length(), townRecord.length());

        if (townRecord.length() > town.length()) {
            String dataSetString = extractDataSet(townRecord);
            String[] dataSetArrayWithMonths = extractDataSetArray(dataSetString);
            Double[] dataSetArray = removeMonths(dataSetArrayWithMonths);
            return (calcMean(dataSetArray, dataSetArray.length));
        }

        return -1;
    }

    public static double variance(String town, String strng) {
        String townRecord = new String();
        townRecord = getTownRecord(town, strng, townRecord);

        if (townRecord.length() > town.length()) {
            String dataSetString = extractDataSet(townRecord);
            String[] dataSetArrayWithMonths = extractDataSetArray(dataSetString);
            Double[] dataSetArray = removeMonths(dataSetArrayWithMonths);
            double mean = (calcMean(dataSetArray,dataSetArray.length));

            double variance = 0;
            for (int i = 0; i < dataSetArray.length; i++) {
                variance += (dataSetArray[i] - mean) * (dataSetArray[i] - mean);
            }
            variance /= dataSetArray.length;
            return variance;
        }

        return -1;
    }

    private static double calcMean(Double[] dataSetArray, int length) {
        double doub = 0;
        for (Double d:dataSetArray) {
            doub += d;
        }
        return doub / length;
    }

    private static Double[] removeMonths(String[] dataSetArrayWithMonths) {
        Double[] data = new Double[dataSetArrayWithMonths.length];
        int i = 0;
        for (String str: dataSetArrayWithMonths) {
            data[i] = Double.valueOf(str.split(" ")[1]);
            i++;
        }
        return data;
    }

    private static String[] extractDataSetArray(String dataSetString) {
        String[] dataArray = dataSetString.split(",");
        return dataArray;
    }

    private static String extractDataSet(String townRecord) {
        String[] townArray = townRecord.split(":");
        return townArray[1];
    }

    private static String getTownRecord(String town, String strng, String townRecord) {
        String[] stray = strng.split("\n");
        for (String str : stray) {
            if (str.contains(town)) {
                townRecord = str;
                break;
            }
        }
        return townRecord;
    }
}