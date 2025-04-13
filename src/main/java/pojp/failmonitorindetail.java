package pojp;

public class failmonitorindetail {

    public String hour;

    public String city;
    public String province;
    public String country;

    public String fail_reason;

    public Integer fail_count;

    public double fail_ratio;


    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getFail_reason() {
        return fail_reason;
    }

    public void setFail_reason(String fail_reason) {
        this.fail_reason = fail_reason;
    }

    public Integer getFail_count() {
        return fail_count;
    }

    public void setFail_count(Integer fail_count) {
        this.fail_count = fail_count;
    }

    public double getFail_ratio() {
        return fail_ratio;
    }

    public void setFail_ratio(double fail_ratio) {
        this.fail_ratio = fail_ratio;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
