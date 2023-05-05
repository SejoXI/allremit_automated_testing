package helpers.random;

import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Timezone {

    @SerializedName("description")
    private String mDescription;
    @SerializedName("offset")
    private String mOffset;

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getOffset() {
        return mOffset;
    }

    public void setOffset(String offset) {
        mOffset = offset;
    }

}
