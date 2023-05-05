package helpers.random;

import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Coordinates {

    @SerializedName("latitude")
    private String mLatitude;
    @SerializedName("longitude")
    private String mLongitude;

    public String getLatitude() {
        return mLatitude;
    }

    public void setLatitude(String latitude) {
        mLatitude = latitude;
    }

    public String getLongitude() {
        return mLongitude;
    }

    public void setLongitude(String longitude) {
        mLongitude = longitude;
    }

}
