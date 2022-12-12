
package helpers.random;

import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Location {

    @SerializedName("city")
    private String mCity;
    @SerializedName("coordinates")
    private Coordinates mCoordinates;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("postcode")
    private Long mPostcode;
    @SerializedName("state")
    private String mState;
    @SerializedName("street")
    private Street mStreet;
    @SerializedName("timezone")
    private Timezone mTimezone;

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public Coordinates getCoordinates() {
        return mCoordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        mCoordinates = coordinates;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public Long getPostcode() {
        return mPostcode;
    }

    public void setPostcode(Long postcode) {
        mPostcode = postcode;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public Street getStreet() {
        return mStreet;
    }

    public void setStreet(Street street) {
        mStreet = street;
    }

    public Timezone getTimezone() {
        return mTimezone;
    }

    public void setTimezone(Timezone timezone) {
        mTimezone = timezone;
    }

}
