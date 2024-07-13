import com.google.gson.annotations.SerializedName;

public class Monedas {
    @SerializedName("conversion_rates")
    private String conversion_rates;

    public Monedas(String conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public String getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(String conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
