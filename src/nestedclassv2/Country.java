package nestedclassv2;

public class Country {

    public String name;
    public int population;
    public CapitalCity capCity;
    
    public Country() {
    }

    public Country(String name, int population, String capCity) {
        this.name = name;
        this.population = population;
        this.capCity = new CapitalCity(capCity);
    }

    public void setCountry(String name) {
        this.name = name;
    }

    public String getCountry() {
        return name;
    }

    public void setPop(int population) {
        this.population = population;
    }

    public int getPop() {
        return population;
    }

    public String getCapCity() {
        return capCity.name;
    }

    private class CapitalCity {

        private String name;

        public CapitalCity(String name) {
            this.name = name;
        }

        public void setCapitalCity(String name) {
            this.name = name;
        }

        public String getCity() {
            return name;
        }
    }
}
