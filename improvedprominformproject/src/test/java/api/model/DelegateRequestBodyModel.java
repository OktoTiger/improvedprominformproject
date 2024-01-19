package api.model;

public class DelegateRequestBodyModel {
    public Integer calcFio = 0;
    public Integer committeeId = 0;
    public Integer countyId = 0;
    public String firstName;
    public Integer fractionGroupId = 0;
    public Integer fractionId;
    public Integer id;
    public Integer idd;
    public String lastName;
    public String middleName;
    public Integer palateId;
    public String photo;
    public Integer photoId;
    public String shortFio;

    private DelegateRequestBodyModel(DelegatBuilder delegatBuilder) {
        this.calcFio = delegatBuilder.calcFio;
        this.committeeId = delegatBuilder.committeeId;
        this.countyId = delegatBuilder.countyId;
        this.firstName = delegatBuilder.firstName;
        this.fractionGroupId = delegatBuilder.fractionGroupId;
        this.fractionId = delegatBuilder.fractionId;
        this.id = delegatBuilder.id;
        this.idd = delegatBuilder.idd;
        this.lastName = delegatBuilder.lastName;
        this.middleName = delegatBuilder.middleName;
        this.palateId = delegatBuilder.palateId;
        this.photo = delegatBuilder.photo;
        this.photoId = delegatBuilder.photoId;
        this.shortFio = delegatBuilder.shortFio;
    }

    public static DelegatBuilder builder() {
        return new DelegatBuilder();
    }

    public static class DelegatBuilder {
        public Integer calcFio = 0;
        public Integer committeeId = 0;
        public Integer countyId = 0;
        public String firstName;
        public Integer fractionGroupId = 0;
        public Integer fractionId;
        public Integer id;
        public Integer idd;
        public String lastName;
        public String middleName;
        public Integer palateId;
        public String photo;
        public Integer photoId;
        public String shortFio;

        public DelegatBuilder setCalcFio(Integer calcFio) {
            this.calcFio = calcFio;
            return this;
        }

        public DelegatBuilder setCommitteeId(Integer committeeId) {
            this.committeeId = committeeId;
            return this;
        }

        public DelegatBuilder setCountyId(Integer countyId) {
            this.countyId = countyId;
            return this;
        }

        public DelegatBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public DelegatBuilder setFractionGroupId(Integer fractionGroupId) {
            this.fractionGroupId = fractionGroupId;
            return this;
        }

        public DelegatBuilder setFractionId(Integer fractionId) {
            this.fractionId = fractionId;
            return this;
        }

        public DelegatBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public DelegatBuilder setIdd(Integer idd) {
            this.idd = idd;
            return this;
        }

        public DelegatBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public DelegatBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public DelegatBuilder setPalateId(Integer palateId) {
            this.palateId = palateId;
            return this;
        }

        public DelegatBuilder setPhoto(String photo) {
            this.photo = photo;
            return this;
        }

        public DelegatBuilder setPhotoId(Integer photoId) {
            this.photoId = photoId;
            return this;
        }

        public DelegatBuilder setShortFio(String shortFio) {
            this.shortFio = shortFio;
            return this;
        }

        public DelegateRequestBodyModel build() {
            return new DelegateRequestBodyModel(this);
        }
    }


}
