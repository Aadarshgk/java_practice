public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        int bucket;
        double temp;

        temp= Math.ceil((width*height)/areaPerBucket);
        return bucket= (int)(temp - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double temp;
        int bucket;

        temp= Math.ceil((width*height)/areaPerBucket);
        return bucket= (int)temp;

    }


}
